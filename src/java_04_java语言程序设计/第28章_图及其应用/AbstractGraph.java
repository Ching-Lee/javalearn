package java_04_java语言程序设计.第28章_图及其应用;


import java.util.ArrayList;
import java.util.List;

public class AbstractGraph<V> implements Graph<V> {
    //图中的顶点
    protected List<V> vertices = new ArrayList<>();
    //图中每个顶点的邻居
    protected List<List<Edge>> neighbors = new ArrayList<>();

    protected AbstractGraph() {
    }

    //顶点和边是用数组存储的
    protected AbstractGraph(V[] vertices, int[][] edges) {
        for (int i = 0; i < vertices.length; i++) {
            //创建顶点
            addVertex(vertices[i]);
        }
        //创建边
        createAdjacencyLists(edges, vertices.length);

    }

    private void createAdjacencyLists(int[][] edges, int length) {
        for (int i = 0; i < edges.length; i++)
            addEdge(edges[i][0], edges[i][1]);
    }

    //顶点和边是用线性表存储的
    protected AbstractGraph(List<V> vertices, List<Edge> edges) {
        for (int i = 0; i < vertices.size(); i++) {
            //创建顶点
            addVertex(vertices.get(i));
        }
        //创建边
        createAdjacencyLists(edges, vertices.size());
    }

    private void createAdjacencyLists(List<Edge> edges, int length) {
        for (Edge edge : edges) {
            addEdge(edge.u, edge.v);
        }
    }


    //得到顶点数量
    @Override
    public int getSize() {
        return vertices.size();
    }

    //得到所有顶点
    @Override
    public List<V> getVertices() {
        return vertices;
    }

    //根据索引得到顶点
    @Override
    public V getVertex(int index) {
        return vertices.get(index);
    }

    //根据顶点得到索引
    @Override
    public int getIndex(V v) {
        return vertices.indexOf(v);
    }

    //根据顶点的索引得到该顶点的所有邻居顶点
    @Override
    public List<Integer> getNeighbors(int index) {
        List<Integer> result = new ArrayList<>();
        for (Edge e : neighbors.get(index))
            result.add(e.v);
        return result;
    }

    @Override
    public int getDegree(int index) {
        return neighbors.get(index).size();
    }

    @Override
    public void printEdges() {
        for (int u = 0; u < neighbors.size(); u++) {
            //根据索引得到顶点
            System.out.print(getVertex(u) + "(" + u + "):");
            //邻接边线性表，里面存储的是表示边的对象Edge，线性表套线性表
            for (Edge e : neighbors.get(u)) {
                System.out.print("(" + getVertex(e.u) + "," + getVertex(e.v) + ")");
            }
            System.out.println();
        }

    }

    @Override
    public void clear() {
        vertices.clear();
        neighbors.clear();
    }

    //添加一个顶点
    @Override
    public boolean addVertex(V v) {
        if (!vertices.contains(v)) {
            vertices.add(v);
            neighbors.add(new ArrayList<Edge>());
            return true;
        } else {
            return false;
        }
    }

    //添加一条边
    @Override
    public boolean addEdge(int u, int v) {

        return addEdge(new Edge(u, v));
    }

    private boolean addEdge(Edge e) {
        //首先判断这条边的两个顶点是否存在
        if (e.u < 0 || e.u > getSize() - 1)
            throw new IllegalArgumentException("no such index" + e.u);
        if (e.v < 0 || e.v > getSize() - 1)
            throw new IllegalArgumentException("no such index" + e.v);
        //如果neighbors邻接边线性表对应的u顶点的list中没有e这个边
        if (!neighbors.get(e.u).contains(e)) {
            neighbors.get(e.u).add(e);
            return true;
        } else {
            return false;
        }

    }


    //深度优先搜索算法
    @Override
    public Tree dfs(int v) {
        //每访问一个顶点，就将其添加到该列表中
        List<Integer> searchOrder = new ArrayList<>();
        //每一位对应着该索引所对应顶点的父元素
        int parent[] = new int[vertices.size()];
        //默认将parent的值置为-1
        for (int i = 0; i < parent.length; i++) {
            parent[i] = -1;
        }
        //一个顶点被访问过后，就将该顶点对应的值置为true
        boolean isVisited[] = new boolean[vertices.size()];

        dfs(v, parent, searchOrder, isVisited);
        return new Tree(v, parent, searchOrder);

    }

    private void dfs(int u, int[] parent, List<Integer> searchOrder, boolean[] isVisited) {
        searchOrder.add(u);
        isVisited[u] = true;
        for (Edge e : neighbors.get(u)) {
            if (!isVisited[e.v]) {
                parent[e.v] = u;
                dfs(e.v, parent, searchOrder, isVisited);
            }
        }
    }

    //广度优先搜索算法
    @Override
    public Tree bfs(int v) {
        return null;
    }




    //根据parent数组生成一个树类
    public class Tree {
        private int root;
        private int[] parent;
        private List<Integer> searchOrder;

        public Tree(int root, int[] parent, List<Integer> searchOrder) {
            this.root = root;
            this.parent = parent;
            this.searchOrder = searchOrder;
        }

        public int getRoot() {
            return root;
        }

        public int[] getParent() {
            return parent;
        }

        public List<Integer> getSearchOrder() {
            return searchOrder;
        }

        public int getNumberOfVerticesFound() {
            return searchOrder.size();
        }

        //返回当前顶点到根顶点的路径
        public List<V> getPath(int index) {
            ArrayList<V> path = new ArrayList<>();
            do {
                path.add(vertices.get(index));
                //parent[index]存储着该顶点的上一个连接的顶点
                index=parent[index];
            }while (index!=-1);
            return path;
        }
        //给出一个顶点打印出该顶点到根顶点的路径
        public void printPath(int index){
            List<V> path=getPath(index);
            System.out.print("从"+vertices.get(root)+"顶点到"+vertices.get(index)+"顶点的路径为：");
            for(int i=path.size()-1;i>=0;i--){
                System.out.print(path.get(i)+" ");
            }
        }


        //打印出所有的边
        public void printTree(){
            System.out.println("Root is: "+vertices.get(root));
            System.out.print("Edges: ");
            for(int i=0;i<parent.length;i++){
                if(parent[i]!=-1){
                    System.out.print("("+vertices.get(parent[i])+","+vertices.get(i)+")");
                }
            }
            System.out.println();
        }


    }


}



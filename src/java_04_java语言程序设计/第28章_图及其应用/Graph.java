package java_04_java语言程序设计.第28章_图及其应用;

import java.util.List;

public interface Graph<V> {
    //返回图中的顶点数
    public int getSize();
    //返回图的顶点
    public List<V> getVertices();
    //返回指定顶点下标的顶点对象
    public V getVertex(int index);
    //返回指定顶点的下标
    public int getIndex(V v);
    //返回指定下标的顶点的邻居
    public List<Integer> getNeighbors(int index);
    //返回指定顶点下标的度
    public int getDegree(int index);
    //打印边
    public void printEdges();
    //清除图
    public void clear();
    //添加顶点
    public boolean addVertex(V v);
    //添加边
    public boolean addEdge(int u,int v);
    //得到从v开始的一个深度优先搜索树
    public AbstractGraph<V>.Tree dfs(int v);

    //得到从v开始的一个广度优先搜索树
    public AbstractGraph<V>.Tree bfs(int v);


}

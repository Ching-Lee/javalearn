package java_04_java语言程序设计.第25章_二叉查找树;

import java.util.*;

/*
    实现哈夫曼编码
    提示用户输入一个字符串，显示每个字符的哈夫曼编码
 */
public class HuffmanCode {

    /*
        定义节点类，包括字符，权重，左孩子，右孩子
     */
    public static class Node{
        //定义节点的字符
        private Character elem;
        //定义该字符的权值就是字符出现的次数
        private double weight;
        //定义左孩子
        private Node leftChild;
        //定义右孩子
        private Node rightChild;

        //为中间的节点准备的构造函数
        public Node(double weight, Node leftChild, Node rightChild) {
            this.weight = weight;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }

        //为叶子节点准备的构造函数
        public Node(Character elem, double weight) {
            this.elem = elem;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "elem=" + elem +
                    ", weight=" + weight +
                    ", leftChild=" + leftChild +
                    ", rightChild=" + rightChild +
                    '}';
        }
    }

    //实现Node的比较器，根据权重来比较Node节点，排序时需要使用
    static class NodeComparator implements Comparator<Node> {

        @Override
        public int compare(Node o1, Node o2) {
           if(o1.weight<o2.weight)
               return -1;
           else if(o1.weight>o2.weight)
               return 1;
           else
               return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入字符串");
        //text存储输入的字符串
        String text = input.nextLine();
        //统计字符串中各个字符出现的次数
        Map<Character, Integer> map = getCharacterFrequency(text);
        //创建叶子节点，放在list中
        LinkedList<Node> nodelist= CreateNodes(map);
       //构造哈夫曼树
        Node root=CreateTree(nodelist);
       //将哈夫曼编码结果存储在map中
        Map<Character,String> letterCodeMap=getLetterCode(root);
        for(int i=0;i<text.length();i++){
           System.out.print(letterCodeMap.get(text.charAt(i)));
        }
    }




    //统计字符串中各个字符出现的次数
    private static Map<Character, Integer> getCharacterFrequency(String text) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < text.length(); i++) {
            //字符值为键值
            Character c = text.charAt(i);
            //出现的次数为value值
            Integer count = map.get(text.charAt(i));
            //如果count是null,就把1放进去，不然就给count+1
            map.put(c, count == null ? 1 : count + 1);
        }
        return map;
    }

    //创建叶子节点，放在list中
    private static LinkedList<Node> CreateNodes(Map<Character, Integer> map) {
        LinkedList<Node> nodeList=new LinkedList<>();
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            Character elem=entry.getKey();
            Integer value=entry.getValue();
            Node node=new Node(elem,value);
            nodeList.add(node);
        }
        return nodeList;
    }

    //构造哈夫曼树
    private static Node CreateTree(LinkedList<Node> nodelist) {
        NodeComparator nodeComparator=new NodeComparator();
        //有大于一个的元素就需要进行合并
        while(nodelist.size()>1){
            //将节点按从小到大的顺序排序。
            nodelist.sort(nodeComparator);
            //找到最小的两个节点
            Node left=nodelist.get(0);
            Node right=nodelist.get(1);
            //创建parent节点，权值为最小的两个节点权值之和，左孩子是left节点，右孩子是right节点
            Node parent=new Node(left.weight+right.weight,left,right);
            //删掉集合中的最小的两个元素
            nodelist.remove(0);
            nodelist.remove(0);
            //将parent元素加入
            nodelist.add(parent);
        }
        //直到只剩下一个元素，就是根元素
        return nodelist.get(0);
    }


    //将得到的哈夫曼树，转成哈夫曼编码，存储到map中（字符，编码）
    private static Map<Character,String> getLetterCode(Node root) {
        Map<Character,String> letterCodeMap=new HashMap<>();
        //只有一个节点
        if(root.leftChild==null&&root.rightChild==null){
            letterCodeMap.put(root.elem,"1");
            return letterCodeMap;
        }
        getLetterCode(root," ",letterCodeMap);
        return letterCodeMap;
    }

    private static void getLetterCode(Node root, String suffix, Map<Character, String> letterCodeMap) {
        if(root!=null){
            //递归出口，是叶子节点
            if(root.leftChild==null&&root.rightChild==null){
                letterCodeMap.put(root.elem,suffix);
            }
            getLetterCode(root.leftChild,suffix+"0",letterCodeMap);
            getLetterCode(root.rightChild,suffix+"1",letterCodeMap);
        }
    }


}

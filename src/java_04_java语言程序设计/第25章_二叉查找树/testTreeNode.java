package java_04_java语言程序设计.第25章_二叉查找树;

/**
 * Created by Administrator on 2017/12/7 0007.
 */
public class testTreeNode {
    public static void main(String[] args){
        //创建三个节点
        Integer []node={60,55,100,45,57,67,107,59,101};
        BST<Integer> BST =new BST<Integer>(node);
        //前序遍历
        System.out.println("前序遍历：");
        BST.preorder();
        System.out.println();
        //非递归前序遍历
        System.out.println("非递归前序遍历：");
        BST.iterativepreorder();
        System.out.println();
        //中序遍历
        System.out.println("中序遍历：");
        BST.inorder();
        System.out.println();
        //非递归中序遍历
        System.out.println("非递归中序遍历：");
        BST.iterativeinorder();
        System.out.println();
        //后序遍历
        System.out.println("后序遍历：");
        BST.postorder();
        System.out.println();
        //非递归h后序遍历
        System.out.println("非递归后序遍历：");
        BST.iterativepostorder();
        System.out.println();
        //广度优先遍历
        System.out.println("广度优先遍历：");
        BST.layerTraversal();
        System.out.println();

        BST.delete(55);
        System.out.println("删除后前序遍历：");
        BST.preorder();
        System.out.println();

    }
}

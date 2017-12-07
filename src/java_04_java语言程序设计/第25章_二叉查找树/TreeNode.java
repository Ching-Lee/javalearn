package java_04_java语言程序设计.第25章_二叉查找树;

/*
   一个结点包括元素本身，指向左结点的变量left，指向右结点的变量right
 */
public class TreeNode<E>  {
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;
    public TreeNode(E element){
        this.element=element;
    }


}

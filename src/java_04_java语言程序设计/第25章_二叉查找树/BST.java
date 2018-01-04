package java_04_java语言程序设计.第25章_二叉查找树;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 实现二叉查找树的增删改查
 */
public class BST<E extends Comparable<E>>{
    private TreeNode<E> root;
    private int size=0;
    public BST(){

    }
    public BST(E[] objects){
        for(int i=0;i<objects.length;i++)
            insert(objects[i]);
    }

    /**
     * 查找一个元素
     * @param element
     *
     */
    protected  boolean search(E element) {
      if(root==null)
          return false;
      TreeNode<E> current=root;
      while (current!=null)
      {
          //如果元素值小于当前结点的元素值，说明在左子树
          if(element.compareTo(current.element)<0){
              current=current.left;
          }
          //如果元素大于当前结点的元素值，说明在右子树
          else if(element.compareTo(current.element)>0){
              current=current.right;
          }
          //表示元素值和当前节点元素值相等
          else
              return true;
      }
      //直到current为null，也没找到
        return false;
    }

    /**
     * 在BST插入一个元素
     *
     */
    public boolean insert(E element){
        if(root==null)
            root=createNewNode(element);
        //定义一个parent结点，一个current结点，用于遍历寻找位置
        TreeNode<E> parent,current;
        //最开始都等于根元素
        parent=current=root;
        while (current!=null){
            //元素值比当前元素小
            if(element.compareTo(current.element)<0){
                parent=current;
                current=current.left;
            }
            else if(element.compareTo(current.element)>0){
                parent=current;
                current=current.right;
            }
            //已经有这个元素，冲突
            else
                return false;
        }

        if(element.compareTo(parent.element)<0)
            parent.left=createNewNode(element);
        else
            parent.right=createNewNode(element);
        size++;
        return true;
    }

    private TreeNode<E> createNewNode(E element) {
        return  new TreeNode<E>(element);

    }


    /**
     * 二叉查找树遍历
     */

    //1.前序遍历
    public void preorder(){
        preorder(root);
    }

    protected void preorder(TreeNode<E> root) {
        if(root==null)return;
        System.out.print(root.element+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //前序遍历非递归实现
    public void iterativepreorder(){
        iterativepreorder(root);
    }

    private void iterativepreorder(TreeNode<E> root) {
        Stack<TreeNode> stack=new Stack<>();
        if(root!=null){
            stack.push(root);
            while(!stack.isEmpty()){
                TreeNode current=stack.pop();
                System.out.print(current.element+" ");
                if(current.right!=null)
                    stack.add(current.right);
                if(current.left!=null)
                    stack.add(current.left);
            }
        }
    }


    //2.中序遍历
    public void inorder(){
        inorder(root);
    }

    private void inorder(TreeNode<E> root) {
        if(root==null)return;
        inorder(root.left);
        System.out.print(root.element+" ");
        inorder(root.right);
    }

    //中序遍历非递归实现
    public void iterativeinorder(){
        iterativeinorder(root);
    }

    private void iterativeinorder(TreeNode<E> root) {
        Stack<TreeNode> stack=new Stack<>();
        if(root!=null){
           TreeNode node=root;
           while(node!=null||stack.size()>0){
               //将所有的左侧结点入栈
               while (node!=null){
                   stack.add(node);
                   node=node.left;
               }
               if(stack.size()>0){
                   TreeNode current=stack.pop();
                   System.out.print(current.element+" ");
                   if(current.right!=null)
                       node=current.right;
               }
           }
        }
    }
    //后序遍历
    public void postorder(){
        postorder(root);
    }

    private void postorder(TreeNode<E> root) {
        if(root==null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element+" ");
    }

    //非递归后序遍历
    public void iterativepostorder(){
        iterativepostorder(root);
    }

    private void iterativepostorder(TreeNode<E> root) {
        Stack<TreeNode> stack=new Stack<>();
        if(root!=null){
            TreeNode node=root;
            TreeNode preNode=null;
            while (node!=null||stack.size()>0){

                //将左侧结点全部压入栈
                while (node!=null){
                    stack.add(node);
                    node=node.left;
                }
                if(stack.size()>0){
                    //如果该节点的右结点为null，或者已经被访问
                    if(stack.peek().right==null||stack.peek().right==preNode){
                        TreeNode current=stack.pop();
                        System.out.print(current.element+" ");
                        //记录前一个被访问的结点
                        preNode=current;
                    }else {
                        node=stack.peek().right;
                    }

                }
            }
        }
    }

    //广度优先遍历(层次遍历)
    public void layerTraversal(){
        layerTraversal(root);
    }

    private void layerTraversal(TreeNode<E> root) {
        Queue<TreeNode> queue=new LinkedList<>();
        if(root!=null) {
            queue.add(root);
            //当队列不是空的
            while (!queue.isEmpty()) {

                //弹出第一个结点
                TreeNode current = queue.poll();
                System.out.print(current.element+" ");
                //如果该结点的左孩子不是null，加入到队列中
                if (current.left != null)
                    queue.offer(current.left);
                //如果该结点的右孩子不是null，加入到队列中
                if (current.right != null)
                    queue.offer(current.right);
            }
        }
    }


    //删除元素
    public boolean delete(E element){
        TreeNode<E> parent=null;
        TreeNode<E> current=root;
        //1.先找到要删除的元素的位置,current表示,父元素的parent
        while (current!=null){
            if(element.compareTo(current.element)<0){
                parent=current;
                current=current.left;
            }else if(element.compareTo(current.element)>0){
                parent=current;
                current=current.right;
            }else
                break;

        }
        //2.没找到这个元素
        if(current==null)
            return false;

        //3.case1：要删除的元素没有左子结点
        if(current.left==null){
            //如果没有父节点，相当于要删除的是根节点，
            if(parent==null)
                root=current.right;
            //判断要删除的元素是在父元素的左子树上
            else if(element.compareTo(parent.element)<0)
                parent.left=current.right;
            else
                parent.right=current.right;
        }
        //4.case2：要删除的结点有左子结点
        else{
            TreeNode<E> parentOfRightMost=current;
            TreeNode<E> rightMost=current.left;
            //通过此方法得到要删除结点左子树最大的元素（也就是最靠右的元素）
            while (rightMost.right!=null)
            {
                parentOfRightMost=rightMost;
                rightMost=rightMost.right;
            }
            //将左子树最大值复制给删除节点值
            current.element=rightMost.element;

            //如果rightMost是父节点的右边结点，此时不可能有更右边的结点了，
            // 删除之后，就让父节点连接rightMost的左结点
            if(parentOfRightMost.right==rightMost)
                parentOfRightMost.right=rightMost.left;
            else
                parentOfRightMost.left=rightMost.left;

        }

        size--;
        return true;

    }



}

package java_04_java语言程序设计.第23章_排序.text5_堆排序;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/12/4 0004.
 */
public class Heap<E extends Comparable<E>> {
    private ArrayList<E> list=new ArrayList<E>();
    public Heap(){}
    public Heap(E[] object) {
        for(int i=0;i<object.length;i++)
            add(object[i]);
    }
    //添加的元素先放到最后一个位置，如果比父元素大，就和父元素交换
    //如果比父元素小，就是找到位置，跳出

    public void add(E newObject) {
        list.add(newObject);
        int currentIndex=list.size()-1;
        while (currentIndex>0){
            //如果当前节点的值比父节点大，就要和父节点交换
            int parentIndex=(currentIndex-1)/2;
            if(list.get(currentIndex).compareTo(list.get(parentIndex))>0){
                E tmp=list.get(parentIndex);
                list.set(parentIndex,list.get(currentIndex));
                list.set(currentIndex,tmp);
            }else
                break;
            currentIndex=parentIndex;
        }
    }

    public E remove(){
        if(list.size()==0)return null;
        E removeObject=list.get(0);
        //将根元素设置为最后一个
        list.set(0,list.get(list.size()-1));
        list.remove(list.size()-1);
        int currentIndex=0;
        //重建堆的过程：
        //就是要让根元素大于孩子元素，先找到孩子元素中最大的值，和根元素比较，比根元素大，就交换。
        //找不到就跳出

        //找出左右孩子较大的元素
        while(currentIndex<list.size()){
            int leftChildIndex=2*currentIndex+1;
            int rightChildIndex=2*currentIndex+2;
            //如果左孩子超出范围，结束
            if(leftChildIndex>=list.size())
                break;
            //找出左右孩子中较大数的索引
            int maxIndex=leftChildIndex;
            if(rightChildIndex<list.size()){
                if(list.get(maxIndex).compareTo(list.get(rightChildIndex))<0){
                    maxIndex=rightChildIndex;
                }
            }
            //当前元素比左右孩子中较大的小，和较大的孩子换位置
            if(list.get(currentIndex).compareTo(list.get(maxIndex))<0)
            {
                E temp=list.get(currentIndex);
                list.set(currentIndex,list.get(maxIndex));
                list.set(maxIndex,temp);
                currentIndex=maxIndex;
            }
            //当前元素已经最大了
            else
                break;

        }

        return removeObject;

    }

    public int getSize(){
        return list.size();
    }

}

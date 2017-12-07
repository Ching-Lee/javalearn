package java_04_java语言程序设计.第23章_排序.text5_堆排序;

/**
 * Created by Administrator on 2017/12/5 0005.
 */
public class HeapSort {
    public static <E extends Comparable<E>> void heapSort(E[] list){
        Heap<E> heap=new Heap<E>(list);
        for(int i=list.length-1;i>=0;i--){
            list[i]=heap.remove();
        }
    }

    public static void main(String[] args){
        Integer[] list={-44,-5,-3,3,3,1,-4,0,1,2,4,5,53};
        heapSort(list);
        for(int i=0;i<list.length;i++)
            System.out.print(list[i]+" ");
    }
}

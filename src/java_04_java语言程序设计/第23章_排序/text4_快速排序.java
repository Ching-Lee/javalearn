package java_04_java语言程序设计.第23章_排序;

import org.junit.Test;

/**
 * Created by Administrator on 2017/12/4 0004.
 */
public class text4_快速排序 {
    private void quickSort(int[] list){
        quickSort(list,0,list.length-1);
    }

    private void quickSort(int[] list, int first, int last) {
        if(last>=first){
            int pivotIndex=partition(list,first,last);
            quickSort(list,0,pivotIndex-1);
            quickSort(list,pivotIndex+1,last);
        }
    }

    private int partition(int[] list, int first, int last) {
        //以第一个数为主元
        int pivot=list[first];
        int low=first+1;
        int high=last;
        while(low<high){
            //low从左到右找比主元大的数的指针
            while(low<=high&&list[low]<=pivot)
                low++;
            //high从右到左找小于等于主元的数的指针
            while (low<=high&&list[high]>pivot)
                high--;

            //找到两个值后，交换，目的是把比主元小的放到左边，大的放在右边
            if(low<high)
            {
                int tmp=list[low];
                list[low]=list[high];
                list[high]=tmp;
            }
        }

        //直到low>=high跳出循环
        //high指针向左移，找到第一个小于主元的值，将主元和该值互换
        while(high>first&&list[high]>=pivot)
            high--;
        if(list[high]<pivot)
        {
            list[first]=list[high];
            list[high]=pivot;
            return high;
        }
        else
            return first;


    }

    @Test
    public void test(){
        int []list={2,3,2,5,6,1,-2,3,14,12};
        quickSort(list);
        for(int i=0;i<list.length;i++)
            System.out.print(list[i]+" ");
    }

}

package java_04_java语言程序设计.第23章_排序;

import org.junit.Test;

public class quickSort {
    @Test
    public void test(){
        int []list={2,3,4,3,6,2,6,9,0};
        quicksort(list,0,list.length-1);

    }

    private void quicksort(int[] list,int start,int end) {
        //记住必须end>start
        if(end>=start){
            int piord=list[start];
            int low=start+1;
            int high=end;
            while(low<high){
                //找到左边第一个比piord大的数
                while(low<=high&&list[low]<=piord)
                    low++;
                while(low<=high&&list[high]>piord)
                    high--;
                if(low<high)
                    swap(list,low,high);

            }
            //执行完循环后，找到第一个小于piord的数，和第一个数交换位置
            while(high>start&&list[high]>=piord)
                high--;
            if(list[high]<piord)
                swap(list,start,high);
            //左半边快排
            quicksort(list,start,high-1);
            //右半边快排
            quicksort(list,high+1,end);
        }

    }

    private void swap(int[] list, int i, int j) {
        int temp=list[i];
        list[i]=list[j];
        list[j]=temp;
    }


}

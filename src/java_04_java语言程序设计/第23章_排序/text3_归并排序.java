package java_04_java语言程序设计.第23章_排序;


import org.junit.Test;

/**
 * Created by Administrator on 2017/12/4 0004.
 */
public class text3_归并排序 {
    public void mergeSort(int[] array){
        if(array.length>1){
            //将左半边存到firstHalf数组中
            int firstHalf[]=new int[array.length/2];
            System.arraycopy(array,0,firstHalf,0,array.length/2);
            //左半边递归
            mergeSort(firstHalf);
            //将右半边存到secondHalf数组中
            int seconHalfLength=array.length-array.length/2;
            int secondHalf[]=new int[seconHalfLength];
            System.arraycopy(array,array.length/2,secondHalf,0,seconHalfLength);
            //右半边递归
            mergeSort(secondHalf);
            //排序合并
            merge(firstHalf,secondHalf,array);
        }

    }

    private void merge(int[] firstHalf, int[] secondHalf, int[] array) {
        int firstHalf_index=0;
        int secondHalf_index=0;
        int array_index=0;
        //如果左边索引值小于左边数组长度，并且右边索引值小于右边数组长度，比较左右两边依次把小的数放入array数组中
        while (firstHalf_index<firstHalf.length&&secondHalf_index<secondHalf.length){
            if(firstHalf[firstHalf_index]<secondHalf[secondHalf_index])
                //左边小于右边，左边的数放到array中，左边索引值+1
                array[array_index++]=firstHalf[firstHalf_index++];
            else
                array[array_index++]=secondHalf[secondHalf_index++];
        }

        //如果右边排完了，左边还剩着
        while(firstHalf_index<firstHalf.length)
            array[array_index++]=firstHalf[firstHalf_index++];

        while (secondHalf_index<secondHalf.length)
            array[array_index++]=secondHalf[secondHalf_index++];
    }

    @Test
    public void test(){
        int []list={2,3,2,5,6,1,-2,3,14,12};
        mergeSort(list);
        for(int i=0;i<list.length;i++)
            System.out.print(list[i]+" ");
    }
}

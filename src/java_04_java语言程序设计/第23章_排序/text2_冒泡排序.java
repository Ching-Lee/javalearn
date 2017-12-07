package java_04_java语言程序设计.第23章_排序;

import org.junit.jupiter.api.Test;

/**
 * Created by Administrator on 2017/12/4 0004.
 */
public class text2_冒泡排序 {
    private void BubbleSort(int[] array) {
        boolean neddNextPass = true;
        //i是负责遍历次数的，6个数字只需要5次遍历
        for (int i = 0; i < array.length - 1 && neddNextPass; i++) {
            //如果走了一圈，没有发生交换事件，说明顺序排好了，不需要进行下一次大遍历
            neddNextPass=false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                //j负责一次遍历中的交换
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    neddNextPass = true;
                }
            }
        }
    }
    @Test
   public void test(){
        int array[]={2,9,5,4,8,1,6};
        BubbleSort(array);
        for (int num:array) {
            System.out.print(num);
        }
    }
}

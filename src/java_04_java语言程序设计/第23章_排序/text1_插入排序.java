package java_04_java语言程序设计.第23章_排序;


import org.junit.Test;

/**
 *  插入第p个元素，保证从位置0到位置p-1是已排序的状态。
 * 插入时，依次比较arr[p-1]...与要插入元素arr[p]的大小，
 *如果大于要插入的元素arr[p],就往后移动一位，
 *直到找到比当前要插入元素小的元素的位置K，将要插入的元素插入到K+1的位置。
 */
public class text1_插入排序 {
    private void insertSort(int[] array){
        //p表示要插入的元素位置
        for(int p=1;p<array.length;p++){
            int current=array[p];
            //和前p-1个元素比较，找到大于等于左边，小于右边的插入位置
            int i;
            for(i=p-1;i>=0&&array[i]>current;i--){
                //如果元素比要插入的元素大，就往后移一位
                array[i+1]=array[i];
            }
            //比较完了之后，i索引要么<0,要么array[i]<current
            //插入位置i+1
            array[i+1]=current;
        }
    }

    @Test
    public  void test(){
        int array[]={2,9,5,4,8,1,6};
        insertSort(array);
        for (int num:array) {
            System.out.print(num);
        }
    }
}

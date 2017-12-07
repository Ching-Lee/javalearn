package java_04_java语言程序设计.第七章_一维数组;

/**
 *  选择排序法先找到数列中最小的数 ， 然后将它和第一个元
 素交换 。 接下来 ， 在剩下的数中找到最小数 ， 将它和第二个元素交换 ， 依此类推 ， 直到数列
 中仅剩一个数为止 。
 */
public class text4_选择排序 {
    public  static void  selectionSort(double[] list){
        //第一层循环用于控制找到最小元素后排列的位置（比如首先放到第一个位置，然后第二个位置）
        double min;
        int min_index;
        for(int i=0;i<list.length-1;i++){
             min=list[i];
             min_index=i;
            //为了找到一个最小的元素
            for(int j=i+1;j<list.length;j++)
            {
                if(list[j]<min){
                    min=list[j];
                    min_index=j;
                }
            }

            //找到了最小的元素min，及索引min_index,把它和前面list[i]互换
            if(min_index!=i) {
                list[min_index] = list[i];
                list[i] = min;
            }


        }
    }

    public static void main(String[] args){
        double[] list={1,9,4.5,6.6,5.7,-4.5};
        selectionSort(list);
        for (double d:list)
            System.out.print(d+" ");

       
    }

}

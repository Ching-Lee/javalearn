package java_04_java语言程序设计.第18章_递归;

/**
 * Created by Administrator on 2017/11/27 0027.
 */
public class text4_选择排序 {
    public static void main(String[] args){
        double []list={3,5,5,7,8,6,40,6};
       selectSort(list);
       // portSort(list);
        for (double d:list) {
            System.out.print(d+" ");
        }
    }



    //用递归实现选择排序
    private static void selectSort(double[] list) {
        selectSort(list,0,list.length-1);
    }

    private static void selectSort(double[] list, int low, int high) {
        if(low<high){
            double min=list[low];
            int min_index=low;
            for(int i=low+1;i<=high;i++){
                if(list[i]<min){
                    min=list[i];
                    min_index=i;
                }
            }
            if(min_index!=low){
                list[min_index]=list[low];
                list[low]=min;
            }

            selectSort(list,low+1,high);

        }

    }


    /*普通方法选择排序
    private static void selectSort(double[] list) {
        for(int i=0;i<list.length-1;i++){
            double min=list[i];
            int min_index=i;
            for(int j=i+1;j<list.length;j++){
               if(list[j]<min)
               {
                   min=list[j];
                   min_index=j;
               }
            }
            if(min_index!=i){
                list[min_index]=list[i];
                list[i]=min;
            }

        }

    }*/




    //冒泡排序(回顾)
    private static void portSort(double[] list) {
        for(int i=0;i<list.length-1;i++)
            for(int j=0;j<list.length-1-i;j++)
            {
                if(list[j]>list[j+1])
                {
                    double temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
    }
}

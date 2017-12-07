package java_04_java语言程序设计.第七章_一维数组;

/**
 * Created by Administrator on 2017/10/26 0026.
 */
public class text5_冒泡排序 {

    public static void popsort(int []array){
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }

            }
        }
    }

    public static void main(String[] args){
        int []a={15,7,4,8,4};
        popsort(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

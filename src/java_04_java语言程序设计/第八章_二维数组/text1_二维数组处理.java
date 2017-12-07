package java_04_java语言程序设计.第八章_二维数组;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/26 0026.
 */
public class text1_二维数组处理 {
    //1.使用输入值初始化数组
    public void initArray(int array[][]){
        Scanner input=new Scanner(System.in);
        for(int row=0;row<array.length;row++){
            for(int colum=0;colum<array[row].length;colum++){
                array[row][colum]=input.nextInt();
            }
        }

    }

    //2.数组按列求和
    public static void sumbycolum(int array[][]){
        for(int colum=0;colum<array[0].length;colum++) {
            int total = 0;
            for(int row=0;row<array.length;row++){
                total=total+array[row][colum];
            }
            System.out.println("第"+(colum+1)+"列的和为"+total);
        }
    }


    //3.哪一行的和最大
    public static void  maxRow(int array[][]){
        int maxrow=0;
        int indexOfMaxRow=0;
        for(int colum=0;colum<array[0].length;colum++)
            maxrow=maxrow+array[0][colum];
        for(int row=1;row<array.length;row++){
            int totalOfthisRow=0;
            for(int colum=0;colum<array[row].length;colum++){
                totalOfthisRow=totalOfthisRow+array[row][colum];
                if(totalOfthisRow>maxrow){
                    maxrow=totalOfthisRow;
                    indexOfMaxRow=row;
                }
            }
        }
        System.out.print("Row "+(indexOfMaxRow+1)+" has the max sum of "+maxrow);
    }

    public static void main(String[] args){
        int [][] array={
                {1,2,3,4,5},
                {6,7,8,9,1},
                {4,5,6,8,7}
        };
        sumbycolum(array);
        maxRow(array);
    }

}

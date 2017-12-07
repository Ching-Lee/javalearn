package java_04_java语言程序设计.第八章_二维数组;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/26 0026.
 */
public class text2_距离最近的点对 {
    public static void main(String[] args){
        System.out.println("输入有几个点：");
        Scanner input=new Scanner(System.in);
        int row=input.nextInt();
        double [][]array=new double[row][2];
        System.out.println("输入所有点的x，y坐标：");
        for(int i=0;i<row;i++) {
            array[i][0]=input.nextDouble();
            array[i][1]=input.nextDouble();
        }
        //定义变量p1，p2表示距离最近的点所在的行
        int p1=0,p2=1;
        double shortDistance=distance(array[p1][0],array[p1][1],array[p2][0],array[p2][1]);
        //从0开始，每一个和后面其余所有行求距离
        for(int i=0;i<array.length-1;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                double distance=distance(array[i][0],array[i][1],array[j][0],array[j][1]);
                if(distance<shortDistance)
                {
                    p1=i;
                    p2=j;
                    shortDistance=distance;
                }
            }
        }

        System.out.println("最短的两点是（"+array[p1][0]+","+array[p1][1]+")("+array[p2][0]+","+array[p2][1]+")"+"\n最短的距离为："+shortDistance);
    }

    private static double distance(double x1, double y1, double x2, double y2) {

        return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }

}

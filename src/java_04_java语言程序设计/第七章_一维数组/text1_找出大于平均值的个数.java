package java_04_java语言程序设计.第七章_一维数组;

import java.util.Scanner;

/**
 *问题是 ， 读取 100 个数 ， 计算这些数的平均值并找到大于平均值的那些项的个数 。 为了更加灵活地
 处理任意数目的输入 ， 我们让用户给出输人的个数 。
 */
public class text1_找出大于平均值的个数 {
    public static void main(String[] args){
        System.out.print("输入数字总个数");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        double[] numbers=new double[n];
        System.out.print("输入数字");
        double sum=0;
        for(int i=0;i<n;i++){
            numbers[i]=input.nextDouble();
            sum=sum+numbers[i];
        }
        double ave=sum/n;
        int count=0;
        for(int i=0;i<n;i++){
            if(numbers[i]>ave)
                count++;
        }

        System.out.println("平均值为"+ave);
        System.out.println("大于平均值的个数为："+count);

    }
}

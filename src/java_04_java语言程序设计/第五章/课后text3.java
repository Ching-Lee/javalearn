package java_04_java语言程序设计.第五章;

import java.util.Scanner;

/**
 * 5.16( 找出一个整数的因子 ） 编写程序 ， 读入一个整数 ， 然后以升序显示它的所有最小因子 。
 * 例如 ,若输人的整数是 120 , 那么输出就应该是 ： 2 , 2 , 2 , 3 , 5 。
 */
public class 课后text3 {
    public static void main(String[] args){
        System.out.print("请输入数字：");
        Scanner input =new Scanner(System.in);
        int num=input.nextInt();
        int k=2;
        while (k<=num){
            if(num%k==0){
                System.out.print(k+" ");
                num=num/k;
                k=2;
                continue;
            }
            k++;
        }
    }
}

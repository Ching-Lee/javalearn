package java_04_java语言程序设计.第六章;

import java.util.Scanner;

/**
 * 6.2 ( 求一个整数各位数字之和 ） 编写一个方法 ， 计算一个整数各位数字之和 。 使用下面的方法头 ：
 public static int sumDi gits ( long n )
 例如 ： sumDi gits ( 2 34 ) 返回 9 ( 2 + 3 + 4 ) .
 */
public class text2_求整数各位数字之和 {
    public static int sumDigits(long n){
        int sum=0;
        while (n!=0){
            sum= (int) (sum+n%10);
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args){
       System.out.print("Enter the number:");
        Scanner input=new Scanner(System.in);
       int sum=sumDigits(input.nextInt());
        System.out.print("sum:"+sum);



    }
}

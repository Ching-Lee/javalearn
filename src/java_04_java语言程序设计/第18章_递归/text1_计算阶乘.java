package java_04_java语言程序设计.第18章_递归;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/11/27 0027.
 */
public class text1_计算阶乘 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        System.out.println(factorial(number));
    }

    private static long factorial(int number) {
        if(number==0){
            return 1;
        }else {
            return number*factorial(number-1);
        }

    }


}

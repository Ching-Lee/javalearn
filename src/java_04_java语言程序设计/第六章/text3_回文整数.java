package java_04_java语言程序设计.第六章;

import java.util.Scanner;

/**
 * * * 6.3 ( 回文整數 ） 使用下面的方法头编写两个方法 ：
 / / Return the reversal of an integer , i . e . , reverse ( 456 ) returns 654
 public static int reverse ( int number )
 / / Return true if number is a palindrome
 public static boolean isPalindrome ( int number )
 使用 reverse 方法实现 isPalindrome 。 如果一个数字的反向倒置数和它的顺向数一样 ， 这
 个数就称作回文数 。 编写一个测试程序 ， 提示用户输人一个整数值 ， 然后报告这个整数是否是回
 文数 。
 */
public class text3_回文整数 {
    public static int reverse(int number){
        int rev=0;
        while (number!=0){
            rev=rev*10+number%10;
            number=number/10;
        }
        return rev;
    }
    public static boolean isPalindrome(int number){
        if(number==reverse(number))
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        System.out.print("Enter a number:");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        boolean result=isPalindrome(number);
        if(result)
            System.out.print("是回文数");
        else
            System.out.print("不是回文数");
    }

}

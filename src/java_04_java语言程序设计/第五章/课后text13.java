package java_04_java语言程序设计.第五章;

import java.util.Scanner;

/**
 * * 5.46 ( 倒排一个字符串 ） 编写一个程序 ， 提示用户输入一个字符串 ， 然后以反序显示该字符串 。
 */
public class 课后text13 {
    public static void main(String[] args){
        System.out.print("Enter a string:");
        Scanner input=new Scanner(System.in);
        String s=input.next();
        String reverString="";
        for(int i=s.length()-1;i>=0;i--){
            reverString=reverString+s.charAt(i);
        }
        System.out.println(reverString);
    }
}

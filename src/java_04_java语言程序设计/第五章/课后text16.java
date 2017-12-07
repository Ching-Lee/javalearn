package java_04_java语言程序设计.第五章;

import java.util.Scanner;

/**
 ** 5.50
 ( 对大写字母计數 ） 编写一个程序 ， 提示用户输人一个字符串 ， 然后显示该字符串中大写字母的
 数目 。
 */
public class 课后text16 {
    public static void main(String[] args){
        System.out.print("Enter a String:");
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z')
                count++;
        }
        System.out.println("The number of uppercase letters is "+count);
    }
}

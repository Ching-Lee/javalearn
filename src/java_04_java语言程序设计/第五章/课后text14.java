package java_04_java语言程序设计.第五章;

import java.util.Scanner;

/**
 * 5.48
 * ( 处理字符串 ） 编写一个程序 ， 提示用户输入一个字符串 ， 显示奇数位置的字符 。 下面是一个运
 * 行示例 ：
 * Enter a string : Beijing Chicago
 * BiigCiao
 */
public class 课后text14 {
    public static void main(String[] args) {
        System.out.print(" Enter a string:");
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        for (int i=0;i<s.length();i++)
            if(i%2==0)
                System.out.print(s.charAt(i));


    }
}

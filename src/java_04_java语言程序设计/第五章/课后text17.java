package java_04_java语言程序设计.第五章;

import java.util.Scanner;

/**
 * * 5.51
 ( 最长的共同前缀） 编写一个程序 ， 提示用户输人两个字符串 ， 显示两个字符串最长的共同前缀 。
 下面是运行示例 ：
 Enter the first string : Welcome to C++
 Enter the second string : Welcome to programming
 The common prefix is Welcome to
 Enter the first string : Atlanta
 Enter the second string : Macon
 Atlanta and Macon have no common prefix
 */
public class 课后text17 {
    public  static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the first string:");
        String s1=input.nextLine();
        System.out.print("Enter the second string:");
        String s2=input.nextLine();
        int length=s1.length()<s2.length()?s1.length():s2.length();
        String result="";
        for(int i=0;i<length;i++){
          if(s1.charAt(i)==s2.charAt(i))
              result=result+s1.charAt(i);
          else
              break;
        }
        if(result.length()>0)
            System.out.println("The common prefix is "+result);
        else
            System.out.println(s1+"and"+s2+"have no common prefix");

    }
}

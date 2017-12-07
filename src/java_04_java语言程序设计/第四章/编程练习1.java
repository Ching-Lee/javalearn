package java_04_java语言程序设计.第四章;

import java.util.Scanner;


public class 编程练习1 {
    public static void main(String[] args){
        /*
         * 习题4.8
         * Created by Administrator on 2017/8/27 0027.
         * ( 给出 ASCII 码对应的字符 ） 编写一个程序 ， 得到一个 ASCII 码的输入 （ 0-127 之间的一个整
         数 ) ， 然后显示该字符 。 下面是一个运行示例 ：
         Enter an ASCII code : 69
         The character for ASCII code 69 is E
         */
        System.out.print("Enter an ASCII code:");
        Scanner sc=new Scanner(System.in);
        int code=sc.nextInt();
        if(code<0||code>127){
            System.out.println("必须为0-127之间的整数");
            System.exit(1);
        }
        System.out.printf("The character for ASCII code "+code+" is %c \n",code);
        /*
         * 习题4.9
        ( 给出字符的 Unicode 码 ） 编写一个程序 ， 得到一个字符的输入 ， 然后显示其 Unicode 值 。
        下面是一个运行示例 ：
        Enter a character : E
        The Unicode for the character E is 69
         */
        System.out.print("Enter a character:");
        sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.length()!=1){
            System.out.println("只能输入一个字符");
            System.exit(1);
        }
        char ch=s.charAt(0);
        int value=(int)ch;
        System.out.printf("The Unicode for the character "+ch+" is %d\n",value);


    }
}

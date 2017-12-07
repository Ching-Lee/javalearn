package java_04_java语言程序设计.第四章;

import java.util.Scanner;

/**
 * 十六进制记数系统有 16 个数字 ： 0 ~9 , A~ F 。 字母 A 、 B 、 C 、 D 、 E 和 F 对应于十
 进制数字 10 、 11 、 12 、 13 、 14 和 15 。 我们现在写一个程序 ， 提示用户输入一个十六进制数字 ,
 显示它对应的十进制数 。
 */
public class 示例学习_3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("输入一个16进制数");
        String hex=input.nextLine();
        if(hex.length()!=1){
            System.out.println("只能输入一个字符");
            System.exit(1);
        }
        char ch=Character.toUpperCase(hex.charAt(0));
        if(ch<='F'&&ch>='A'){
            int value=ch-'A'+10;
            System.out.println(ch+"的16进制为"+value);
        }
        else if(Character.isDigit(ch)){
            System.out.println(ch+"的16进制为"+ch);
        }
        else{
            System.out.println(ch+"is an invalid input");
        }

    }


}

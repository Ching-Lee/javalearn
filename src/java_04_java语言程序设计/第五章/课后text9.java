package java_04_java语言程序设计.第五章;

import java.util.Scanner;

/**
 * 5.37( 十进制到二进制 ） 编写程序 ， 提示用户输人一个十进制整数 ， 然后显示对应的二进制值 。 在这
 个程序中不要使用 Java 的 Interger . toBinaryString ( int ) 方法 。
 */
public class 课后text9 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("请输入十进制数：");
        int digit=input.nextInt();
        String hex="";
        while (digit!=0){
            hex=digit%2+hex;
            digit=digit/2;
        }
        System.out.println("16进制为："+hex);

    }
}

package java_04_java语言程序设计.第五章;

import java.util.Scanner;

/**
 * 5.38( 十进制到八进制 ） 编写程序 ， 提示用户输入一个十进制整数 ， 然后显示对应的八进制值 。 在这
 个程序中不要使用 Java 的 Interger . toOctalString ( int ) 方法 。
 */
public class 课后text10 {
    public static void main(String[] args){
        System.out.print("请输入十进制数：");
        Scanner input=new Scanner(System.in);
        int digit=input.nextInt();
        String octal="";
        while (digit!=0){
            octal=digit%8+octal;
            digit=digit/8;
        }
        System.out.println("八进制为"+octal);
    }
}

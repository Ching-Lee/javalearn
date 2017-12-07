package java_04_java语言程序设计.第五章;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/30 0030.
 */
public class 练习4_10进制数转换为16进制数 {
    public static void main(String[] args){
        System.out.print("请输入十进制数：");
        Scanner input=new Scanner(System.in);
        int decimal=input.nextInt();
        int in=decimal;
        String hex="";
        while (decimal!=0){
            int hexValue=decimal%16;
            char hexch= (hexValue>=0&&hexValue<=9)?(char)(hexValue+'0'):(char)(hexValue-10+'A');
            hex=hexch+hex;
            decimal=decimal/16;
        }
        System.out.println(in+"的十六进制为："+hex);

    }
}

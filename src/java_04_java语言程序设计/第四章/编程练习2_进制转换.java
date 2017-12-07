package java_04_java语言程序设计.第四章;


import java.util.Scanner;

public class 编程练习2_进制转换 {
    public static void main(String[] args){
        /*4.11
        ( 十进制转十六进制 ） 编写一个程序 ， 提示用户输人 0~15 之间的一个整数 ， 显示其对应的十六进制数 。
        下面是一个运行示例 ：
        Enter a decimal value ( 0 to 15 ) : 11
        The hex value is B
        Enter a decimal value ( 0 to 15 ) : 5
        The hex value is 5
        Enter a decimal value ( 0 to 15 ) : 31
        31 is an invalid input
         */

        System.out.print("Enter a decimal value ( 0 to 15 ): ");
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        if(value>=0&&value<10){
            System.out.println("The hex value is "+value);
        }
        else if(value>=10&&value<=15){
            char ch= (char) (value-10+'A');
            System.out.println("The hex value is "+ch);
        }else{
            System.out.println(value+" is an invalid input ");
            System.exit(1);
        }

        /*
        4.12 ( 十六进制转二进制 ） 编写一个程序 ， 提示用户输人一个十六进制数 ， 显示其对应的二进制数。
        下面是一个运行示例 ：
        Enter a hex digit : B
        The binary value is 1011
        Enter a hex digit : G
        G is an invalid input
         */
        System.out.print("输入一个16进制数:");
        sc=new Scanner(System.in);
        String hexstring=sc.nextLine();
        if(hexstring.length()!=1){
            System.out.println("只能输入一个字符");
            System.exit(1);
        }
        char ch=hexstring.toUpperCase().charAt(0);
        String result="";
        switch (ch){
            case '0':result="0";break;
            case '1':result="1";break;
            case '2':result="10";break;
            case '3':result="11";break;
            case '4':result="100";break;
            case '5':result="101";break;
            case '6':result="110";break;
            case '7':result="111";break;
            case '8':result="1000";break;
            case '9':result="1001";break;
            case 'A':result="1010";break;
            case 'B':result="1011";break;
            case 'C':result="1100";break;
            case 'D':result="1101";break;
            case 'E':result="1110";break;
            case 'F':result="1111";break;
            default:
                System.out.println(hexstring+" is an invalid input");
                System.exit(1);
        }
        System.out.println("十进制是  "+result);

    }
}

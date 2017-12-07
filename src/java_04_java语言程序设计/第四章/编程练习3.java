package java_04_java语言程序设计.第四章;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/28 0028.
 */
public class 编程练习3 {

    public static void main(String[] args) {
         /*
           4.13 ( 利断元音还是辅音 ） 编写一个程序 ， 提示用户输入一个字母 ， 判断该字母是元音还是辅音 。
           下面是一个运行示例 ：
            Enter a letter : B
           B is a consonant
         */
        System.out.print("Enter a letter:");
        Scanner input = new Scanner(System.in);
        String letterString = input.nextLine();
        if (letterString.length() != 1) {
            System.out.println("只能输入一个字符");
            System.exit(1);
        }
        char ch = letterString.toUpperCase().charAt(0);
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            System.out.println(ch + "是元音");
        else if (ch >= 'A' && ch <= 'Z')
            System.out.println(ch + "是辅音");
        else
            System.out.println(ch + "是无效的输入");


        /*
         4.14 ( 转換字母等级为數字 ） 编写一个程序 ， 提示用户输入一个字母等级 A 、 B 、 C 、 D 或者 F , 显示
                对应的数字值 4 、 3 、 2 、 1 或者 0 。 下面是一个运行示例 ：
                Enter a letter grade : B 
                The numeric value for grade B is 3
                Enter a letter grade : T
                T is an invalid grade
         */
        System.out.print("Enter a letter grade: ");
        input = new Scanner(System.in);
        String grade = input.nextLine();
        if (grade.length() != 1) {
            System.out.println("只能输入一个字符");
            System.exit(1);
        }
        char c = grade.toUpperCase().charAt(0);
        int result = 0;

        switch (c) {
            case 'A':
                result = 4;
                break;
            case 'B':
                result = 3;
                break;
            case 'C':
                result = 2;
                break;
            case 'D':
                result = 1;
                break;
            case 'E':
                result = 0;
                break;
            default:
                System.out.println(c+"is an invalid grade");
                System.exit(1);
                break;

        }
        System.out.println("The numeric value for grade "+c+" is "+result);


    }
}

package java_04_java语言程序设计.第五章;

import java.util.Scanner;

/**
 * * 5.49
 * ( 对元音和辅音进行计数 ） 假设字母 A 、 E 、 I 、 0 、 U 为元音 。编写一个程序 ， 提示用户输入一个
 * 字符串 ， 然后显示字符串中元音和辅音的数目 。
 * Enter a string : Programming is fun
 * The number of vowels is 5
 * The number of consonants is 11
 */
public class 课后text15 {
    public static void main(String[] args) {
        System.out.print("Enter a string:");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int vowels=0;
        int consonants=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.toUpperCase().charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' ||ch=='U') {
                  vowels++;
            }
            else if(ch>='A'&ch<='Z') {
                consonants++;
            }
        }
        System.out.println("The number of vowels is "+vowels);
        System.out.println("The number of consonants is "+consonants);
    }
}

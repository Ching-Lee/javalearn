package java_04_java语言程序设计.第四章;

import java.util.Scanner;

/**4.24
 * ( 对三个城市排序 ） 编写一个程序 ， 提示用户输入三个城市名称 ， 然后以升序进行显示 。 下面是
 一个运行示例 ：
 Enter the first city : Chicago
 Enter the second city : Los Angeles pSST
 Enter the third city : Atlanta
 The three cities in alphabetical order are Atlanta Chicago Los Angeles
 */
public class 编程练习5 {
    public static void main(String[] args){
        System.out.print("Enter the first city: ");
        Scanner input=new Scanner(System.in);
        String city1=input.nextLine();
        System.out.print("Enter the second city: ");
        String city2=input.nextLine();
        System.out.print("Enter the third city: ");
        String city3=input.nextLine();
        if(city1.compareTo(city2)>0){
            String s=city1;
            city1=city2;
            city2=s;
        }
        if(city1.compareTo(city3)>0){
            String s=city1;
            city1=city3;
            city3=s;
        }
        if(city2.compareTo(city3)>0){
            String s=city2;
            city2=city3;
            city3=s;
        }

        System.out.println(city1+" "+city2+" "+city3);
    }

}

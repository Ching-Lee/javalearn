package java_04_java语言程序设计.第五章;

import java.util.Scanner;

/**
 * 5.28 ( 显示每月第一天是星期几 ） 编写程序 ， 提示用户输人年份和代表该年第一天是星期几的数字 ，
 然后在控制台上显示该年每月第一天的星期 。 例如 ， 如果用户输人的年份是 2013 和代表 2013
 年 1 月丨日为星期二的 2 , 程序应该显示如下输出 ：
 January 1 , 2013 is Tuesday
 December 1 , 2013 is Sunday
 */
public class 课后text6 {
    public static void main(String[] args){
        System.out.println("Enter year and day");
        Scanner input=new Scanner(System.in);
        int year=input.nextInt();
        int firstday=input.nextInt();
        int monthOfday=0;
        for(int month=1;month<=12;month++){
            switch (month){
                case 1:System.out.print("January 1,"+year+" is ");monthOfday=31;break;
                case 2:System.out.print("Febrary 1,"+year+" is ");monthOfday=((year%4==0&&year%100!=0)||year%400==0)?29:28;break;
                case 3:System.out.print("March 1,"+year+" is ");monthOfday=31;break;
                case 4:System.out.print("April 1,"+year+" is ");monthOfday=30;break;
                case 5:System.out.print("May 1,"+year+" is ");monthOfday=31;break;
                case 6:System.out.print("June 1，"+year+" is ");monthOfday=30;break;
                case 7:System.out.print("July 1，"+year+" is ");monthOfday=31;break;
                case 8:System.out.print("Augest,"+year+" is ");monthOfday=31;break;
                case 9:System.out.print("september，"+year+" is ");monthOfday=30;break;
                case 10:System.out.print("October,"+year+" is ");monthOfday=31;break;
                case 11:System.out.print("November,"+year+" is ");monthOfday=30;break;
                case 12:System.out.print("December,"+year+" is ");monthOfday=31;break;
            }
            switch (firstday){
                case 0:System.out.println("Sunday");break;
                case 1:System.out.println("monday");break;
                case 2:System.out.println("Tuesday");break;
                case 3:System.out.println("wednsday");break;
                case 4:System.out.println("Thusday");break;
                case 5:System.out.println("Friday");break;
                case 6:System.out.println("Satuday");break;
            }
            firstday=(firstday+monthOfday)%7;
        }
    }
}

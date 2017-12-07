package java_04_java语言程序设计.第四章;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/28 0028.
 */
public class 编程练习4 {
    /*
     4.21 ( 检查 SSN ) 编写一个程序 ， 提示用户输入一个社保号码 ， 它的格式是 DDD - DD - DDDD , 其中 D
      是一个数字 。 你的程序应该判断输入是否合法 。 下面是一个运行示例 ：
      Enter a SSN : 232 - 23- 5435
      232-23-5435 is a valid social security number
      Enter a SSN : 23-23-5435;
      23-23-5435 is an invalid social security number
     */
    public static void main(String[] args){
        System.out.println("Enter a SSN: ");
        Scanner input=new Scanner(System.in);
        String ssn=input.nextLine();
        if(ssn.length()==11&&Character.isDigit(ssn.charAt(0))&&Character.isDigit(ssn.charAt(1))&&Character.isDigit(ssn.charAt(2))
                &&ssn.charAt(3)=='-'&&Character.isDigit(ssn.charAt(4))&&Character.isDigit(ssn.charAt(5))&&
                ssn.charAt(6)=='-'&&Character.isDigit(ssn.charAt(7))&&Character.isDigit(ssn.charAt(8))&&
                Character.isDigit(ssn.charAt(9))&&Character.isDigit(ssn.charAt(10))){
            System.out.println(ssn+" is an valid social security number");
        }
        else {
            System.out.println(ssn+" is an invalid social security number");
        }
    }
}

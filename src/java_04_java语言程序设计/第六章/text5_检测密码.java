package java_04_java语言程序设计.第六章;

import java.util.Scanner;

/**
 * 6.18 ( 检测密码 ） 一些网站对于密码具有一些规则 。 编写一个方法 ， 检测字符串是否是一个有效密码 。
 假定密码规则如下 ：
 • 密码必须至少 8 位字符 。
 • 密码仅能包含字母和数字 。
 • 密码必须包含至少两个数字 。
 编写一个程序 ， 提示用户输入一个密码 ， 如果符合规则 ， 则显示 Valid Password , 否则
 显示 Invalid Password 。
 */
public class text5_检测密码 {

    public static boolean istrue(String s){
        char ch;
        int numcount=0;

      for(int i=0;i<s.length();i++)
      {
          ch=s.toUpperCase().charAt(i);
          if(ch>='A'&&ch<='Z')
              continue;
          else if(ch>='0'&&ch<='9'){
              numcount++;
          }else
              return false;
      }
        return (numcount >= 2)&&(s.length()>=8);
    }

    public static void main(String[] args){
        System.out.print("Enter the password：");
        Scanner input=new Scanner(System.in);
        String password=input.nextLine();
        if(istrue(password))
            System.out.println("Valid Password");
        else
            System.out.println("InValid Password");
    }
}

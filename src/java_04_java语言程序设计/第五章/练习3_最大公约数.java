package java_04_java语言程序设计.第五章;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/30 0030.
 */
public class 练习3_最大公约数 {
    public static void main(String[] args){
       /*解法1：
       int max=1;
        Scanner input=new Scanner(System.in);
        System.out.println("输入第一个数");
        int number1=input.nextInt();
        System.out.println("输入第二个数");
        int number2=input.nextInt();

      for ( int k=2;k<=number1&&k<=number2; k++){
            if(number1%k==0&&number2%k==0)
                max=k;
      }
        System.out.println(number1+" 和 "+number2+"的最大公约数为："+max);
*/
       /*
          解法2：先找出 nl 和 n 2 的最小值 d , 然后依次检验 d , d - 1 , d - 2 ...2 ,1 是否是 nl 和 n 2 的公约数
          第一个满足条件的公约数就是 nl 和 n 2 的最大公约数
        */
        Scanner input=new Scanner(System.in);
        System.out.print("输入第一个数");
        int number1=input.nextInt();
        System.out.print("输入第二个数");
        int number2=input.nextInt();
        int d=(number1<number2)?number1:number2;
        int max=1;
        while (d>1){
            if(number1%d==0&number2%d==0) {
                max = d;
                break;
            }
            d--;
        }
        System.out.println("最大公约数："+max);

    }
}

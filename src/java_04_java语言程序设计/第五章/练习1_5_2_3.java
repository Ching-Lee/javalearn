package java_04_java语言程序设计.第五章;

import java.util.Scanner;

/**
 *示例学习（5.2.3）
 数学减法学习工具程序，每次运行只能产生一道题目，程序可以产生 5 道问题 ，
 在学生回答完所有 5 个问题后，报告回答正确的题数。这个程序还显示该测试所花的时间，
 并列出所有的题目 。
 */
public class 练习1_5_2_3 {
    public static void main(String[] args){
        final int maxcount=5;
        int correct=0;
        String output=" ";
        Scanner input=new Scanner(System.in);
        long starttime=System.currentTimeMillis();
        for(int count=0;count<maxcount;count++){
            int number1= (int)(Math.random()*10);
            int number2=(int)(Math.random()*10);
            if(number1<number2){
                int temp=number1;
                number1=number2;
                number2=temp;
            }
            System.out.print("what is "+number1+"-"+number2+" ? ");
            int answer=input.nextInt();
            if(number1-number2==answer){
                System.out.println("You are correct");
                correct++;
            }else {
                System.out.println("Your answer is wrong");
                System.out.println(number1+"-"+number2+" should be "+(number1-number2));
            }
            output+="\n"+number1+"-"+number2+"="+answer+" "+((number1-number2==answer) ? "correct":"wrong");
        }
        long endTime=System.currentTimeMillis();
        long testTime=endTime-starttime;
        System.out.println("\n"+"Correct count is "+correct);
        System.out.println("Test time is "+testTime+" seconds");
        System.out.println(output);


    }
}

package java_04_java语言程序设计.第五章;

import java.util.Scanner;

/**
 * 5.1
 * ( 统计正教和负數的个教然后计算这些教的平均值 ） 编写程序 ， 读人未指定个数的整数 ， 判断读人
 的正数有多少个 ， 读入的负数有多少个 ， 然后计算这些输人值的总和及其平均值 （ 不对 0 计数 ) 。
 当输人为 0 时 ， 表明程序结束 。 将平均值以浮点数显示 。 下面是一个运行示例 ：
 Enter an integer , the input ends if it is 0 : 1 2 - 1 3 0
 The number of positives is 3
 The number of negatives is 1
 The total is 5.0
 The average is 1.25
 Enter an integer , the input ends if it is 0 : 0
 No numbers are entered except 0
 */
public class 课后text1 {
    public static void main(String[] args){
        System.out.print("Enter an integer , the input ends if it is 0 :");
        Scanner input =new Scanner(System.in);
        float total=0;
        int positive=0;
        int negative=0;
        int count=0;
        int number=input.nextInt();
        while (number!=0){

            if(number>0)
                positive++;
            else
                negative++;
            count++;
            total=total+number;
            number=input.nextInt();
        }

        if(count==0){
            System.out.println("No numbers are entered except 0");
        }else {
            System.out.println("The number of positives is "+positive);
            System.out.println("The number of negatives is "+negative);
            System.out.printf("The total is %.1f\n",total);

            System.out.printf("The average is %.2f",total/count);
        }
    }
}

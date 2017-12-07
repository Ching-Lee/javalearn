package java_04_java语言程序设计.第五章;

import java.util.Scanner;

/**
 * * 5.41 ( 最大数的出现次数 ） 编写程序读取整数 ， 找出它们的最大数 ， 然后计算该数的出现次数 。 假设
 输人是以 0 结束的 。 假定输人是 3 5 2 5 5 5 0 , 程序找出最大数 5 , 而 5出现的次数是 4 。
 */
public class 课后text11 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("请输入：");
        int num=input.nextInt();
        int max=0;
        int count=0;
        while (num!=0){
            if(num>max)
            {
                max=num;
                count=1;
                num=input.nextInt();
                continue;
            }
            else if (num==max) {
                count++;
                num=input.nextInt();
            }
            else {
                num=input.nextInt();
            }

        }
        System.out.println("最大数为："+max+" 出现次数："+count);
    }

}

package java_04_java语言程序设计.第五章;

/**
 * 5.27( 显示闰年 ） 编写程序 ， 显示从101到 2100 期间所有的闰年 ， 每行显示10个 。 数字之间用一个
 空格字符隔开 ， 同时显示这期间闰年的数目 。
 */
public class 课后text5 {
    public static void main(String[] args){
        int count=0;
        for (int i=101;i<=2100;i++){
            if((i%4==0&&i%100!=0)||i%400==0){
                count++;
                if(count%10==0) System.out.println(i);
                else System.out.print(i+" ");
            }
        }
    }
}

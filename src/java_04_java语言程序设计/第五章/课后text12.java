package java_04_java语言程序设计.第五章;

/**
 *  ( 数学方面 ： 组合 ） 编写程序 ， 显示从整数 1 到 7 中选择两个数字的所有组合 ， 同时显示所冇组
 合的总数 。
 */
public class 课后text12 {
    public static void main(String[] args){
        int count=0;
        for(int i=1;i<=7;i++){
            for(int j=i+1;j<=7;j++) {
                System.out.println(i + " " + j);
                count++;
            }
        }
        System.out.println("count is:"+count);
    }
}

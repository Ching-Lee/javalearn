package java_04_java语言程序设计.第五章;

/**5.33
 * ( 完全数 ） 如果一个正整数等于除它本身之外其他所有除数之和 ， 就称之为完全数 。 例如 ： 6 是第一个完全数 ， 因为 6 - 1 + 2 + 3 。 下一个完全数是 28 - 14 + 7 + 4 + 2 + 1 。 10 000 以下的完全数有四个 。
 编写程序 ， 找出这四个完全数。
 */
public class 课后text7 {
    public static void main(String[] args){
        for(int number=6;number<=10000;number++){
            int sum=0;
            for(int divisor=number-1;divisor>=1;divisor--){
                if(number%divisor==0){
                    sum=sum+divisor;
                }
            }
            if(sum==number){
                System.out.println(number);
            }
        }
    }
}

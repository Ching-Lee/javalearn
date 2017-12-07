package java_04_java语言程序设计.第六章;

/**
 * 6.1 ( 數学 ： 五角数 ） 一个五角数被定义为n(3n-1)/2, 其中 n = l , 2 , . . . 。 所以 , 开始的几个数字就是 1 ,
 5 , 12 , 22 , 编写下面的方法返回一个五角数 ：public static int getPentagonalNumber ( int n )
 编写一个测试程序显示前 100 个五角数 ， 每行显示 10 个 。
 */
public class text1_五角数 {
    public static int getPentagonalNumber ( int n ){
        int result=n*(3*n-1)/2;
        return result;
    }
    public static void main(String[] args){
        int number;
        for(int i=1;i<=100;i++){
            number=getPentagonalNumber(i);
            if(i%10==0)System.out.println(number);
            else System.out.print(number+" ");
        }
    }
}

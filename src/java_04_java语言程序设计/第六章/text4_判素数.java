package java_04_java语言程序设计.第六章;

/**
 * 6.10 ( 使用 isPrime 方法 ） 程序清单 6 - 7 提供了测试某个数字是否是素数的方法 isPrime ( int
 number ) 。 使用这个方法求小于 10000 的素数个数 。
 */
public class text4_判素数 {
    public static boolean isPrime(int number){
        for(int k=2;k<=Math.sqrt(number);k++)
            if(number%k==0)
                return false;
        return true;
    }

    public static void main(String[] args){
        int count=0;
        for(int i=2;i<10000;i++)
            if(isPrime(i))
                count++;
        System.out.println(count);
    }
}

package java_04_java语言程序设计.第六章;

/**
 * 6.28 ( 梅森素數 ） 如果一个素数可以写成 2^p-1的形式 ， 其中 p 是某个正整数 ， 那么这个素数就称作梅
 森素教 。 编写程序 ， 找出 p <=31 的所有梅森素数 ， 然后显示如下的输出结果 ：
 */
public class text7_梅森素数 {
    public static void printTitle(){
        System.out.println("p                             2^p-1");
        System.out.println("————————————————————");
    }
    public static boolean isSu(int number){
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        printTitle();
        int number;
        for(int p=2;p<=31;p++){
            number= (int) (Math.pow(2,p)-1);
            if(isSu(number))
                System.out.println(p+"                             "+number);
        }
    }
}

package java_04_java语言程序设计.第六章;

/**
 *6.29 ( 双素数） 双素数是指一对差值为 2 的素数 。 例如 ： 3 和 5 就是一对双素数 ， 5 和 7 是一对双素数 ，
 而 11 和 13 也是一对双素数 。 编写程序 ， 找出小于 1000 的所有双素数 。 显示结果如下所示 ：
 */
public class text8_双素数 {
    public static boolean isSu(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++)
            if (number % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        int p = 2;
        for (int i = 2; i < 1000; i++) {
            if (isSu(i)){
                if (i - p == 2)
                    System.out.println("(" + p + "," + i + ")");
                p = i;
            }
        }
    }
}

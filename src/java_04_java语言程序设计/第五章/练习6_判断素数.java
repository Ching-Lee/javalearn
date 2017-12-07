package java_04_java语言程序设计.第五章;

/**
 *   分 5 行显示前 50 个素数 ， 每行包含10 个数字 。
 */
public class 练习6_判断素数 {
    public static void main(String[] args){
        final int MAX_COUNT=50;
        final int MAX_COUNT_LINE=10;
        int suCount=0;
        int number=2;

        while(suCount<MAX_COUNT){
            boolean isSu=true;
            for(int i=2;i<=Math.sqrt(number);i++){
                if(number%i==0) {
                    isSu = false;
                    break;
                }
            }
            if(isSu) {
                suCount++;
                if (suCount % MAX_COUNT_LINE == 0)
                    System.out.println(number);
                else
                    System.out.print(number + " ");
            }
            number++;

        }
    }
}

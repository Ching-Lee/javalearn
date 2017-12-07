package java_04_java语言程序设计.第六章;

/**6.26
 * ( 田文索數 ） ® 文素教是指一个数同时为素数和回文数 。 例如 ： 131 是一个素数 ， 同时也是一个
 回文素数 。 数字 313 和 757 也是如此 。 编写程序 ， 显示前 100 个回文素数 。 每行显示 10 个数
 并且准确对齐 ， 数字中间 ， 空格隔开 。 如下所示 ：
 2 3 S 7 11 101 131 151 181 191
 313 3 SB 373 383 727 7 S 7 787 797 919 929
 */
public class text6_回文素数 {
   private static boolean isHuwen(int num){
       int rev=0;
       int startnum=num;
       while (num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
       return rev == startnum;
   }
   private static boolean isSu(int num){
       for(int k=2;k<=Math.sqrt(num);k++)
           if(num%k==0)
               return false;
       return true;
   }

   public static void main(String[] args){
       int count=0;
       int i=2;
       while(count<100){
           if(isHuwen(i)&&isSu(i)){
               count++;
               if(count%10==0)
                   System.out.println(i);
               else
                   System.out.print(i+" ");
           }
           i++;
       }
   }

}

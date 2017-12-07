package java_04_java语言程序设计.第五章;

/**
 *  5.20 ( 打印 2 到 1000 之间的素數 ） 修改程序清单 5 - 15 , 打印 2 到 1000 之间 、 包括 2 和 1000 的所有
 素数 ， 每行显示 8 个素数 。 数字之间用一个空格字符隔
 */
public class 课后text4 {
    public static void main(String[] args){
        int sucount=0;
        for(int num=2;num<=1000;num++)
        {
            boolean isSu=true;
            for(int k=2;k<=Math.sqrt(num);k++)
            {
                if(num%k==0){
                    isSu=false;
                    break;
                }
            }
            if(isSu){
                sucount++;
                if(sucount%8==0)
                    System.out.println(num);
                else
                    System.out.print(num+" ");
            }
        }
    }
}

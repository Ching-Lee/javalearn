package java_04_java语言程序设计.第18章_递归;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/11/27 0027.
 */
public class text2_斐波那契 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int index=input.nextInt();
        //System.out.println(fib(index));
        System.out.println(fib2(index));
    }

    /**
     * 使用递归实现，效率（O（2的n次方））
     * @param index
     * @return
     */
    private static int fib(int index) {
        if(index==0)
            return 0;
        else if (index==1)
            return 1;
        else
            return fib(index-2)+fib(index-1);
    }

    /**
     * 不使用递归，效率（O(n)）
     */
    private static long fib2(int index){
        long f0=0;
        long f1=1;
        long f2=1;
        if(index==0)return f0;
        if (index==1)return f1;
        if (index==2)return f2;
        for(int i=3;i<=index;i++){
            f0=f1;
            f1=f2;
            f2=f0+f1;
        }
        return f2;


    }



}

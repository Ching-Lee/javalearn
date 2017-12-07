package java_04_java语言程序设计.第18章_递归;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/11/27 0027.
 */
public class text6_汉诺塔 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        moveDisks(n,'A','B','C');
    }
   //目的就是移到B
    private static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
       if(n==1)
           //如果只有一个，直接从A移到B
           System.out.println("move disk "+n+" from "+fromTower+" to "+toTower);
       else{
           //将前n-1个从A移到C
           moveDisks(n-1,fromTower,auxTower,toTower);
           //将第n个从A移到B
           System.out.println("move disk "+n+" from "+fromTower+" to "+toTower);
           //将n-1个从C移到B
           moveDisks(n-1,auxTower,toTower,fromTower);
       }
    }
}

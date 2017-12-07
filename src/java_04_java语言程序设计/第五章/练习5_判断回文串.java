package java_04_java语言程序设计.第五章;

import java.util.Scanner;

/**5.10
 * 如果一个字符串从前往后 ， 以及从后往前是一样的 ， 那么它就是一个回文 。 例如 ，
 “ mom ” 、 “ dad ” ， 以及 “ noon ” , 都是回文 。
 要解决的问题是 ， 编写一个程序 ， 提示用户输人一个字符串 ， 然后给出该字符串是否是回文 。
 */
public class 练习5_判断回文串 {
    public static void main(String[] args){
        System.out.print("输入字符串：");
        Scanner input =new Scanner(System.in);
        String inString=input.nextLine();
        boolean isPail=true;
        for(int low=0,high=inString.length()-1;low<high;low++,high--){
            if(inString.charAt(low)!=inString.charAt(high)){
                isPail=false;
                break;
            }
        }
        if(isPail)
            System.out.println(inString+"是回文串");
        else
            System.out.println(inString+"不是回文串");

    }
}

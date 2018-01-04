package java_04_java语言程序设计.第四章;


import org.junit.Test;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/28 0028.
 */
public class String类型_2 {
    @Test
    public void fun(){
        String message="Welcome to Java";
        System.out.println("message的长度为："+message.length());
        System.out.println("message的第五个字母是："+message.charAt(4));
        String s2="And HTML";
        String s3=message.concat(s2);
        System.out.println(s3);
        /*java提供了连接字符串的简便方法+,加号 （ + ) 也可用于连接数字和字符串 。
         在这种情况下，先将数字转换成字符串 ， 然后再进行连接 。
         注意 ， 若要用加号实现连接功能 ， 至少要有一个操作数必须为字符串 。
         如果操作数之一不是字符串 （ 比如 ， 一个数字 ) ， 非字符串值转换为字符串 ， 并与另外一个字符串连接 。*/
         message=message+s2;
         System.out.println(message);

        System.out.println("welcome".toUpperCase());
        System.out.println("WELCOME".toLowerCase());
        //方法 tHm ( ) 通过删除字符串两端的空白字符返回一个新字符串 。 字符• 1 、\ t 、 \ f 、 \ r 、或者 \ n 被称为空白字符 。
        System.out.println("  Good Night  ".trim());

    }
    @Test
    public void fun2(){
        /*
        获取姓和名
         */
        String name="Kim Jones";
        int k=name.indexOf(' ');
        String firstName=name.substring(0,k);
        String lastName=name.substring(k+1);
        System.out.println("firstName is "+firstName);
        System.out.println("lastName is "+lastName);

        System.out.println(1+"Welcome"+1+1);
        System.out.println(1+"Welcome"+(1+1));
        System.out.println(1+"Welcome"+'a'+1);
        System.out.println(1+"Welcome"+('\u0001'+1));



    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter three words :");
        String s1=input.next();
        String s2=input.next();
        String s3=input.next();
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println("s3:"+s3);
        /*
         * 直接读取一行
         * 为了避免输入錄误 ， 不要在 nextByteO 、 nextShortO 、 nextlntO 、 nextLongO 、
         nextFloat () 、 nextDoubleO 和 next ( ) 之后使用 nextLineO
         */
        System.out.print("Enter a line :");
        input=new Scanner(System.in);
        String line=input.nextLine();
        System.out.println("line:"+line);
        //从控制台获取字符： 调用 nextLineO 方法读取一个字符串 ， 然后在字符串上调用charAt ( O ) 来返回一个字符
        char ch=line.charAt(3);
        System.out.println("line的第四个字符是："+ch);

    }
}

package java_04_java语言程序设计.第十章_面向对象的思考;

import java.util.Scanner;



/**
 * 判断回文串时忽略既非字母又非数字的字符
 */
public class HuiwenIgnoreNonwd {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        System.out.print("忽略非字母又非数字的字符后"+s+"是回文串吗？"+isHuiWen(s));
    }

    private static boolean isHuiWen(String s) {
        //调用过滤方法返回新串
        String filters=filter(s);
        return filters.equals(reverse(filters));
    }

    private static String filter(String s) {
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<s.length();i++){
            //如果字母是数字或字符
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c))
                stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    private static String reverse(String s){
        StringBuilder stringBuilder=new StringBuilder(s);
        return stringBuilder.reverse().toString();
    }

}

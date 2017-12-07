package java_04_java语言程序设计.第18章_递归;

import java.util.Scanner;

/**
 *
 */
public class text3_回文串 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        return isPalindrome(s,0,s.length()-1);
    }

    private static boolean isPalindrome(String s, int low, int high) {
        if(low>=high)
            return true;
        else if(s.charAt(low)!=s.charAt(high))
            return false;
        else return isPalindrome(s,low+1,high-1);
    }


    /*
    private static boolean isPalindrome(String s) {
        if(s.length()<=1)
            return true;
        else if (s.charAt(0)!=s.charAt(s.length()-1))
            return false;
        else
            return isPalindrome(s.substring(1,s.length()-1));
    }*/


/*
    非递归方法
    private static boolean isPalindrome(String s) {
        if(s.length()==1)
            return true;
        else
        {
            for(int i=0,j=s.length()-1;i<j;i++,j--)
                   if(s.charAt(i)!=s.charAt(j))
                       return false;
        }

        return true;
    }
}*/

}
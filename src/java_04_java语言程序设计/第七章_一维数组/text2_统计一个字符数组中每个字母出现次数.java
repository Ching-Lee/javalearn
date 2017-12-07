package java_04_java语言程序设计.第七章_一维数组;


/**
 *  用于统计一个字符数组中每个字母出现的次數 。
 *  1 ) 随机生成 100 个小写字母并将其放人一个字符数组中 ，
    2 ) 对数组中每个字母出现的次数进行计数 。 为了完成这个功能 ，
     创建一个具有26 个 int 值的数组 counts , 每个值存放每个宇母出现的次数 。
 *
 */
public class text2_统计一个字符数组中每个字母出现次数 {
    public static void main(String[] args){
        char[] chars=createArray();
        int[] counts=countLetters(chars);
        displayChars(chars);
        displayCounts(counts);
    }



/*
*    随机生成100个小写字母并放入数组中
* */
    private static char[] createArray() {
        char[] chars=new char[100];
        for(int i=0;i<100;i++){
           chars[i]= (char) ((int)('a'+Math.random()*('z'-'a')));
        }
        return chars;
    }


    /*
        创建记录26个英文字母出现次数的数组，int counts
     */
    private static int[] countLetters(char[] chars) {
        int counts[]=new int[26];
        for(int i=0;i<chars.length;i++)
            counts[chars[i]-'a']++;
        return counts;
    }

    /*
       显示输入的100个字符
     */
    private static void displayChars(char[] chars) {
        System.out.println("输入的字符为：");
        for(int i=0;i<chars.length;i++){
            if((i+1)%20==0)
                System.out.print(chars[i]+"\n");
            else
                System.out.print(chars[i]+" ");

        }
    }

    /*
       显示26个字符出现的次数
     */
    private static void displayCounts(int[] counts) {
        System.out.println("各字母出现的个数为：");
        char ch;
        for(int i=0;i<counts.length;i++){
            if((i+1)%10==0)
            {
                ch= (char) ('a'+counts[i]);
                System.out.print(counts[i]+" "+ch+"\n");
            }
            else {
                ch= (char) ('a'+counts[i]);
                System.out.print(counts[i]+" "+ch+" ");
            }

        }
    }
}

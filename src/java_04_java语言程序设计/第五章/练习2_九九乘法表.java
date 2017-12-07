package java_04_java语言程序设计.第五章;

/**
 * 使用嵌套 for 循环打印一个乘法表的程序
 */
public class 练习2_九九乘法表 {
   public static void main(String[] args){
       System.out.println("             Multiplication Table");
       System.out.print("  ");
       for(int i=1;i<=9;i++){
           System.out.print("    "+i);
       }
       System.out.println("\n---------------------------------------------------");
       for(int i=1;i<=9;i++){
           System.out.print(i+"|");
           for(int j=1;j<=9;j++){
               System.out.printf("%5d",i*j);
           }
           System.out.println();
       }




   }
}

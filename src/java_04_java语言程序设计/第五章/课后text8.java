package java_04_java语言程序设计.第五章;

import java.util.Scanner;

/**
 * ( 游戏 ： 剪刀 、 石头 、 布 ） 编写可以玩流行的剪刀 - 石头 - 布游戏的程序 。 （ 剪刀可以剪布 ， 石头可以砸剪刀 ， 而布可以包石头 。 ） 程序提示用户随机产生一个数 ， 这个数为 0 、 1 或者 2 , 分别表
 示石头 、 剪刀和布 。 程序提示用户输入值 0 、 1 或者 2 , 然后显示一条消息 ， 表明用户和计算机
 谁贏了游戏 ， 谁输了游戏 ， 或是打成平手 。 让用户可以连续地玩这个游戏 ， 直到用户或者计算机贏对手两次以上为止 。
 */
public class 课后text8 {
    public static void main(String[] args){
        int computerNumber;
        Scanner input=new Scanner(System.in);
        int userNumber;
        int count=0;
        while((count<2&&count>=0)||(count>-2&&count<=0)) {
            computerNumber= (int) (Math.random()*3);
            System.out.print("scissor(0),rock(1),paper(2):");
            userNumber=input.nextInt();
            switch (computerNumber) {
                case 0:
                    if (userNumber == 0)
                        System.out.println("The computer is scissor.You are scissor too.It is a draw");
                    if (userNumber == 1) {
                        System.out.println("The computer is scissor.You are  rock.You won");
                        count++;
                    }

                    if (userNumber == 2) {
                        System.out.println("The computer is scissor.You are paper.You lose");
                        count--;
                    }
                    if(userNumber!=1&&userNumber!=2&&userNumber!=0){
                        System.out.println("用户输入错误，只能输入0，1，2");
                        System.exit(1);
                    }
                    break;
                case 1:
                    if (userNumber == 0) {
                        System.out.println("The computer is  rock，You are scissor .You lose");
                        count--;
                    }
                    if (userNumber == 1)
                        System.out.println("The computer is  rock.You are  rock.It is a draw");
                    if (userNumber == 2) {
                        System.out.println("The computer is  rock.You are paper.You won");
                        count++;
                    }
                    if(userNumber!=1&&userNumber!=2&&userNumber!=0){
                        System.out.println("用户输入错误，只能输入0，1，2");
                        System.exit(1);
                    }
                    break;
                case 2:
                    if (userNumber == 0) {
                        System.out.println("The computer is  paper，You are scissor .You won");
                        count++;
                    }
                    if (userNumber == 1) {
                        System.out.println("The computer is  paper.You are  rock.You lose");
                        count--;
                    }
                    if (userNumber == 2) {
                        System.out.println("The computer is paper.You are paper.It is a draw");
                    }
                    if(userNumber!=1&&userNumber!=2&&userNumber!=0){
                        System.out.println("用户输入错误，只能输入0，1，2");
                        System.exit(1);
                    }
                    break;
            }
            System.out.println(count);
        }

        if(count>0){
            System.out.println("game over,you won 2 times");
        }else {
            System.out.println("game over,The computer won 2 times");
        }
    }
}

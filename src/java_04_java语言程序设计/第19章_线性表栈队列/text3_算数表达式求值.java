package java_04_java语言程序设计.第19章_线性表栈队列;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Administrator on 2017/11/28 0028.
 */
public class text3_算数表达式求值 {
    public static void main(String[] args){
        System.out.println("输入算数表达式");
        Scanner input=new Scanner(System.in);
        String caculate=input.nextLine();
        try {
            System.out.println(evaluateExpression(caculate));
        }catch (Exception e){
            System.out.println("Wrong expression");
        }

    }

    private static Double evaluateExpression(String caculate) {
        //定义了操作符的栈
        Stack<Character> operatorStack=new Stack();
        //定义了操作数的栈
        Stack<Double> operandStack=new Stack();
        //需要在所有符号前后加上空格，来分割数字，多位数才能正确读取
        caculate=insertBlanks(caculate);
        String[] tokens=caculate.split(" ");
        for(String token:tokens){
            //分割后token，第一个是空格，可能分割后是第一个是空串
            if(token.length()==0)
                continue;
            //如果遇到的是+ -
            if(token.charAt(0)=='+'||token.charAt(0)=='-'){
                while(!operatorStack.isEmpty()&&(operatorStack.peek()=='+'||operatorStack.peek()=='-'||operatorStack.peek()=='*'||operatorStack.peek()=='/')){
                    processAnOperator(operandStack,operatorStack);
                }
                operatorStack.push(token.charAt(0));
            }
            //如果遇到的是* /
            else if(token.charAt(0)=='*'||token.charAt(0)=='/'){
                while (!operatorStack.isEmpty()&&(operatorStack.peek()=='*'||operatorStack.peek()=='/')){
                    processAnOperator(operandStack,operatorStack);
                }
                operatorStack.push(token.charAt(0));
            }
            //如果是（
            else if(token.charAt(0)=='('){
                operatorStack.push(token.charAt(0));
            }
            //如果是）
            else if(token.charAt(0)==')'){
                while (operatorStack.peek()!='('){
                    processAnOperator(operandStack,operatorStack);
                }
                operatorStack.pop();//把（弹出
            }
            //是数字
            else{

               operandStack.push(new Double(token));
            }
        }

        while (!operatorStack.isEmpty()){
            processAnOperator(operandStack,operatorStack);
        }

       //返回最后在数字栈內的值就是结果
        return operandStack.pop();


    }

    private static String insertBlanks(String caculate) {
        String result="";
        for(int i=0;i<caculate.length();i++)
        {
            if(caculate.charAt(i)=='('||caculate.charAt(i)==')'||caculate.charAt(i)=='+'||caculate.charAt(i)=='-'
                    ||caculate.charAt(i)=='*'||caculate.charAt(i)=='/')
                result+=" "+caculate.charAt(i)+" ";
            else
                result+=caculate.charAt(i);
        }
        return result;
    }

    private static void processAnOperator(Stack<Double> operandStack, Stack<Character> operatorStack) {
        char op=operatorStack.pop();
        double num2=operandStack.pop();
        double num1=operandStack.pop();
        switch (op){
            case '+':operandStack.push(num1+num2);break;
            case '-':operandStack.push(num1-num2);break;
            case '*':operandStack.push(num1*num2);break;
            case '/':operandStack.push(num1/num2);break;
        }

    }
}

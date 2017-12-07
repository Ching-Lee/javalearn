package java_04_java语言程序设计.第11章_继承和多态.test5栈的实现;

/**
 * Created by Administrator on 2017/11/9 0009.
 */
public class MyStack {
    private int []elements;
    private int top=-1;
    //设置默认的数组大小
    private static final int DEFAULT_CAPACITY=16;

    public MyStack(){
        elements=new int[DEFAULT_CAPACITY];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public int getsize(){
        return ++top;
    }
    public Object peek(){
        return elements[top];
    }
    public Object pop(){
        int value=elements[top];
        top--;
        return value;
    }
    public void  push(int value) {
        if (getsize() >= DEFAULT_CAPACITY) {
            //如果size>=数组的大小，就将数组的大小扩容
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
    }

}

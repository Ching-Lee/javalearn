package java_04_java语言程序设计.第十章_面向对象的思考;

/**
 * 用数组实现一个栈
 */
public class StackOfIntegers {
    //定义了栈的数组
    private int[] elements;
    //size表示栈内元素大小，size-1就是目前的栈顶元素
    private int size;
    //设置默认的数组大小
    private static final int DEFAULT_CAPACITY=16;

    public StackOfIntegers(){
        elements=new int[DEFAULT_CAPACITY];
    }
    //入栈
    public void push(int value){
        if(size>=elements.length) {
            //如果size>=数组的大小，就将数组的大小扩容
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements=temp;
        }
        elements[size]=value;
        size++;
    }

    //出栈
    public int pop(){
        //要弹出的元素目前在栈顶，size是共有的元素长度，下标是size-1
        int number= elements[size-1];
        //弹出后，size长度减少一个
        size--;
        return number;

    }

    //判栈空
    public boolean empty(){
        return size==0;
    }

    public static void main(String[] args){
        StackOfIntegers stackOfIntegers=new StackOfIntegers();
        for(int i=0;i<10;i++)
            stackOfIntegers.push(i);
        while (!stackOfIntegers.empty())
            System.out.print(stackOfIntegers.pop()+" ");
    }

}

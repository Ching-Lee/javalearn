package java_04_java语言程序设计.第11章_继承和多态;

/**
 * Created by Administrator on 2017/10/30 0030.
 */
public class Test3 {
    public static void main(String[] args){
        //直接调用A1的构造函数，i=40
        new A1();
        //1.B1继承自A1，先去执行A1，给i赋值i=7；
        //2.调用A1的构造函数，由于setI()方法被子类重写，所以此时调用的是子类的setI()方法，i=60
        //3.i from A is 60
        //4.调用B1的构造函数，i在A1中已经被赋值60，所以i from B is 60
        new B1();
    }
}

class A1{
     int i=7;
    public A1(){
        setI(20);
        System.out.println("i from A is "+i);
    }

    public void setI(int i){
        this.i=2*i;
    }
}

class B1 extends A1{
    public B1(){
        System.out.println("i from B is "+i);
    }
    public void setI(int i){
        this.i=3*i;
    }
}

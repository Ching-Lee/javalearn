package java_04_java语言程序设计.第11章_继承和多态;

/**
 *
 */
public class Test2_构造函数执行顺序 {
    public static void main(String[] args){
        A a=new A(3);
    }
}
class A extends B{
    public A(int t){
        System.out.println("A's constructor is invoked");
    }

}
class B{
    public B(){
        System.out.println("B's constructor is invoked");
    }
}
package java_03_java反射应用之动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理的使用
 */

interface Subject {
    void action();
}


//被代理类
class RealSubject implements Subject{

    @Override
    public void action() {
        System.out.println("我是被代理类");
    }
}

class MyInvocationHandler implements InvocationHandler{
    Object obj;//实现了接口的被代理类的对象的声明
    //1.给被代理的对象实例化2.返回一个代理类的对象
    public Object blind(Object obj){
        this.obj=obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);
    }

    //当通过代理类的对象发起对重写的方法调用时，都会转换为对如下的invoke方法的调用
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //method方法的返回值时returnVal
        Object returnVal = method.invoke(obj,args);
        return returnVal;
    }
}

public class TestProxy {
    public static void main(String[] args){
        //1.被代理类的对象
        RealSubject real=new RealSubject();
        //2.创建了一个实现了InvacationHandler接口类的对象
        MyInvocationHandler handler=new MyInvocationHandler();
        //3.调用blind()方法，动态的返回一个同样实现了real所在类实现的接口的代理类对象。
        Object obj=handler.blind(real);
        Subject sub=(Subject) obj;//此时sub就是代理类的对象
        sub.action();//转到对InvacationHandler接口的实现类的invoke()方法的调用

    }
}

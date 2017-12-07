package java_02_反射;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by Administrator on 2017/5/17 0017.
 */
public class TestMethod {
    //1.获取运行时类的方法
    @Test
    public void test1(){
        Class clazz = Person.class;
        //1.getMethods():获取运行时类及其父类中所有的声明为public的方法
        Method[] methods=clazz.getMethods();
        for(Method m:methods){
            System.out.println(m);
        }
        System.out.println("**************************************************");
        //2.getDeclaredMethods():获取运行时类本身声明的所有方法
        Method[] m2 = clazz.getDeclaredMethods();
        for(Method m:m2){
            System.out.println(m);
        }

    }
    //注解 权限修饰符 返回值类型 方法名 形参列表 异常
    @Test
    public void test2(){
        Class clazz = Person.class;
        Method[] methods=clazz.getDeclaredMethods();
        for (Method m:methods){
            //1.注解
            Annotation[] annotations=m.getAnnotations();
            for(Annotation a:annotations) {
                System.out.println(a);
            }

            //2.权限修饰符
            String str = Modifier.toString(m.getModifiers());
            System.out.print(str+" ");

            //3.返回值类型
            Class returnType=m.getReturnType();
            System.out.print(returnType.getName()+" ");

            //4.方法名
            System.out.print(m.getName());

            //5.形参列表
            System.out.print("(");
            Class[] params = m.getParameterTypes();
            int i=0;
            for(Class p:params){
                System.out.print(p.getName()+" arg"+i);
                i++;
            }
            System.out.print(")");

            //6.异常类型
            Class[] exps=m.getExceptionTypes();
            if(exps.length!=0){
                System.out.print(" throws ");
            }
            for (int j=0;j<exps.length;j++){
                System.out.print(exps[j].getName()+" ");
            }
            System.out.println();
        }
    }


    @Test
    public void test3() throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz=Person.class;
        //getMethod（String methodName,Class ...params）:获取运行时类中声明为public的方法
        Method show = clazz.getMethod("show");
        Person p= (Person) clazz.newInstance();
        //调用指定的方法：Object invoke（Object obj,Object ... obj）
        Object returnVal=show.invoke(p);//我是一个人
        //方法没有返回值，返回为null
        System.out.println(returnVal);
        Method toString=clazz.getMethod("toString");
        Object returnStr=toString.invoke(p);
        System.out.println(returnStr);
        //静态方法通过类来调用
        Method info=clazz.getMethod("info");
        info.invoke(Person.class);

        //getDeclaredMethod（String methodName,Class ...params）获取私有方法
        Method yeahNo=clazz.getDeclaredMethod("yeah");
        yeahNo.setAccessible(true);
        yeahNo.invoke(p);

        Method yeahYes=clazz.getDeclaredMethod("yeah",String.class,Integer.class);
        yeahYes.setAccessible(true);
        Object val=yeahYes.invoke(p,"我是带参数的yeah",10);
        System.out.println(val);

    }
}

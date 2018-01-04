package java_02_反射;


import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Administrator on 2017/5/17 0017.
 */
public class TsetConstructor {
    @Test
    public void  test1() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className="java_02_反射.Person";
        Class clazz = Class.forName(className);
        //创建对应的运行时类的对象。使用newInstance()，实际上就是调用了运行时类的空参的构造器
        //要想能够创建成功：
        // 1.要求对应的运行时类要有空参的构造器
        // 2.构造器的权限修饰符的权限要足够

        Object object=clazz.newInstance();//空参
        Person p=(Person) object;
        System.out.println(p);

    }

    @Test
    public void test2() throws ClassNotFoundException {
        String className="java_02_反射.Person";
        Class clazz = Class.forName(className);
        Constructor[] cons=clazz.getDeclaredConstructors();
        for(Constructor c:cons){
            System.out.println(c);
        }
    }

    //调用指定的构造器
    @Test
    public void test3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String className="java_02_反射.Person";
        Class clazz = Class.forName(className);
        Constructor cons=clazz.getDeclaredConstructor(String.class,int.class);
        cons.setAccessible(true);
        //创建带参对象
        Person p= (Person) cons.newInstance("罗威",20);
        System.out.println(p);

    }


}

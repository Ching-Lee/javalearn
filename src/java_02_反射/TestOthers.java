package java_02_反射;


import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by Administrator on 2017/5/17 0017.
 */
public class TestOthers {
    @Test
    public void test1(){
        //1.获取父类不带泛型
        Class clazz = Person.class;
        Class superClass=clazz.getSuperclass();
        System.out.println(superClass);
        System.out.println("************************************************************");

        //2.带泛型的父类
        Type type=clazz.getGenericSuperclass();
        System.out.println(type);
        System.out.println("*************************************************************");

        //3.获取父类的泛型
        ParameterizedType param= (ParameterizedType) type;
        Type[] args=param.getActualTypeArguments();
        System.out.println(args[0].getTypeName());
        System.out.println("*************************************************************");


        //4.获取实现的接口
        Class[] interfaces=clazz.getInterfaces();
        for (Class i:interfaces){
            System.out.println(i);
        }
        System.out.println("*************************************************************");


        //5.获取所在的包
        Package p=clazz.getPackage();
        System.out.println(p);
        System.out.println("*************************************************************");


        //获取注解
        Annotation[] anns = clazz.getAnnotations();
        for(Annotation a:anns){
            System.out.println(a);
        }


    }
}

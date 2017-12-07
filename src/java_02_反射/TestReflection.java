package java_02_反射;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Created by Administrator on 2017/5/15 0015.
 */
public class TestReflection {
    /**
     * 1.反射的概述和应用
     */

    //在有反射以前，如何创建一个类的对象，并调用其中的方法、属性
    @Test
    public void teat1() throws Exception {
        Person p = new Person();
        p.setAge(10);
        p.setName("Tang");
        System.out.println(p);
        p.show();
        p.display("HK");
    }

    //有了反射，可以通过反射创建一个类的对象，并调用其中的结构
    @Test
    public void test2() throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<Person> clazz = Person.class;
        //1.创建clazz对应的运行时类Person类的的对象
        Person p = clazz.newInstance();
        p.setName("小明");
        System.out.println(p);
        //2.通过反射调用运行时类的指定属性
        //2.1 name是public
        Field f1 = clazz.getField("name");
        f1.set(p, "LiuDeHua");
        System.out.println(p);
        //2.2 age是private则按照上述方法访问会找不到，按照如下方法
        Field f2=clazz.getDeclaredField("age");
        f2.setAccessible(true);//设置访问权限
        f2.set(p,10);
        System.out.println(p);

        //3.通过反射调用运行的方法
        Method m1=clazz.getMethod("show");
        m1.invoke(p);

        Method m2=clazz.getMethod("display",String.class);
        m2.invoke(p,"Beijing");
    }
    /**
     * 2.反射的源头java.lang.Class 返回对象的运行时类
     * 我们创建了一个类，通过编译（javac.exe）,生成对应的class文件。之后我们
     * 使用java.exe加载（JVM的类加载器）此.class文件,此.class文件加载到内存以后
     * ，就是一个运行时类，存在缓存区。那么这个运行时类本身就是一个Class的实例
     * 1.每一个运行时类只加载一次！
     * 2.有了Class类的实例以后，我们才可以进行如下的操作：
     *      1）*创建对应的运行时类的对象
     *      2）获取对应的运行时类的完整结构（属性、方法、构造器、内部类、父类、所在的包、异常、注解。。。）
     *      3）*调用对应的运行时类指定的结构（属性、方法、构造器）
     *      4）反射的应用，动态代理
     */
    @Test
    public void test3(){
        Person p=new Person();
       Class clazz=p.getClass();//通过运行时类的对象，调用getClass(),返回其运行时类
       System.out.println(clazz);
    }

    //如何获取Class的实例
    @Test
    public void test4() throws ClassNotFoundException {
        //1.调用运行实例本身的.class属性
        Class clazz1=Person.class;
        System.out.println(clazz1.getName());
        Class clazz2=String.class;
        System.out.println(clazz2.getName());
        //2.通过运行时类的对象获取
        Person p=new Person();
        Class clazz3=p.getClass();
        System.out.println(clazz3);
        //3.通过Class的静态方法获取
        String className = "java_02_反射.Person";
        Class clazz4 = Class.forName(className);
        System.out.println(clazz4.getName());
        //4.通过类的加载器
        ClassLoader classLoader=this.getClass().getClassLoader();
        Class clazz5=classLoader.loadClass(className);
        System.out.println(clazz5.getName());
    }

    //关于类的加载器ClassLoader
    @Test
    public void test5() throws ClassNotFoundException, IOException {
        //系统类加载器
        ClassLoader loader1=ClassLoader.getSystemClassLoader();
        System.out.println(loader1);
        //扩展类加载器
        ClassLoader loader2=loader1.getParent();
        System.out.println(loader2);
        //引导类加载器不能获取
        ClassLoader loader3=loader2.getParent();
        System.out.println(loader3);
        //自定义的类是由系统加载器加载的
        Class clazz1 = Person.class;
        ClassLoader loader4=clazz1.getClassLoader();
        System.out.println(loader4);
        //核心类库加载不到
        String className="java.lang.Object";
        Class clazz2 = Class.forName(className);
        ClassLoader loader5 = clazz2.getClassLoader();
        System.out.println(loader5);

        //掌握如下
        // 1.加载文件，若文件在包下
        ClassLoader loader=this.getClass().getClassLoader();
       InputStream is=loader.getResourceAsStream("java_02_反射\\jdbc.properties");
        Properties properties=new Properties();
        properties.load(is);
        String user =properties.getProperty("user");
        System.out.println(user);
        String password = properties.getProperty("password");
        System.out.println(password);

        //2.若文件在当前的工程下
        FileInputStream fileInputStream=new FileInputStream(new File("jdbc1.properties"));
        Properties properties1=new Properties();
        properties1.load(fileInputStream);
        String user1 =properties1.getProperty("username");
        System.out.println(user1);
        String password1 = properties1.getProperty("password");
        System.out.println(password1);


    }

}

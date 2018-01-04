package java_02_反射;


import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


public class TestField {
    //1.获取对应的运行时类的属性
    @Test
    public void test1() {
        Class clazz = Person.class;
        //1.getFields():只能获取到运行时类中及其父类中声明为public的属性
        Field[] fields = clazz.getFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
        }
        System.out.println("************************************************");
        //2.getDeclaredFields()获取运行时类本身声明的所有属性
        Field[] fields1 = clazz.getDeclaredFields();
        for (Field f : fields1) {
            System.out.println(f.getName());
        }
    }

    //2.权限修饰符  变量类型  变量名
    @Test
    public void test2() {
        Class clazz = Person.class;
        Field[] field1 = clazz.getDeclaredFields();
        for (Field f : field1) {
            //1.获取每个属性的权限修饰符
            int i = f.getModifiers();
            String str1 = Modifier.toString(i);
            System.out.print(str1 + " ");
            //2.获取属性的类型
            Class type = f.getType();
            System.out.print(type + " ");
            //3.获取属性名
            System.out.println(f.getName());
        }
    }

    //调用运行时类指定的属性
    @Test
    public void test3() throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class clazz = Person.class;
        //1.获取指定的属性
        //getField(String fieldName):获取运行时类中声明为public的指定属性名为fieldName的属性
        Field name=clazz.getField("name");
        //2.创建运行时类的对象
        Person p= (Person) clazz.newInstance();
        System.out.println(p);
        //3.将运行时类的指定的属性赋值
        name.set(p,"Jerry");
        //age私有变量：getDeclaredField（String fieldName):获取运行时指定的名为fieldName的属性
        Field age=clazz.getDeclaredField("age");
        //由于属性权限修饰符的限制，为了保证可以给属性赋值，需要在操作前使得此属性可被操作
        age.setAccessible(true);
        age.set(p,10);
        System.out.println(p);

    }

}









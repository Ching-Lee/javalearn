package java_01_泛型;


import org.junit.Test;

import java.util.*;

/**
 * 泛型的使用
 * 1.在集合中使用泛型
 * 2.自定义泛型类、泛型接口、泛型方法
 * 3.泛型与继承的关系
 * 4.通配符
 */
public class TestGeneric {
    //1.在集合中没有使用泛型的情况下
    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(89);
        list.add(87);
        list.add(67);
        //1.没有使用泛型，任何Object及其子类的对象都可以添加进来
        list.add(new String("AA"));
        for(int i=0;i<list.size();i++){
            //2.强转为int型时，可能报ClassCastException的异常
            int score=(Integer) list.get(i);
            System.out.println(score);
        }
    }

    //2.在集合中使用泛型
    @Test
    public void test2(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(78);
        //list.add("AA");报错
        /*for (int i=0;i<list.size();i++)
        {
            int score=list.get(i);//是Integer类型
            System.out.println(score);
        }*/
        Iterator<Integer> it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

    //3.map
    @Test
    public void test3(){
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("A",78);
        map.put("B",87);
        map.put("C",90);
        Set<Map.Entry<String,Integer>> set  = map.entrySet();
        for (Map.Entry<String,Integer> o:set){
            System.out.println(o.getKey()+"---->"+o.getValue());
        }
    }

    @Test
    public void test4(){
        //1.当实例化泛型类的对象时，指明泛型的类型。
        //指明以后，对应的类中所有使用泛型的位置，都变为实例化中指定的泛型的类型。
        //2.如果我们自定义了泛型类，但是在实例化时没有使用，那么默认是object类的
        Order<Boolean> order=new Order<Boolean>();
        order.setT(true);
        System.out.println(order.getT());
        order.add();
        List<Boolean> list= order.list;
        System.out.println(list);

        SubOrder o = new SubOrder();
        List<Integer> list1=o.list;

        //泛型方法 传入什么方法得到什么方法
        //当通过对象调用泛型方法时
        Integer i=order.getE(34);
        Double d=order.getE(2.3);

        Integer[] in=new Integer[]{1,2,3};
        List<Integer> list2=new ArrayList<>();
        List<Integer> list3=order.fromArrayToList(in,list2);
        System.out.println(list3);

    }


    /**
     * 泛型与继承的关系
     * 若类A是类B的子类，那么List<A>就不是List<B>的子接口
     */
    @Test
    public void test5(){
        Object object=null;
        String string="AA";
        object=string;

        Object[] object1=null;
        String[] string1=new String[]{"AA","BB","CC"};
        object1=string1;

        List<Object> list=null;
        List<String> list1 =new ArrayList<String>();
        // list=list1; 类型不匹配
    }

    /**
     * 通配符？
     * List<A>,List<B>。。。都是List<?>的子类
     * ? extends A:可以存放A及其子类
     * ？super A：可以存放A及其父类
     */
    @Test
    public void test6(){
        List<?> list = null;
        List<Object> list1=new ArrayList<Object>();
        List<String> list2=new ArrayList<String>();
        list=list1;
        list=list2;

        show(list1);
        //show(list2);有错
        show1(list1);
        show1(list2);

        List<? extends Number> list3=null;
        List<Integer> list4=new ArrayList<Integer>();
        list3=list4;
       // list3=list1;有错不能实现

        List<? super Number> list5=null;
        list5=list1;

    }

    public void show(List<Object> list){

    }

    public void show1(List<?> list){

    }

    /**
     * 通配符的使用
     */
    @Test
    public void test7(){
        List<String> list = new ArrayList<String>();
        list.add("AA");
        list.add("BB");
        List<?> list1=list;
        //可以读取声明为通配符的集合类的对象
        Iterator<?> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //不允许向声明为通配符的集合类中写入对象,唯一例外的是null
        //list1.add("CC");
        //list1.add(123);
        list1.add(null);
    }



}

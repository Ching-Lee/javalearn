package java_01_泛型;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义泛型类
 */
public class Order<T> {
    private String orderName;
    private int orderId;
    private T t;
    List<T> list = new ArrayList<T>();

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void add() {
        list.add(t);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", t=" + t +
                ", list=" + list +
                '}';
    }

    //声明泛型方法
    public <E> E getE(E e) {  //调用的时候传入一个E类型，返回一个E类型
        return e;

    }

    //实现数组到集合的复制
    public <E> List<E> fromArrayToList(E[] e, List<E> list) {
        for (E e1 : e) {
            list.add(e1);
        }
        return list;
    }

    //静态方法不能使用泛型
    /*public static void show(){
        System.out.println(t);
    }*/

    //不能在try-catch中使用泛型的声明
//    public void info(){
//        try{
//
//        }catch(T e){
//
//        }
//    }


}

//在继承泛型类或泛型接口时，可以指明泛型类型
class SubOrder extends Order<Integer> {

}

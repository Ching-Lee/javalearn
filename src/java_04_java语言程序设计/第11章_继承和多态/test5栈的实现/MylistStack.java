package java_04_java语言程序设计.第11章_继承和多态.test5栈的实现;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/11/9 0009.
 */
public class MylistStack {
    private ArrayList<Object> list=new ArrayList<>();
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public int getSize(){
        return list.size();
    }
    public Object peek(){
        return list.get(getSize()-1);
    }
    public Object pop(){
        Object o=list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;
    }
    public  void push(Object o){
        list.add(o);
    }
}

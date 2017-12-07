package java_04_java语言程序设计.第19章_线性表栈队列;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Administrator on 2017/11/28 0028.
 */
public class text1_线性表 {
    public static void main(String[] args ){
        //ArrayList
        List<Integer> arrayList=new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(0,10);
        arrayList.add(3,30);
        System.out.println(arrayList);




        //linkedList
        LinkedList<Object> linkedList=new LinkedList();
        linkedList.add("red");
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.addFirst("yellow");
        linkedList.removeLast();
        System.out.println(linkedList);
        //从前向后遍历
        ListIterator listIterator=linkedList.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next()+" ");
        }
        System.out.println();
        //从后向前遍历
        listIterator=linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+" ");
        }










    }
}

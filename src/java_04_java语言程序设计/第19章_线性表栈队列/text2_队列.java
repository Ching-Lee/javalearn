package java_04_java语言程序设计.第19章_线性表栈队列;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2017/11/28 0028.
 */
public class text2_队列 {
    public static void main(String[] args){
        //LinkedList实现了List和Deque接口，Deque接口继承了Queue接口，使用LinkedList()创建队列
        Queue queue=new LinkedList();
        queue.offer("hello");
        queue.offer("Queue");
        queue.offer("Deque");
        while (queue.size()>0){
            System.out.print(queue.remove()+" ");
        }
    }
}

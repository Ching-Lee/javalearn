package java_04_java语言程序设计.第四章;

import org.junit.jupiter.api.Test;

/**
 * Created by Administrator on 2017/8/27 0027.
 */
public class 常用数学函数_1 {
    @Test
    public void fun1(){
        /**
         * 1.三角函数
         */
        System.out.println("***************************1.三角函数********************************");
        System.out.println(Math.sin(Math.PI/2)); // sin 90=1
        System.out.println(Math.sin(Math.PI/6)); //sin 30=1/2
        System.out.println(Math.cos(Math.PI/2)); //cos 90=0
        System.out.println(Math.cos(Math.PI/6)); //cos 30=
        System.out.println(Math.tan(Math.PI/4));//tan 45=1
        System.out.println(Math.toDegrees(Math.PI/2));//返回90
        System.out.println(Math.toRadians(90));//返回 3.14/2
        System.out.println(Math.asin(0.5));//返回0.5235 （PI/6）
        System.out.println(Math.acos(0.5));//返回1.0472（PI/3）
        System.out.println(Math.atan(1.0));//返回0.785398（PI/4）

        System.out.println("*****************************2.指数函数******************************");
        System.out.println(Math.exp(1));//返回2.71828
        System.out.println(Math.log(Math.E));//1
        System.out.println(Math.log10(10));//1
        System.out.println(Math.pow(2,3));//8
        System.out.println(Math.sqrt(4));//2

        System.out.println("*****************************3.取整方法******************************");
        System.out.println(Math.ceil(2.3));//>=2.3的最接近的整数，向上取整3
        System.out.println(Math.ceil(3.0));//3
        System.out.println(Math.ceil(-2.1));//-2
        System.out.println(Math.floor(2.5));//<=2.5的最接近的整数 2
        System.out.println(Math.floor(2)); //2
        System.out.println(Math.floor(-2.1));//-3
        System.out.println(Math.rint(2.3));//取离他最近的整数
        System.out.println(Math.rint(2.5));//离两边距离相等时取偶数
        System.out.println(Math.round(2));//floor(2+0.5)=2
        System.out.println(Math.round(2.5));//floor(2.5+0.5)=3
        System.out.println(Math.round(-2.6));//floor(-2.6+0.5)=-3

        System.out.println("*****************************4.min,max和abs方法******************************");
        System.out.println(Math.min(2.3,5));
        System.out.println(Math.max(2,3.5));
        System.out.println(Math.abs(-3.56));//取绝对值

        System.out.println("*****************************4.random方法******************************");
        System.out.println(Math.random());//产生>=0&&<1的double型随机数
        System.out.println(Math.random()*10);//产生>=0&&<10的double型随机数
        System.out.println((int)Math.random()*10);//产生>=0&&<10的int型随机数
        System.out.println(50+Math.random()*50);//产生>=50&&<100的double型随机数




    }


}

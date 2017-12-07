package java_02_反射;

/**
 * Created by Administrator on 2017/5/15 0015.
 */
@MyAnnotation("nwpu")
public class Person extends Creature<String> implements Comparable,MyInterface{
    public String name;
    private int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {

        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @MyAnnotation(value = "abc123")
    public void show(){
        System.out.println("我是一个人");
    }

    public void display(String nation) throws Exception{
        System.out.println("我的国籍是："+nation);
    }

    private void yeah(){
        System.out.println("我是私有方法");
    }

    private  Integer yeah(String stat,Integer val){
        System.out.println(stat);
        return val;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    //内部类
    class  Bird{

    }

    public static void info(){
        System.out.println("我是静态方法");
    }

}

package java_04_java语言程序设计.第11章_继承和多态;

/**
 * 子类重写父类方法的调用
 */
public class Test1 {
    public static void main(String[] args) {
        new Personl().printPerson();
        new Student().printPerson();
    }
}
    class Student extends Personl {
     //声明为public，子类重写了父类的方法，在子类对象调用时，会使用重写的方法
        public String getlnfo(){
            return "Student";
        }
    }

     class Personl {
         public String getlnfo() {
             return "Person";
         }
         //父类调用父类的getInfo()方法，但如果是子类对象调用，父类的getInfo方法已经被重写
         public void printPerson() {
             System . out . println (getlnfo()) ;
         }
     }

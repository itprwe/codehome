package my.javabase.conclusion.classandobject;

/**
 * 顶一个Student类，一类学生对象的抽象应该包含哪些共有的属性，方法
 * <p>
 * 一个类中三种常见的成员：
 * 属性field 或者叫成员变量
 * 方法method
 * 构造器constructor:返回一个类的对象（实例）或生成对象的时候初始化一些数据
 */
public class Student {
    //属性field 或者叫成员变量
    int age;
    String name;
    String classnum;

    //方法method
    void learnEnglish() {
        System.out.println("学习英语");
    }

    void play() {
        System.out.println("玩玩玩---");
    }

    void learn() {
        System.out.println(this.name + " " + age + " " + classnum + " nice!");
    }

    //构造器constructor
    Student() {
    }

    //带参数的构造器
    Student(int age, String name, String classnum) {
        this.age = age;
        this.name = name;
        this.classnum = classnum;
    }
}

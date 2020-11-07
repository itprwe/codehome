package my.prwe;

//3
public class Student {
    //定义类的相关内容，学生的共有特点

    //静态属性
    int id;
    int age;
    String name;

    Computer comp;

    //行为功能实现方法
    void study(){
        System.out.println("学生在学习"+comp.brand);
    }
    void play(){
        System.out.println("学生在玩游戏");
    }

    //构造方法，用于创建这个类的对象，无参构造方法可以由系统自动创建，new来调用创建对象
    Student(){

    }

    //程序的执行入口必须有
    public static void main(String[] args) {
        Student stu = new Student();//创建对象，实际是调用Student的一个构造方法，通过构造方法来创建类，构造方法是系统自动创建的
        stu.name = "prwe";
        stu.id = 1000;
        stu.age = 18;
        Computer c1 = new Computer();
        c1.brand = "apple";
        stu.comp = c1;

        stu.study();
        stu.play();
    }
}

class Computer{
    String brand;
}

//内存分析

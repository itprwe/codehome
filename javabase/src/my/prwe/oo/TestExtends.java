package my.prwe.oo;

//7继承
public class TestExtends {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "prwe";
        stu.height = 111;
        stu.rest();
    }

}

class Person{
    String name;
    int height;

    public void rest(){
        System.out.println("have a rest");
    }
}

class Student extends Person{
//    String name;
//    int height;
    String major;

    public void study(){
        System.out.println("学习两个小时");
    }

//    public void rest(){
//        System.out.println("have a rest");
//    }
}
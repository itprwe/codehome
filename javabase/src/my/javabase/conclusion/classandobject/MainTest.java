package my.javabase.conclusion.classandobject;

public class MainTest {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.learnEnglish();
        stu.play();

        //初始化数据,
        Student stu2 = new Student(22, "prwe", "a1111");
        stu2.learn();

    }
}

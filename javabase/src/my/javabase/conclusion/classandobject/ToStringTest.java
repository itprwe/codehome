package my.javabase.conclusion.classandobject;

/**
 * 重写 toString()方法
 *
 * System.out.println(ts)=System.out.println(ts.toString())
 * 打印方法实际调用了toString()方法
 *
 */
public class ToStringTest {
    public static void main(String[] args) {
        Tstring ts = new Tstring("嘎嘎", 22);
        System.out.println(ts);//重写后的toString()方法

        ToStringTest toStringTest = new ToStringTest();
        System.out.println(toStringTest.toString());//Object的ToString()方法
    }
}

class Tstring {
    String name;
    int age;

    @Override
    public String toString() {
//        return super.toString();
        return name + "，年龄：" + age;
    }

    Tstring(String name, int age) {
        this.name = name;
        this.age = age;

    }
}
package my.javabase.conclusion.classandobject;

import java.io.IOException;

public class RewriteTest {
    public static void main(String[] args) {

    }
}

class People {

    void eat() {
        System.out.println("people eat");
    }

    protected double ptest(int a) throws IOException, Exception {
        System.out.println("peopel ptest"+a);
        return a+2;
    }
}

class Actor extends People {
    //重写，方法名，形参列表相同
    void eat() {
        System.out.println("actor eat");
    }

    //子类的访问权限>=父类
    //子类的exception<=父类
    public double ptest(int b) throws Exception {
        return b+4;
    }

}

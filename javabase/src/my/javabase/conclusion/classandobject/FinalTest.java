package my.javabase.conclusion.classandobject;

/**
 * final 修饰的变量不能重新赋值
 * final 修饰的方法不能被子类重写
 * final 修改的类不能被继承
 */
public class FinalTest {
    public static void main(String[] args) {
        final int A_TEST = 123;
//        A_TEST = 234;//final的变量不能重新赋值
        System.out.println(A_TEST);

    }
}

class Person {
    final void eat() {

    }
}

final class Actors extends Person {

    //不能重写final方法
    /*void eat(){

    }*/
}
//不能继承final修饰的类
/*
class aa extends Actors{

}*/

package my.prwe.oo;

public class TestMyQuestion {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.methodA();
        a.methodB();

    }
}

abstract class Animal{
    public void methodA(){
        System.out.println("aaa");
    }

    public abstract void methodB();
}

class Dog extends Animal{

    public void methodA(){
        System.out.println("dog aaa");
    }

    @Override
    public void methodB() {
        System.out.println("dog mehodB");
    }


}


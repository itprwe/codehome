package my.javabase.conclusion.classandobject;

public class ExtendsTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        //创建的对象是谁，就优先使用谁
        //成员变量等号左边是谁，就优先使用谁
        Animal aDog = new Dog();

        animal.speak();
        System.out.println(animal.common + " -- left is animal");

        dog.speak();
        System.out.println(dog.common + " -- left is dog");

        aDog.speak();
        System.out.println(aDog.common + " -- left is animal");

        System.out.println(Animal.a);
        System.out.println(Dog.a);

        dog.testdog2();
        ((Dog) aDog).testdog2();//创建的父类类型的对象只能调用父类的方法，除非强制转换类型，否则编译器报错
    }
}

class Animal {

    int aId = 123;
    String aName = "animal";
    String common = "acommon";
    //父类私有变量，子类不可继承，其他类不可访问
    private String aSpecial = "special";

    String c;
    static String a = "asdf";

    static {
        String b = "aaa";
    }

    static void testanimal() {
        System.out.println("static testanimal");
    }

    Animal() {
        System.out.println("animal constructor");
    }

    void speak() {
        System.out.println("anmail");
    }

    //父类私有方法，子类不可继承，其他类不可访问
    private void aName() {
        System.out.println("aname");
    }
}

class Dog extends Animal {

    int dId = 123;
    String dName = "animal";
    String common = "dcommon";

    static String a = "dog";

    static {
        String b = "aaa";
    }

    static void testdog() {
        System.out.println("static testdog");

    }

     void testdog2() {
         System.out.println("nomal testdog");
         System.out.println(this.common);
         System.out.println(super.common);

    }

    Dog() {
        System.out.println("dog constructor");
    }

    //重写父类
    void speak() {
        System.out.println("dog");
    }

    //子类独有方法
    void dogname() {
        System.out.println("dogname");
    }
}
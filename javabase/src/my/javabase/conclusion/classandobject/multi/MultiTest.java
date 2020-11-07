package my.javabase.conclusion.classandobject.multi;

/**
 * 多态形式的体现：
 * 1 继承
 * 2 父类引用指向子类
 * 3 重写
 */
public class MultiTest {
    public static void main(String[] args) {

        //继承
        //父类引用指向子类
        Animal aDog = new Dog();
        Animal aCat = new Cat();
        //重写
        //多态，父类引用指向子类，调用的重写方法实际为子类方法
        aDog.eat();
        aCat.eat();

        aDog.animaltest();//向上转型为父类对象后可以直接调用父类方法
        ((Cat) aCat).cattest();//向下转型为子类对象调用子类方法
//        aDog.dogtest();//没有向下转型不能直接调用子类方法
    }
}

class Animal {
    void eat() {
        System.out.println("animal eat()");
    }

    void animaltest() {
        System.out.println("animaltest()");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("dog eat()");
    }

    void dogtest() {
        System.out.println("dogtest()");
    }
}

class Cat extends Animal {
    void eat() {
        System.out.println("cat eat()");
    }

    void cattest() {
        System.out.println("cattest()");
    }
}

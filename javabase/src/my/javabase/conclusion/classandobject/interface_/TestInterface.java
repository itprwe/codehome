package my.javabase.conclusion.classandobject.interface_;

/**
 * 接口内的变量都是 public static final
 * 接口内的方法都是 public abstract
 */
public class TestInterface {
    public static void main(String[] args) {

        Honest hAngel = new Angel();
        hAngel.helpOther();

        Volant vAngel = new Angel();
        vAngel.fly();

        Angel angel = new Angel();
        angel.fly();
        angel.helpOther();
    }
}

interface Volant {
    int FLY_HIGHT = 111;//总是public static final类型，不写也是

    void fly();//总是public abstract void fly();不写也是
}

interface Honest {
    void helpOther();
}

class Angel implements Volant, Honest {
    @Override
    public void fly() {
        System.out.println("i can fly");
    }

    @Override
    public void helpOther() {
        System.out.println("i can help");
    }
}
package my.prwe.oo;

//12
public class TestInterface {
    public static void main(String[] args) {
        Volant v = new Angle();
        v.fly();
//         v.helpOther();//编译器不知道
        Honest h = new GoodMan();
        h.helpOther();
    }
}

interface Volant{
    int FLY_HEIGHT = 1111;
    void fly();
}

interface Honest{
    void helpOther();
}

class Angle implements Volant,Honest{

    @Override
    public void fly() {
        System.out.println("Volant.fly()");
    }

    @Override
    public void helpOther() {
        System.out.println("Anlgle.helpOther()");
    }
}

class GoodMan implements Honest{

    @Override
    public void helpOther() {
        System.out.println("Honest.helpOther()");
    }
}

class BirdMan implements Volant{

    @Override
    public void fly() {
        System.out.println("Volant.fly()");
    }
}
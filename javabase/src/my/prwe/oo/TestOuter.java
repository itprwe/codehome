package my.prwe.oo;

public class TestOuter {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.show();

        Outer.Inner i = new Outer().new Inner();
        i.showa();

    }

}

class Outer{
    private int age = 10;
    public void show(){
        System.out.println(age);
    }

    class Inner{
        private int age = 20;
        public void showa(){
            System.out.println(age);
        }
    }
}
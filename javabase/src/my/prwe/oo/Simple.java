package my.prwe.oo;

class Base {
    public void methodB(){
        System.out.print ("Base method");
    }
}
class Child extends Base{
    public void methodB(){
        System.out.print ("Child methodB");
    }
}
class Sample {
    public static void main(String[] args) {
        Base base= new Child();
//        base.method();//编译错误，编译器只认识父类中的方法，虽然说是子类对象
    }
}

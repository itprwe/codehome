package my.javabase.conclusion.classandobject;

/**
 * new 对象，首先加载初始化静态属性
 * 再初始化构造器中的内容
 *
 * 有父类则先执行父类中的静态，再执行子类中的静态；构造方法顺序同
 *
 * 构造方法用于初始化对象，静态块用于类的初始化操作。
 *
 */
public class StaticTest {
    public static void main(String[] args) {
        //调用普通方法
        User2 u = new User2(11, "fafa");
        u.login();

        //调用静态方法
        User2.printCompany();
        User2.company = "pppprrrr";
        User2.printCompany();
    }

}

class User2 {
    int id;
    String name;
    String pwd;

    //静态属性
    static String company ;

    //静态块
    static {
        System.out.println("执行类的初始化工作");
        company = "iiiittttt";
        printCompany();
    }

    //初始化属性值
    public User2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void login() {
        System.out.println("nomal method " + company);
        System.out.println("登录：" + name);
    }

    public static void printCompany() {
        //调用非静态方法编译报错
//        login();
        //调用非静态属性编译报错
//        System.out.println("static field"+name);
        System.out.println("static metohd" + company);
    }
}

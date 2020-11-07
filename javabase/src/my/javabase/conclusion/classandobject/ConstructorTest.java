package my.javabase.conclusion.classandobject;

public class ConstructorTest {
    public static void main(String[] args) {
        //初始化三个对象，无参和有参
        User user1 = new User();
        User user2 = new User(11, "haha");
        User user3 = new User(22, "hehe", "faga");
    }
}

/**
 * 一个类中可以有多个class，但是只能有一个public类
 */
class User {
    int id;
    String name;
    String pwd;

    //Alt+Inset 快捷插入get set constructor方法

    //无参构造函数
    User() {

    }

    //有参构造
    User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //有参构造
    User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }
}

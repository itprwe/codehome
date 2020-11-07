package my.javabase.conclusion.classandobject;

/**
 * 对象创建过程
 * 分配对象空间，并将对象成员变量初始化
 * 执行属性的显示初始化
 * 执行构造方法
 * 返回对象的值给相关变量
 * <p>
 * this只能在构造方法中使用
 * this不能用于static方法中
 * <p>
 * this的本质就是创建好的对象的地址
 * 由于在构造方法调用前，对象已经创建好了，所以在构造方法中可以用this代表 当前对象
 */
public class ThisTest {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player(22);
        Player player3 = new Player(33, "prwe");
        Player player4 = new Player(22, "jack", "runner");
    }
}

class Player {
    int age;
    String name;
    String sport;

    public Player() {
    }

    public Player(int age) {
        this.age = age;
    }

    public Player(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Player(int age, String name, String sport) {
        this.age = age;
        this.name = name;
        this.sport = sport;
    }
}
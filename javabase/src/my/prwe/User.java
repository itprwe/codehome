package my.prwe;

//5
public class User {
    int id;
    String name;
    String pwd;

    public User(int id, String name) {
        this.id = id;//id是局部变量id，this是创建好的对象，this.id是成员变量
        this.name = name;
    }

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public User() {
    }

    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User(100,"prwe");
        User u3 = new User(100,"prwe","123456");
    }
}

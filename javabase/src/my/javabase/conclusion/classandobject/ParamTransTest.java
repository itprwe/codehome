package my.javabase.conclusion.classandobject;

public class ParamTransTest {
    public static void main(String[] args) {

        User3 user = new User3(22, "itprwe");

        user.testParamTrans1(user);
        System.out.println(user.name);

        user.testParamTrans2(user);
        System.out.println(user.name);
    }
}

class User3 {
    int id;        //id
    String name;   //账户名
    String pwd;   //密码

    public User3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void testParamTrans1(User3 user3) {
        user3.name = "user3 name";
    }

    public void testParamTrans2(User3 user3) {
        user3 = new User3(222, "hahaha");
    }
}
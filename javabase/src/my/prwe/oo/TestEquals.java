package my.prwe.oo;

//10
public class TestEquals {
    public static void main(String[] args) {
        User u1 = new User(111,"prwe","123456");
        User u2 = new User(111,"prwe","123456");

        System.out.println(u1==u2);
        System.out.println(u1.equals(u2));
    }
}

class User{
    int id;
    String name;
    String pwd;

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if(obj==null)
            return  false;
        if(getClass()!=obj.getClass())
            return false;
        User other = (User)obj;
        if(id!=other.id)
            return false;
        return true;
    }
}
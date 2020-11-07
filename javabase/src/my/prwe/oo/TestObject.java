package my.prwe.oo;

//9 Object toString()
public class TestObject {
    public static void main(String[] args) {
//        Object obj ;
        TestObject test = new TestObject();
        System.out.println(test);//System.out.println(test.toString());

        Person3 p = new Person3("prwe",11);
        System.out.println(p.toString());//System.out.println(p);
    }

    public String toString(){
        return "重写toString()";
    }
}

class Person3{
    String name;
    int age;

    public String toString(){
        return name +",年龄,"+ age;
    }

    public Person3(String name,int age){
        this.name = name;
        this.age = age;
    }
}


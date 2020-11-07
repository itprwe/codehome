package my.javabase.conclusion.classandobject.encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {

        People people = new People();
        people.setName("gagaga");
        people.setAge(55);
        System.out.println(people.getName());
        System.out.println(people);
    }
}

class People {
    // 属性一般使用private修饰
    private String name;
    private int age;
    private String address;
    private String school;
    private boolean old;

    // 为属性提供public修饰的set/get方法
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 120 || age < 0) {
            this.age = 18;
        } else {
            this.age = age;
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setOld(boolean old) {
        this.old = old;
    }

    //get
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getSchool() {
        return school;
    }

    public boolean isOld() {
        return old;
    }

    @Override
    public String toString() {
        return "person [name = " + name + ",age = " + age + "]";
    }
}


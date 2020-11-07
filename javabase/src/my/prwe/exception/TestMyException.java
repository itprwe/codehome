package my.prwe.exception;

//自定义异常
public class TestMyException {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(-8);
    }

}

class Person{
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            throw new IllegalAgeException("年龄不能为负数");
        }
        this.age = age;
    }
}

class IllegalAgeException extends RuntimeException{
    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }
}
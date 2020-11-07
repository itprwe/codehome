package my.prwe.array;

public class TestArray1 {
    public static void main(String[] args) {
        //声明数组，指定长度
        int[] arr01 = new int[10];
        String[] arr02 = new String[3];

        //
//        arr01[0] = 11;
        for (int i = 0; i <10 ; i++) {
            arr01[i]=11+i;
        }
        for (int i = 0; i <arr01.length ; i++) {
            System.out.println(arr01[i]);
        }

        User[] arr03 = new User[3];
        arr03[0] = new User(123,"prwe");
        arr03[1] = new User(111,"itprwe");
        arr03[2] = new User(222,"hahaprwe");

        for( User u : arr03){
            System.out.println(u.getName());
        }


    }
}

class User{
    private int age;
    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

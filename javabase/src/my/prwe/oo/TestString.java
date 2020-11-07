package my.prwe.oo;

public class TestString {
    public static void main(String[] args) {
        int age =10;
        String str = "age is " + age + 1;
        System.out.println(str);


        String str1= "abc";
        String str2 = new String("def");
        String str3 = "abc" + "prwe";
        String str4 = "18"+19;
        System.out.println(str4);

        System.out.println("===============|");
        String str5 = "qwer";
        String str6 = "qwer";
        String str7 = new String("qwer");
        System.out.println(str5==str6);//true
        System.out.println(str7==str6);//false 不是同一个对象

        System.out.println("==================");
        String str8 = "it prwe";
        System.out.println(str8.charAt(4));

    }
}

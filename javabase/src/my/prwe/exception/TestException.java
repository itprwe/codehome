package my.prwe.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//exception try catch finally
public class TestException {
    public static void main(String[] args) {

//        Scanner s = new Scanner(System.in);
//        System.out.print("请输入除数：");
//        int b = s.nextInt();
//        System.out.print("请输入被除数：");
//        int i = s.nextInt();
//        if(b!=0){
//            System.out.println("结果是："+i/b);
//
//        }else{
//            System.out.println("除数输入不能为0！");
//        }

//        String str = null;
//        System.out.println(str.charAt(0));//NullPointerException

//        Animal a = new Dog();
//        Cat c = (Cat)a;//ClassCastException

//        int[] arr = new int[5];
//        System.out.println(arr[5]);//ArrayIndexOutOfBoundsException

//        String str = "123123def";
//        System.out.println(Integer.parseInt(str));//NumberFormatException
        FileReader reader = null;
        try {
            reader = new FileReader("d:/a.txt");
            char c1 = (char) reader.read();
            System.out.println(c1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();

        }finally {
            try {
                if (reader!=null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

class Animal{

}
class Dog extends Animal{

}
class Cat extends Animal{

}
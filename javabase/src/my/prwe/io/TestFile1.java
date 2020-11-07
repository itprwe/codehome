package my.prwe.io;

import java.io.File;

// File 构造器
public class TestFile1 {
    public static void main(String[] args) {
        String path = "D:/workspaces/javabase/desk.jpg";


        //构建File对象
        File src = new File(path);
        System.out.println(src.length());

        //构建File对象
        src = new File("D:/workspaces/javabase", "desk.jpg");
        src = new File("D:/workspaces","javabase/desk.jpg");
        System.out.println(src.length());

        //构建File对象
        src= new File(new File("D:/workspaces/javabase"), "desk.jpg");
        System.out.println(src.length());

    }
}

package my.prwe.io;

import java.io.File;

public class TestFile2 {
    /**
     * 构建File对象
     * 相对路径与绝对路径
     *
     * @param args
     */
    public static void main(String[] args) {
        String path = "D:/workspaces/javabase/desk.jpg";

        //绝对路径
        File src = new File(path);
        System.out.println(src.getAbsolutePath());
        //相对路径
        System.out.println(System.getProperty("user.dir"));
        src = new File("desk.jpg");
        System.out.println(src.getAbsolutePath());

        //构建一个不存在的文件，File对象可以构建一个不存的路径
        src = new File("aaa/desk.jpg");
        System.out.println(src.getAbsolutePath());

    }
}

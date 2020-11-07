package my.prwe.io;

import java.io.File;

//  \ /名称分隔符 separator
public class TestPath {
    public static void main(String[] args) {
        String path = "D:\\workspaces\\javabase\\desk.jpg";
        System.out.println(File.separatorChar);
        System.out.println(path);
        //分隔符建议使用
        //1. /
        path = "D:/workspaces/javabase/desk.jpg";
        System.out.println(path);
        //2. 常量拼接
        path = "D:" + File.separator +"workspaces" + File.separator +"javabase" + File.separator + "desk.jpg";

        System.out.println(path);
    }
}

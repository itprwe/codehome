package my.prwe.io;

import java.io.File;
import java.io.IOException;

/**
 * 文件长度
 * createNewFile 不存在则创建，存在则返回false 只能创建文件
 * con com3 shi,,,操作系统的设备名，不能正确创建
 * delete 删除已经存在的文件
 */
public class TestFile5 {
    public static void main(String[] args) throws IOException {
        String path = "D:/workspaces/javabase/desk.jpg";
        File src = new File(path);
        System.out.println(src.length());

        src = new File("D:/workspaces/javabase");
        System.out.println(src.length());

        src = new File("D:/workspaces/javabase/aaa.txt");
        boolean newFile = src.createNewFile();
        System.out.println(newFile);

        boolean delete = src.delete();
        System.out.println(delete);
    }
}

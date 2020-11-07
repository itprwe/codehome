package my.prwe.commonclass;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) throws IOException {
        File f = new File("d:/a.txt");//读取文件
        System.out.println(f);
        f.renameTo(new File("d:/b.txt"));

        System.out.println(System.getProperty("user.dir"));
        File f2 = new File("c.txt");
//        f2.createNewFile();

        System.out.println(f2.exists()+"是否存在");
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println();

        File f3 = new File("d:/haha/哈哈");
//        boolean mkdir = f3.mkdir();//目录结构中有一个不存在则不会建立整个目录树
        boolean mkdirs = f3.mkdirs();//创建整个目录树结构
        System.out.println(mkdirs);

    }
}

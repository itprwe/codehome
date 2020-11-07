package my.prwe.io;

import java.io.File;

/**
 * 文件状态
 * 1，不存在 exists
 * 2，存在
 *      文件：isFile
 *      文件夹：isDirectory
 */
public class TestFile4 {
    public static void main(String[] args) {
        File src = new File("D:\\workspaces\\javabase\\desk.jpg");
        System.out.println(src.getAbsolutePath());
        System.out.println("是否存在："+src.exists());
        System.out.println("是否是文件："+src.isFile());
        System.out.println("是否是文件夹："+src.isDirectory());

        src = new File("desk.jpg");
        System.out.println("=========");
        System.out.println("是否存在："+src.exists());
        System.out.println("是否是文件："+src.isFile());
        System.out.println("是否是文件夹："+src.isDirectory());

        src = new File("D:\\workspaces\\javabase");
        System.out.println("=========");
        System.out.println("是否存在："+src.exists());
        System.out.println("是否是文件："+src.isFile());
        System.out.println("是否是文件夹："+src.isDirectory());

        src=new File("xxx");
        if(!src.exists()){
            System.out.println("文件不存在");
        }else {
            if(src.isFile()){
                System.out.println("是文件");
            }else {
                System.out.println("是文件夹");
            }
        }

    }
}

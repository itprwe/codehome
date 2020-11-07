package my.prwe.io;

import java.io.File;

/**
 * 统计文件夹的大小
 */
public class TestDir3 {

    public static void main(String[] args) {
        File src = new File("D:\\workspaces\\javabase");
        count(src);
        System.out.println(len);
    }

    public static long len = 0;

    public static void count(File src) {
        //获取大小
        if (null != src && src.exists()) {
            if (src.isFile()) {
                len += src.length();
            } else {//子孙级
                for (File s : src.listFiles()) {
                    count(s);
                }
            }
        }
    }

}

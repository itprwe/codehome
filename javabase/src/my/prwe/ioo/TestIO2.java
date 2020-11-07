package my.prwe.ioo;

import java.io.*;

/**
 * 文件字节输入流
 * 操作步骤:一个一个读取
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 */
public class TestIO2 {
    public static void main(String[] args) {
//        File src = new File("D:/workspaces/javabase/abc.txt");
//        boolean newFile = src.createNewFile();
        //1.创建源
        File src = new File("abc.txt");
        InputStream is = null;
        try {
            //2.选择流
            is = new FileInputStream(src);
            //3.操作(读取)
            int temp;
            while ((temp = is.read()) != -1) {
                System.out.println((char) temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.释放资源
            try {
                if (null != is) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}

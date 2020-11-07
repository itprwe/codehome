package my.prwe.ioo;

import java.io.*;

/**
 * 文件字节输入流
 * 操作步骤
 * 创建源
 * 选择流
 * 操作
 * 释放资源
 */
public class TestIO1 {
    public static void main(String[] args){
//        File src = new File("D:/workspaces/javabase/abc.txt");
//        boolean newFile = src.createNewFile();


        //创建源
        File src =  new File("abc.txt");
        try {
            //选择流
            InputStream is = new FileInputStream(src);
            //操作
            int data1 = is.read();
            int data2 = is.read();
            int data3 = is.read();
            int data4 = is.read();//文件的末尾没读到数据，返回-1
            System.out.println((char) data1);
            System.out.println((char)data2);
            System.out.println((char)data3);
            System.out.println(data4);
            //释放资源
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

package my.prwe.ioo;

import java.io.*;

/**
 * 文件字节输入流
 * 操作步骤：一段一段读取
 * 1.创建源
 * 2.选择流
 * 3.操作（读取）
 * 4.关闭
 */
public class TestIO3 {
    public static void main(String[] args) {
        //1、创建源
        File src = new File("abc.txt");
        //2、选择流
        InputStream is = null;
        try {
            is = new FileInputStream(src);
            //3、操作（读取）
            byte[] flush = new byte[1024];
            int len = -1;//接收长度
            while ((len = is.read(flush)) != -1) {
                //字节数组-->字符串（解码）
                String str = new String(flush, 0, len);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != is) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

package my.prwe.ioo;

import java.io.*;

/**
 * 文件字符输入流
 * 创建源
 * 选择流
 * 操作
 * 关闭
 */
public class TestIoReader {
    public static void main(String[] args) {
        //创建源
        File src = new File("abc.txt");
        //选择流
        Reader reader = null;
        try {
            reader = new FileReader(src);
            //操作
            char[] flush = new char[1024];
            int len = -1;
            while ((len = reader.read(flush)) != -1) {
                //字符数组--》字符串
                String str = new String(flush, 0, len);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != reader) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}

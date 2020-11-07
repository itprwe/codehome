package my.prwe.ioo;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * 字节数组输入流
 * 创建源(字节数组源)
 * 选择流
 * 操作
 * 无需关闭！
 */
public class TestIOByteArrayInput {
    public static void main(String[] args) {
        //创建字节数组源
        String msg = "got the clup going up,on aTuesday";
        String msg1 = "talk is cheap show me the code";
        byte[] bytes = msg1.getBytes();
        //选择流
        InputStream is =null;
        try {
            is = new ByteArrayInputStream(bytes);
            //操作
            byte[] datas = new byte[1024];
            int len = -1;
            while ((len = is.read(datas)) != -1) {
                String s = new String(datas, 0, len);
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

package my.prwe.io;

import java.io.UnsupportedEncodingException;

/**
 * 编码：字符串到字节
 * 解码：字节到字符串
 */
public class TestCode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg = "哈哈呵呵嘎嘎a";
        //编码：字节数组
        byte[] bytes = msg.getBytes();//默认使用工程字符集
        System.out.println(bytes.length);

        //编码：其他字符集
        byte[] bytes1 = msg.getBytes("UTF-16LE");
        System.out.println(bytes1.length);

        byte[] bytes2 = msg.getBytes("GBK");
        System.out.println(bytes2.length);

        //解码
        msg = new String(bytes,0,bytes.length,"utf-8");
        System.out.println(msg);

        //乱码原因
        //字节数不够
        msg = new String(bytes,0,bytes.length-2,"utf-8");
        System.out.println(msg);
        msg = new String(bytes,0,bytes.length-1,"utf-8");
        System.out.println(msg);

        //字符集不统一
        msg = new String(bytes,0,bytes.length-1,"gbk");
        System.out.println(msg);

    }
}

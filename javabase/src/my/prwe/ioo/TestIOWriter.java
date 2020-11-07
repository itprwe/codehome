package my.prwe.ioo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 文件字符输出流
 * 创建源
 * 选择流
 * 操作
 * 关闭
 */
public class TestIOWriter {
    public static void main(String[] args) {
        //创建源
        File dest = new File("write.txt");
        //选择流
        Writer writer =null;
        try {
            writer = new FileWriter(dest);
            //操作
            String msg = "write some prwe,哈哈哈哈哈呢";
//            msg.getBytes();//
            //写法一
//            char[] chars = msg.toCharArray();//字符创--》字符数组
//            writer.write(chars,0,chars.length);
            //写法二
//            writer.write(msg);//字符直接写出，不需要转为字节
            //写法三
            writer.append("write some prwe").append("哈哈哈哈哈呢");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null!=writer){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

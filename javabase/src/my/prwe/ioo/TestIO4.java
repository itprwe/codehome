package my.prwe.ioo;

import java.io.*;

/**
 * 文件字节输出流
 * 1.创建源
 * 2.选择流
 * 3.操作（写出内容）
 * 4.释放资源
 */
public class TestIO4 {
    public static void main(String[] args) {
        //1.创建源
        File dest =new File("prwe.txt");//不存在自动创建
        //2.选择流
        OutputStream os =null;
        try {
            os =new FileOutputStream(dest,false);
            //3.操作（写出）
            String msg="it is my prwe\r\n";
            byte[] datas = msg.getBytes();//字符串==》字节（编码）
            os.write(datas,0,datas.length);
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null!=os){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

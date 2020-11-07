package my.prwe.ioo;

import java.io.*;

/**
 * 使用文件输入输出流实现文件拷贝
 *
 */
public class TestIO5 {
    public static void main(String[] args) {
        //1.创建源
        File src = new File("abc.txt");//输入源，被拷贝文件
        File dest = new File("prwe.txt");//输出源，拷贝至这个文件
        //2.选择流
        InputStream is = null;
        OutputStream os =null;
        try {
            is = new FileInputStream(src);
            os=new FileOutputStream(dest,true);
            //操作，先读入，再写出
            byte[] datas =  new byte[1024];
            int len = -1;
            while ((len=is.read(datas))!=-1){
                os.write(datas,0,len);
            }
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源，先打开的后关闭
            if (null!=os){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (null!=is){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }
}

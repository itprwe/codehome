package my.prwe.ioo;

import java.io.*;

/**
 * 封装拷贝方法
 */
public class TestIO6 {
    public static void main(String[] args) {
        copy("abc.txt","prwe.txt");
    }

    /**
     * 文件的拷贝
     * 思考：利用递归做文件夹的拷贝
     * @param srcPath
     * @param desstPath
     */
    public static void copy(String srcPath, String desstPath) {
        //创建源
        File src = new File(srcPath);
        File dest = new File(desstPath);

        //选择流
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);
            //操作 先读入，再写出
            byte[] datas = new byte[1024];
            int len = -1;
            while ((len = is.read(datas)) != -1) {
                os.write(datas, 0, len);//将读入的字节直接写出
            }
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != os) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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

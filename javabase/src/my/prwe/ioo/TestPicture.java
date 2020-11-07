package my.prwe.ioo;

import java.io.*;

/**
 * 1.图片读取到字节数组中(图片转为字节数组)
 * 2.字节数组写出到文件（字节还原为文件）
 */
public class TestPicture {
    public static void main(String[] args) {
        //图片转为字节数组
        byte[] bytes = fileToByteArray("desk.jpg");
        System.out.println(bytes.length);
        //字节转为文件
        byteArrayToFile(bytes,"desk-p.jpg");
    }

    /**
     * 图片到字节数组中
     * 1.图片到程序FileInputStream
     * 2.程序到字节数组 ByteArrayOutputStream
     */
    public static byte[] fileToByteArray(String filePath) {
        //创建源
        File src = new File(filePath);
        //选择流
        InputStream is = null;
        ByteArrayOutputStream os = null;
        try {
            is = new FileInputStream(src);
            os = new ByteArrayOutputStream();
            //操作（分段读入）
            byte[] datas = new byte[1024];
            int len = -1;
            while ((len = is.read(datas)) != -1) {
                //datas作为要输出的内容？
                os.write(datas, 0, len);//写出到字节数组中
            }
            os.flush();
            return os.toByteArray();
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
        return null;
    }

    /**
     * 字节数组写出到文件
     * 1.字节数组读取到程序中 ByteArrayInputStream
     * 2.程序写出到文件 OutputStream
     */
    public static void byteArrayToFile(byte[] src, String filePath) {

        //创建源src
        File dest = new File(filePath);
        //选择流
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new ByteArrayInputStream(src);
            os = new FileOutputStream(dest);
            //操作（读入）
            byte[] datas = new byte[1024];
            int len = -1;
            while ((len = is.read(datas)) != -1) {
                //将读入内容写出到文件
                os.write(datas, 0, len);//字节数组写出到文件
            }
            os.flush();
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
        }

    }
}

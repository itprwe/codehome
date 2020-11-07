package my.prwe.ioo;

import java.io.*;

/**
 * 封装拷贝
 * try...with...resource
 * 封装释放资源
 */
public class FileUtils2 {
    public static void main(String[] args) {
        //文件到文件
        try {
            InputStream is = new FileInputStream("abc.txt");
            OutputStream os = new FileOutputStream("abc-file-copy.txt");
            copy(is, os);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        byte[] bytes = null;
        //文件到字节数组
        try {
            InputStream is = new FileInputStream("desk.jpg");
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            copy(is, os);
            bytes = os.toByteArray();
            System.out.println(bytes.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //字节数组到文件
        try {
            InputStream is = new ByteArrayInputStream(bytes);
            OutputStream os = new FileOutputStream("desk-copy1.jpg");
            copy(is, os);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 对接输入输出流
     *
     * @param is
     * @param os
     */
    public static void copy(InputStream is, OutputStream os) {
        try (InputStream is1 = is; OutputStream os1 = os) {
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
        }

    }

//    public static void close(InputStream is, OutputStream os) {
//        if (null!=os){
//            try {
//                os.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        if (null!=is){
//            try {
//                is.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }

    public static void close(Closeable... ios) {
        for (Closeable io : ios) {
            try {
                if (null != io) {
                    io.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

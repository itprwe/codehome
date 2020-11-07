package my.prwe.ioo;

import java.io.*;

/**
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放
 */
public class TestIO3My {
    // 10
    public static void main(String[] args) {
        File src = new File("abc.txt");
        InputStream is = null;
        try {
            is = new FileInputStream(src);
            int temp;
            while ((temp = is.read()) != -1) {
                System.out.println((char) temp);
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

        testIO();
        testInput();
    }

    public static void testIO() {
        //5
        //创建源
        File dest = new File("itprwe.txt");//文件不存在则创建
        //选择流
        OutputStream os = null;
        try {
            os = new FileOutputStream(dest, false);//是否覆盖内容
            //操作（写出）
            String msg = "the last times if you are not skillfully,write it ten times or five times";
            byte[] bytes = msg.getBytes();//字节转字符输出
            os.write(bytes, 0, bytes.length);//写出
            os.flush();//刷新
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if (null != os) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    //整段读取
    public static void testInput() {
        //创建源
        File src = new File("abc.txt");
        //选择流
        InputStream is = null;
        try {
            is = new FileInputStream(src);
            //操作（分段读取|）
            byte[] datas = new byte[1024];//分段读取一次性读取数量
            int len = -1;
            while ((len = is.read(datas)) != -1) {
                String msg = new String(datas, 0, len);//字节转字符串
                System.out.println("=======");
                System.out.println(msg);
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

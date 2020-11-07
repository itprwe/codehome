package my.prwe.io2;

import java.io.*;

/**
 * 转换流：InputStreamReader OutputStreamWriter
 * 1.以字符流的形式操作字节流（纯文本）
 * 2.指定字符集
 */
public class TestConvert {
    public static void main(String[] args) {
        try(BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));        ){

            //循环获取键盘的输入（exit退出），输出此内容
            String msg ="";
            while (!msg.equals("exit")){
                msg = reader.readLine();
                writer.write(msg);
                writer.newLine();
                writer.flush();
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

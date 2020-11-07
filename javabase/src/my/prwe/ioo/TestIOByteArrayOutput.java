package my.prwe.ioo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * 字节数组输出流ByteArrayOutputSteream
 * 无需创建源:内部维护
 * 选择流：不关联源
 * 操作
 * 无需关闭！
 * <p>
 * 获取数据，toByteArrsy()
 */
public class TestIOByteArrayOutput {
    public static void main(String[] args) {
        //无需创建源
        byte[] dest = null;
        //选择流（使用新增方法）因为要使用子类新增的toByteArray，所以不用多态，不适用父类创建，
        // 否则无法调用子类方法，编译器不认得
        ByteArrayOutputStream os = null;
        try {
            os = new ByteArrayOutputStream();
            //操作写出
            String msg = "talk is cheap show me the code";
            byte[] bytes = msg.getBytes();
            os.write(bytes, 0, bytes.length);
            os.flush();

            //获取数据
            dest = os.toByteArray();
            String s = new String(dest, 0, dest.length);
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

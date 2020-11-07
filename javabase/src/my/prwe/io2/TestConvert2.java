package my.prwe.io2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class TestConvert2 {
    public static void main(String[] args) {
        try(BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(
                                    new URL("http://www.baidu.com").openStream(),"UTF-8"));){
            String temp;
            while ((temp=reader.readLine())!=null){
                System.out.print(temp);
            }
        }catch (IOException e){
            System.out.println("操作异常");
        }
    }
}

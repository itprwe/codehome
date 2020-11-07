package my.prwe.exception;

import java.io.FileReader;
import java.io.IOException;

public class TestThrows {
    public static void main(String[] args) throws IOException {
        readMyFile();
    }

    public static void readMyFile() throws IOException {
        FileReader reader = null;
        reader = new FileReader("d:/a.txt");
        char c = (char)reader.read();
        System.out.println(c);
        if(reader!=null){
            reader.close();
        }
    }
}



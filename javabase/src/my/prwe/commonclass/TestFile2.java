package my.prwe.commonclass;

import java.io.File;

public class TestFile2 {
    public static void main(String[] args) {
        File ff = new File("D:\\itprwe");
        printFile(ff,0);
    }

    static void printFile(File file,int level){
        //层数
        for (int i = 0; i <level ; i++) {
            System.out.print("-");
        }
        System.out.println(file.getName());
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for(File f:files){
                printFile(f,level+1);
            }
        }

    }
}

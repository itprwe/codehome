package my.prwe.io;

import java.io.File;

/**
 *递归 方法自己调用自己
 * 递归头 何时结束递归
 * 递归体 重复调用
 * 占用内存 能用循环则用循环
 */
public class TestDir2 {
    public static void main(String[] args) {
//        method(1);

        File src = new File("D:\\workspaces\\javabase");
        printName(src,0);

    }

    public static void printName(File src,int deep){
        for (int i = 0; i <deep ; i++) {//层级
            System.out.print("-");
        }
        System.out.println(src.getName());
        if(null==src||!src.exists()){//递归头
            return;

        }else if (src.isDirectory()){
            for (File f:src.listFiles()){//递归体
                printName(f,deep+1);
            }
        }
    }

    public static void method(int n){
        if (n>10){//递归头
            return;
        }
        System.out.println(n);
        method(n+1);//递归体

    }
}

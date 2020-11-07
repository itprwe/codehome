package my.prwe.io;

import java.io.File;

/**
 * 使用面向对象，统计文件夹的大小
 */
public class TestDir4 {
    //大小
    private long len;
    //文件夹路径
    private String path;
    //源
    private File src;

    //文件个数
    private int fileCount;
     //文件夹个数
    private int dirCount;

    public TestDir4(String path) {
        this.path = path;
        this.src = new File(path);
        count(this.src);
    }
    private void count(File src){
        if (null!=src&&src.exists()){
            if (src.isFile()){
                len +=src.length();
                this.fileCount++;
            }else {
                this.dirCount++;
                for (File s:src.listFiles()){
                    count(s);
                }
            }

        }
    }

    public long getLen() {
        return len;
    }

    public int getFileCount() {
        return fileCount;
    }

    public int getDirCount() {
        return dirCount;
    }

    public static void main(String[] args) {
        //初始换就调用了方法计算
        TestDir4 dir = new TestDir4("D:\\workspaces\\javabase");
        System.out.println(dir.getLen());
        System.out.println(dir.getFileCount());
        System.out.println(dir.getDirCount());

        TestDir4 dir2 = new TestDir4("D:\\workspaces\\javabase\\src");
        System.out.println(dir2.getLen());
        System.out.println(dir2.getFileCount());
        System.out.println(dir2.getDirCount());
    }
}

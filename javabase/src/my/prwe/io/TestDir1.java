package my.prwe.io;

import java.io.File;

/**
 * mkdir() 确保上级目录存在，不存在创建失败
 * mkdirs() 上级目录可以不存在，不存在的话一同创建
 *
 * list() 列出下级名称 只返回一层
 * listFiles() 列出下级File对象
 *
 * 列出所有盘符 listRoots()
 */
public class TestDir1 {
    public static void main(String[] args) {
        File dir = new File("D:/workspaces/javabase/dir/test");
        boolean mkdir = dir.mkdir();
        System.out.println(mkdir);
        boolean mkdirs = dir.mkdirs();
        System.out.println(mkdirs);

        dir = new File("D:/workspaces/javabase");
        //下级名称
        String[] lists = dir.list();
        for (String list :lists){
            System.out.println(list);
        }
        //下级对象
        File[] files = dir.listFiles();
        for (File file :files){
            System.out.println(file.getAbsolutePath());
        }

        //列出所有根目录
        File[] files1 = dir.listRoots();
        for (File f :files1){
            System.out.println(f.getAbsolutePath());
        }


    }
}

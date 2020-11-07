package my.prwe.io;

import java.io.File;

/**
 *  File方法
 *  getName() 名称
 *  getPath() 构建时候是相对路径则返回相对路径，构建时候是绝对路径则返回绝对路径
 *  getAbsolutePath() 返回绝对路径
 *  getParent() 上个路径，如果不存在则返回空
 */
public class TestFile3 {
    public static void main(String[] args) {
        File src = new File("D:\\workspaces\\javabase\\desk.jpg");

        System.out.println("名称："+src.getName());
        System.out.println("路径："+src.getPath());
        System.out.println("绝对路径："+src.getAbsolutePath());
        System.out.println("父路径："+src.getParent());
        System.out.println("父对象："+src.getParentFile().getName());
    }
}

package test4;

//File的使用
//常用的方法
//文件状态的判断
//创建新文件，删除文件

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FilePath {
    public static void main(String[] args) throws IOException {
        File picpath = new File("pic/1.jpg");
        System.out.println(picpath.getAbsolutePath());
        System.out.println("名称 = " + picpath.getName());
        System.out.println("路径 = " + picpath.getPath());
        System.out.println("绝对路径 = " + picpath.getAbsolutePath());
        System.out.println("父路径 = " + picpath.getParent());
        System.out.println("父对象 = " + picpath.getParentFile());
        System.out.println("########################");

        System.out.println("是否存在 = " + picpath.exists());
        System.out.println("是否是文件 = " + picpath.isFile());
        System.out.println("是否是文件夹 = " + picpath.isDirectory());
        System.out.println("########################");

        picpath = new File("1.jpg");
        System.out.println("是否存在 = " + picpath.exists());
        System.out.println("是否是文件 = " + picpath.isFile());
        System.out.println("是否是文件夹 = " + picpath.isDirectory());

        //文件状态
        File src = new File("xxx");
        if (null == src || !src.exists()){
            System.out.println("文件不存在 " );
        }else {
            if (src.isFile()){
                System.out.println("进行文件操作 " );
            }else {
                System.out.println("进行文件夹操作 " );
            }
        }


        //创建新文件
        File file = new File("xxx");
        boolean flag = file.createNewFile();
        System.out.println(flag );

        //删除文件
        boolean flag1 = file.delete();
        System.out.println(flag1 );

    }
}

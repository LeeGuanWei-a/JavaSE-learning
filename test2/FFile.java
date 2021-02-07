package test2;//File类的使用


import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class FFile {
    public static void main(String[] args) throws IOException {
        //创建File对象的写法
        //File f = new File("d:/a.txt");
        File file = new File("D:\\a.txt");
        file.createNewFile();
        //文件重命名
        file.renameTo(new File("D:\\b.txt"));
        //获得项目所在的目录
        System.out.println("目录 = " + System.getProperty("user.dir"));

        File file1 = new File("./test2/cc.txt");
        file1.createNewFile();

        //File类常用方法
        System.out.println("File是否存在 = " + file1.exists());
        System.out.println("File是否是目录 = " + file1.isDirectory());
        System.out.println("File是否是文件 = " + file1.isFile());
        System.out.println("File最后修改时间 = " + new Date(file1.lastModified()));
        System.out.println("File的大小 = " + file1.length());
        System.out.println("File的文件名 = " + file1.getName());
        System.out.println("File的目录相对路径 = " + file1.getPath());
        System.out.println("File的目录绝对路径 = " + file1.getAbsolutePath());

        //创建目录
        File file2 = new File("d:/aa/bb/cc");
        boolean flag = file2.mkdir();       //目录结构中有一个不存在，则不会创建整个目录树
        System.out.println("flag = " + flag);
        boolean flag1 = file2.mkdirs();     //目录结构中有不存在的目录也没有影响，创建整个目录树
        System.out.println("flag1 = " + flag1);


    }
}

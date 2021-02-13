package test4;

//文件目录的操作
//mkdir()，确保上级目录存在，不存在则创建失败
//mkdirs()，上级目录可以不存在，可以一同创建
//list(),列出下级目录名称
//listFiles()，列出下级File对象
//列出所有盘符


import java.io.File;
import java.util.Arrays;

public class FileDir {
    public static void main(String[] args) {
        File dir = new File("D:/ideawork/Work01/src/dir/test");

        //创建目录,方法一
        boolean flag = dir.mkdir();
        System.out.println(flag);

        //方法二
        boolean flag1 = dir.mkdirs();
        System.out.println(flag1);

        System.out.println("#################");

        //列出下级目录名称
        File dir1 = new File("D:/");
        String[] name = dir1.list();
        for (String string : name){
            System.out.println(string);
        }

        System.out.println("#################");

        //列出下级File对象
        File[] files = dir1.listFiles();
        for (File file : files){
            System.out.println(file);
        }

        System.out.println("#################");

        //列出所有盘符
        File[] roots = dir.listRoots();
        for (File root : roots){
            System.out.println(root.getAbsolutePath());
        }


    }
}

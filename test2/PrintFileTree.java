package test2;//使用递归算法打印目录树


import java.io.File;
import java.util.Dictionary;

public class PrintFileTree {
    public static void main(String[] args) {
        //定义一个目录
        File file = new File("D:\\Work");
        printFile(file,0);
    }

    public static void printFile(File file,int level){
        //输出目录层次结构
        for (int i = 0;i < level;i++){
            System.out.print("-");
        }

        System.out.println(file.getName());
        if (file.isDirectory()){
            File[] files =file.listFiles();     //获取目录名,储存到数组中

            for (File temp:files){              //遍历
                printFile(temp,level+1);
            }
        }
    }
}

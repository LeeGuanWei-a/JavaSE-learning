package test4;

//构建File对象

import java.io.File;
import java.util.Arrays;

public class IoFile {
    public static void main(String[] args) {
        String picpath = "D:/ideawork/Work01/src/pic/1.jpg";
        //方法一
        File src = new File(picpath);
        System.out.println("File大小 = " + src.length());

        //方法二
        src = new File("D:/ideawork/Work01/src/pic","1.jpg");
        System.out.println("File大小 = " + src.length());

        //方法三
        src = new File("D:/ideawork/Work01/src","pic/1.jpg");
        System.out.println("File大小 = " + src.length());

        //方法四
        src = new File(new File("D:/ideawork/Work01/src"),"pic/1.jpg");
        System.out.println("File大小 = " + src.length());

    }
}

package test4;


//IO,分隔符的使用
//名称分割符：/


import java.io.File;

public class IoPath {
    public static void main(String[] args) {

        //路径分割符写法一：/
        String picpath = "pic/1.jpg";
        System.out.println(picpath);

        //写法二：常量拼接
        String picpath1 = "pic" + File.separator + "1.jpg";
        System.out.println(picpath1);

    }
}

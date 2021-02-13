package test4;


//PrintStream的应用

import java.io.PrintStream;


public class PPrintStream {
    public static void main(String[] args) {
        try {
            PrintStream ps = new PrintStream("src/dir/记事本.txt");
            ps.println(123);//输出整数
            ps.println(3.1415926);//输出double型数据
            ps.println("123" + 456);//输出字符串
            ps.println(123 == 123.0);//输出boolean型数据
            ps.close();
            System.out.println("数据写入完毕!");
        } catch (Exception e) {
        }

    }
}

package test4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws FileNotFoundException {
        // 利用文件输出流创建PrintWriter对象
        PrintWriter pw = new PrintWriter("output.txt");
        // 写入几个数据
        pw.println("hello");
        pw.println(18.97);
        pw.println(true);
        // 格式化输出数据
        pw.format("PI的近似值为%1$10.6f", Math.PI);
        pw.println();
        pw.format("e 的近似值为%1$10.6f", Math.E);
        pw.println();
        int a = 5, b = 10;
        pw.format("%1$d+%2$d=%3$d", a, b, a + b);
        pw.close();
        System.out.println("数据写入完毕!");
    }

}


package test4;

//FileInputStream读取内容

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileInputStream infile = new FileInputStream("src/dir/记事本.txt");
        try {
            int i = infile.read();                          // 先读取一个字节
            while (i != -1) {                               // 读指针到达输出流尾部时结束
                System.out.print((char) i);                 // 将一个字节强制转换为一个字符,并输出
                i = infile.read();                          // 读取下一个字节
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            infile.close();                                 // 关闭输入流
        }
    }


}


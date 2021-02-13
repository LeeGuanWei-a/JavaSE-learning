package test4;

//利用FileInputStream、FileOutputStream复制文件
//用字节数组复制，效率更高


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile2 {
    public static void main(String[] args) throws IOException {

        byte[] b = new byte[1024];                                          // 定义字节数组
        FileInputStream fin = new FileInputStream("src/dir/记事本.txt");                 // 创建输入流
        FileOutputStream fout = new FileOutputStream("src/dir/记事本2.txt");              // 创建输出流

        long len = 0L;                                                      //复制文件的长度
        long start=System.currentTimeMillis();

        try {
            int i = fin.read(b);                                            // 读取字节到数组b
            while (i != -1) {
                fout.write(b, 0, i);                                    // 写入实际读取的字节数
                len += i;                                                   // 累加复制字节数
                i = fin.read(b);                                            // 读取后续字节到数组b
            }

            System.out.println("从源文件复制了" + len + "字节到目标文件!");
            long total=System.currentTimeMillis()-start;
            System.out.println("文件复制用时"+total+"毫秒。");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            fin.close();                                                        // 关闭输入流
            fout.close();                                                       // 关闭输出流
        }

    }
}


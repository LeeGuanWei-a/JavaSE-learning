package test4;


//使用缓冲字节流提高数据读写效率

import java.io.*;

public class BufferedStream {
    public static void main(String[] args) throws IOException {

        long time1 = 0L;                                    // 开始时间
        long time2 = 0L;                                    // 结束时间
        System.out.println("向数据文件写入1000000个整数:");

        // 不使用字节缓冲流
        time1 = System.currentTimeMillis();

        FileOutputStream f1 = new FileOutputStream("src/dir/记事本.txt");
        DataOutputStream out1 = new DataOutputStream(f1);

        for (int i = 1; i <= 1000000; i++)
            out1.writeInt(i);
        out1.close();
        time2 = System.currentTimeMillis();
        System.out.println("未使用字节缓冲流，所用时间: " + (time2 - time1) + "毫秒");

        // 使用字节缓冲流
        time1 = System.currentTimeMillis();
        FileOutputStream f2 = new FileOutputStream("src/dir/记事本2.txt");
        BufferedOutputStream buf = new BufferedOutputStream(f2, 2048);
        DataOutputStream out2 = new DataOutputStream(buf);
        for (int i = 1; i <= 1000000; i++)
            out2.writeInt(i);
        out2.close();
        time2 = System.currentTimeMillis();
        System.out.println("使用字节缓冲流,所用时间: " + (time2 - time1) + "毫秒");

    }
}

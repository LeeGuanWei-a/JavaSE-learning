package test4;

//RandomAccessFile类的应用


import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String arg[]) {
        try {
            //根据指定的数据文件名创建具有"读写"功能的RandomAccessFile对象
            RandomAccessFile raf = new RandomAccessFile("numbers.dat", "rw");
            //将0,1,..,9的平方写入数据文件中
            for (int i = 0; i < 10; i++)
                raf.writeInt(i * i);

            // 读取数据文件中处于偶数位置的数据
            System.out.println("处于偶数位置的序列: ");
            long length = raf.length();// 得到文件的总字节数
            for (int i = 4; i < length; i += 2 * 4) {// 一个整数占4字节
                raf.seek(i);// 定位偶数位置数据的字节位置
                System.out.print(raf.readInt() + "  ");
            }
            raf.close();// 关闭文件
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

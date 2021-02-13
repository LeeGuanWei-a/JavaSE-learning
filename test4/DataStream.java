package test4;

//利用DataOutputStream、DataInputStream过滤流来封装文件字节流

import java.io.*;

public class DataStream {
    public static void main(String[] args) {

        // 数据存放文件
        File f = new File("src/dir/employee.txt");

        // 创建文件,添加内容,为字节输出流
        try {
            FileOutputStream out = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(out);

            dos.writeUTF("李观伟");
            dos.writeInt(22);
            dos.writeFloat(2345.67f);
            dos.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // 打开文件,显示内容,为字节输入流
        try {

            FileInputStream in = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(in);

            String name = dis.readUTF();
            int age = dis.readInt();
            float salary = dis.readFloat();
            dis.close();

            System.out.println("姓名：" + name);
            System.out.println("年龄：" + age);
            System.out.println("月薪：" + salary);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

package test4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InputStreamReader_OutputStreamWriter {
    public static void main(String[] args) throws Exception {
        String str1 = "大学";
        char cbuf[] = new char[str1.length()];
        // 将字符串str1内容存放到字符数组cbuf
        str1.getChars(0, str1.length(), cbuf, 0);
        String str2 = "华软软件学院";

        // 先创建文件字节输出流,再创建字符输出流
        FileOutputStream fos = new FileOutputStream("char1.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        // 以多种方式写入字符数据
        osw.write('广');// 写入一个字符
        osw.write('州');// 写入一个字符
        osw.write(cbuf);// 写入字符数组内容
        osw.write(str2);// 写入字符串内容
        osw.close();

        // 先创建文件字节输入流,再创建字符输入流
        FileInputStream fis = new FileInputStream("char1.txt");
        InputStreamReader isr = new InputStreamReader(fis);
// 定义一个能存放str1和str2的字符数组
        char mychars[] = new char[str1.length() + str2.length()];
        System.out.print((char) isr.read());// 以字符方式读取第1个字符,并输出
        System.out.print((char) isr.read());// 以字符方式读取第2个字符,并输出
// 以字符数组方式读取剩余字符
        int len = isr.read(mychars, 0, str1.length() + str2.length());
// 将字符数组内容以系统默认字符集生成字符串,并输出
        System.out.print(new String(mychars, 0, len));
        isr.close();

    }
}
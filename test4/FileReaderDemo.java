package test4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException, IOException {
        FileReader fr = new FileReader("myfile1.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;
        // 用循环逐行读取字符串，直至遇到null为止
        while ((s = br.readLine()) != null)
            System.out.println(s);
        br.close();
    }

}

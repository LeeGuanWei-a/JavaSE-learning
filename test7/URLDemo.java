package test7;

//URL类的例子

import java.net.*;


public class URLDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.sina.com.cn:80");
            System.out.println("协议: " + url.getProtocol());
            System.out.println("主机: " + url.getHost());
            System.out.println("端口: " + url.getPort());
        } catch (Exception e) {
            System.out.println("打开URL错误");
            e.printStackTrace();
        }
    }
}

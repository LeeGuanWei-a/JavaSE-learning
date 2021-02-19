package test7;


//获取指定域名对应的IP地址

import java.net.*;

public class GetIP {
    public static void main(String[] args) throws Exception{
        //定义一个InetAdress类的对象实例ip,并与www.baidu.com相关联
        InetAddress ip = InetAddress.getByName("www.baidu.com");
        //得到域名和IP地址
        System.out.println("百度主机的域名与地址:"+ip);
        //得到域名
        System.out.println("百度主机的域名:"+ip.getHostName());
        //得到IP地址
        System.out.println("百度主机的IP地址:"+ip.getHostAddress());
    }
}

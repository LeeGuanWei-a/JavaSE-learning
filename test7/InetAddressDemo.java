package test7;

//获取本机的IP地址

import java.net.*;

public class InetAddressDemo{
    public static void main(String args[]){
        try{
            InetAddress ia=InetAddress.getLocalHost();
            System.out.println(ia.getHostAddress());
            System.out.println(ia.toString());
        }catch(UnknownHostException uhe){
        }
    }
}

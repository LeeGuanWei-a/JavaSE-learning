package test7;

//UrlConnection应用举例:网页数据的读取


import java.net.*;
import java.io.*;


public class UrlConnectionDemo {
    public static void main(String args[]) {
        try {
            String keywords="Java网络编程";
            String url_str="http://www.baidu.com/s?wd="+keywords;
            URL url = new URL(url_str);
            URLConnection gc = url.openConnection();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(gc.getInputStream(),"utf-8"));
            String str;
            while ((str = in.readLine()) != null)
                System.out.println(str);
            in.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }catch (Exception e) {
            System.out.println("Exception caught");
            e.printStackTrace();
        }
    }
}

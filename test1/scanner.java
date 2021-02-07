package test1;//获得键盘输入

import java.util.Arrays;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);     //System.in获得输入流对象
        System.out.println("请输入姓名 ：");
        String name= scanner.nextLine();
        System.out.println("请输入你的爱好: " );
        String favor= scanner.nextLine();
        System.out.println("请输入年龄 ：");
        int age=scanner.nextInt();

        System.out.println("############################ " );
        System.out.println("姓名：" +name);
        System.out.println("爱好：" +favor);
        System.out.println("年龄：" +age);
    }


}

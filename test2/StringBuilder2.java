package test2;//可变字符序列和不可变字符序列使用的陷阱
//循环添加字符串使用StringBuilder

import java.util.Arrays;

public class StringBuilder2 {
    public static void main(String[] args) {
        //使用String进行字符串的拼接
        String string ="";

        long num1 = Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
        long time1 = System.currentTimeMillis();        //获得系统当前时间

        for (int i = 0; i < 5000 ; i ++){
            string = string + i;        //相当于创建了10000个对象
        }

        long num2 = Runtime.getRuntime().freeMemory();
        long time2 = System.currentTimeMillis();
        System.out.println("String占用内存 " + (num1 - num2));
        System.out.println("String占用时间 " + (time2 - time1));

        //使用StringBuilder进行字符串拼接
        StringBuilder stringBuilder = new StringBuilder();

        long num3 = Runtime.getRuntime().freeMemory();
        long time3 = System.currentTimeMillis();

        for (int i = 0; i < 5000 ; i ++){
            stringBuilder.append(i);
        }

        long num4 = Runtime.getRuntime().freeMemory();
        long time4 = System.currentTimeMillis();
        System.out.println("StringBuilder占用内存 " + (num3 - num4));
        System.out.println("StringBuilder占用时间 " + (time4 - time3));
    }
}

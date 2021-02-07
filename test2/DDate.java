package test2;//Date类的常用方法

import java.util.Arrays;
import java.util.Date;

public class DDate {
    public static void main(String[] args) {
        Date date = new Date();
        Date date1 = new Date(2000);
        System.out.println("date = " + date);

        System.out.println("毫秒数 = " + date.getTime());      //获得当前时间的毫秒数
        System.out.println("毫秒数 = " + date1.getTime());

        //实际是比较毫秒数
        System.out.println("date1在date后 : " + date1.after(date));      //比较时间date1是否在date后
        System.out.println("date1在date前 : " + date1.before(date));
        System.out.println("date1等于date : " + date.equals(date1));
        System.out.println("时间 = " + date.toString());

        //2020年1月30日，年份从1900年开始计算，月份在【0,11】区间
        //不推荐使用，有Canledar日期类
        Date date2 = new Date(2021-1900,1-1,30);
        System.out.println("date2 = " + date2);


    }
}

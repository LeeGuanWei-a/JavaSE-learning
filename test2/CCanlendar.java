package test2;//日期类的使用
//Calendar抽象类，GregorianCalendar实现类的使用


import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CCanlendar {

    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar(2021,1,30,21,39,00);      //2021年1月30日，21时39分0秒
        int year = calendar.get(Calendar.YEAR);     //获得年份
        int month = calendar.get(Calendar.MONTH);   //获得月份
        int weekday = calendar.get(Calendar.DAY_OF_WEEK); //获得星期,1-7,1:星期日，7：星期六
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR);

        System.out.println("时间 = " + calendar);
        System.out.println("年份 = " + year);
        System.out.println("月份 = " + month);
        System.out.println("星期 " + weekday);
        System.out.println("日 = " + day);
        System.out.println("时 = " + hour);

        //设置日期的相关元素
        Calendar calendar1 = new GregorianCalendar();
        calendar1.set(Calendar.YEAR,2021);
        System.out.println(calendar1);

        //日期的计算
        Calendar calendar2 = new GregorianCalendar();
        calendar2.add(Calendar.DATE,100);   //当前时间往前100天
        calendar2.add(Calendar.YEAR,-100);  //当前时间往后100年
        System.out.println("calendar2 = " + calendar2);

        //日期对象和时间对象的转化
        Date date = calendar.getTime();         //日期对象转化为时间对象
        System.out.println("args = " + date);

        Calendar calendar3 = new GregorianCalendar();
        calendar3.setTime(new Date());          //时间对象转化为日期对象
        printCalendar(calendar3);

    }

    public static void printCalendar(Calendar c){
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DAY_OF_MONTH);
        int dayweek = c.get(Calendar.DAY_OF_WEEK)-1;
        String dayweek2 =dayweek ==0?"日":dayweek+"";
        int hour = c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        System.out.println(year+"年 "+month+"月 "+date+"日 "+hour+"时 "
                +minute+"分 "+second+"秒"+"周"+dayweek2);

    }

}

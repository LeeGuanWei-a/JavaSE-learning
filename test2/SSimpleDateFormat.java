package test2;//DateFormat抽象类,SimpleDateFormat实现类的使用
//时间对象和字符串之间的转换

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class SSimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        //把时间对象按照“格式字符串指定的格式”转成相应的字符串
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String string = dateFormat.format(new Date(40000000));
        System.out.println("时间 = " + string);

        //把字符串按照“格式字符串指定的格式”转成相应的时间对象
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        Date date = dateFormat1.parse("2021年02月30日 21时14分00秒");
        System.out.println("时间 = " + date);
        //使用其他的格式字符
        DateFormat dateFormat2 = new SimpleDateFormat("D");
        String string1 = dateFormat2.format(new Date());
        System.out.println("今年已经过了 " + string1 + "天");



    }
}

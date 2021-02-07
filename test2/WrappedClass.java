package test2;//包装类,将数据类型转化为对应的对象类型

/*
基本类型            包装类
boolean             Boolean
char                Character
byte                Byte
short               Short
int                 Integer
long                Long
float               Float
double              Double
*/


import java.util.Arrays;

public class WrappedClass {
    public static void main(String[] args) {
        //基本数据类型转化成包装类对象
        Integer a = new Integer(3);
        Integer b =Integer.valueOf(30);

        //把包装类对象转化成基本数据类型
        int c =b.intValue();
        double d = b.doubleValue();

        //把字符串转化成包装类对象
        //数字格式的对象才能转化为Integer对象
        Integer e =new Integer("1111");
        Integer f =Integer.parseInt("1111");

        //把包装类对象转化成字符串
        String string = f.toString();
        String string1 = "" + f;

        //常见的常量
        System.out.println("int类型最大的整数= " + Integer.MAX_VALUE);


    }
}

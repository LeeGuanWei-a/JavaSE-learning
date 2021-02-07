package test1;

import java.util.Arrays;
import java.util.Date;
//import java.sql.Date;     //'java.util.Date' is already defined in a single-type import

import static java.lang.Math.*;
import static java.lang.Math.PI;

//导入不同包同名类时的写法
public class Import {
    public static void main(String[] args) {
        Date date =new Date();                              //util包下的Date类
        java.sql.Date date1= (java.sql.Date) new Date();    //sql包下的Date类

        //静态导入的写法
        System.out.println(Math.PI);
        System.out.println(PI);

    }
}

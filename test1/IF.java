package test1;//if语句的使用

import java.util.Arrays;

public class IF {
    public static void main(String[] args) {
        double d=Math.random();                         //返回【0,1）之间的随机数
        System.out.println("随机数：" + d);

        System.out.println((int)(6*Math.random()));     //返回【0,5】之间的随机数
        System.out.println((int)(6*Math.random()+1));   //返回【1,6】之间的随机数

        System.out.println("############################ " );

        int i=(int)(6*Math.random()+1);
        System.out.println(i);
        if(i<=3){
            System.out.println("小 " );
        }
        if(i>3){
            System.out.println("大 " );
        }


        System.out.println("############################ " );
        int h=(int)(6*Math.random()+1);
        System.out.println(h);
        if(h<=3)                                //if语句块判断执行它的下一行，再下一行不受if语句判断结果影响
            System.out.println("小 ");
            System.out.println("小小小 " );
    }

}

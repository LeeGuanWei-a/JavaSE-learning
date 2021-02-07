package test1;//break在循环语句中的使用


import java.util.Arrays;

public class Break {
    public static void main(String[] args) {
        int total = 0;
        System.out.println("开始 " );
        while (true){
            total ++;
            int i =(int)Math.round(100*Math.random());
            System.out.println("i = " +i);
            if (i == 80){           //当i=80的时候，终止程序块
                break;
            }
        }
        System.out.println("结束时循环 " + total + "次");
    }
}

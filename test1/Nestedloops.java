package test1;//嵌套循环的使用


import java.util.Arrays;

public class Nestedloops {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {              //重复显示5个i在同一行
                System.out.print(i);                    //不换行
            }
            System.out.println();                       //println()换行作用
        }
    }
}
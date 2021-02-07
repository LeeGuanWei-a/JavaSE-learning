package test1;//数组的遍历，foreach的使用

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] arr01 = new int[10];
        //循环初始化数组
        for (int i = 0;i < arr01.length; i++){
            arr01[i] = 10 * i;
        }
        //遍历数组
        for (int i = 0;i < arr01.length; i++){
            System.out.println("arr01 = " + arr01[i]);
        }
        System.out.println("############################## ");

        //foreach循环用于读取数组元素的值，不能修改元素的值
        for (int m : arr01){                //读取arr01数组的元素赋值给变量m
            System.out.println("m = " + m);
        }


    }
}

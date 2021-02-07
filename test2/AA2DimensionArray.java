package test2;//二维数组的使用

import java.util.Arrays;

public class AA2DimensionArray {
    public static void main(String[] args) {
/*        int[] a = new int[3];
        Car[] cars = new Car[3];*/

        int[][] a = new int[3][];

        a[0] = new int[]{20,30};
        a[1] = new int[]{10,20,30};
        a[2] = new int[]{40};
        System.out.println(a[1][2]);
        System.out.println("############## " );
        //静态初始化二维数组
        int[][] b = {
                {20,30},
                {10,20,30},
                {40}
        };
        System.out.println(b[1][2]);
    }
}

class Car{

}
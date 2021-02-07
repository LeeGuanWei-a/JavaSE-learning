package test2;//Arrays工具类的使用

import java.util.Arrays;

public class AArrays {
    public static void main(String[] args) {
        int[] a ={1,2,3};
        int[] b ={100,50,60,20};
        System.out.println("s = " + a);
        System.out.println("s = " + Arrays.toString(a));

        //数组排序
        Arrays.sort(b);
        System.out.println("b = " + Arrays.toString(b));

        //匹配数组元素索引，返回-1，元素不存在
        System.out.println(Arrays.binarySearch(b,50));
        System.out.println(Arrays.binarySearch(b,0));
    }
}

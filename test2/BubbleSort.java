package test2;//冒泡排序基本算法
//算法优化

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a ={0,9,5,3,7,4,6,8,2,1};
        int temp =0;            //设置中间值
        //多次循环
        for (int j =0; j<a.length-1;j++){
            boolean flag = true;        //排序优化，设置标志

            //一次循环，找到最大值
            for (int i = 0; i<a.length-1-j;i++){
                //比较大小，交换顺序
                if (a[i]>a[i+1]){
                    temp = a[i];
                    a[i] =a[i+1];
                    a[i+1] = temp;

                    flag = false;           //存在交换，即排序未结束，标志设置为false

                }
                System.out.println(Arrays.toString(a));
            }
            if (flag){
                System.out.println("循环结束 ");
                break;
            }
            System.out.println("########################## " );
        }


    }
}

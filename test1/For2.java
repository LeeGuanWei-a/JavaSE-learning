package test1;//for循环的使用


import java.util.Arrays;

public class For2 {
    public static void main(String[] args) {

        //for循环分别计算100以内的奇数及偶数的和，并分别输出
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= 100; i++){
            //偶数
            if (i%2 == 0){           //%取模运算符，结果为余数
                sum1 +=i ;           //等效于sum1 = sum1 + i;
            }else {         //奇数
                sum2 += i;
            }
        }
        System.out.println("偶数和= " + sum1);
        System.out.println("奇数和= " + sum2);

    }

}

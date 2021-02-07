package test1;

import java.util.Arrays;
//阶乘
public class Factorial {
    public static void main(String[] args) {
        long d1=System.currentTimeMillis();
        System.out.printf("阶乘结果为:" + factorial(10));
        long d2=System.currentTimeMillis();
        System.out.printf("递归时长: " ,d2 - d1);
    }

     private static long factorial(int n) {
         if (n == 1) {
             return 1;
         }else {
             return n*factorial(n-1);
         }

    }

}

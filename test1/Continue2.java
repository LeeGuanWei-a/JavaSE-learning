package test1;//带标签的continue，break语句的使用

import java.util.Arrays;

public class Continue2 {
    public static void main(String[] args) {

        //输出【101,200】之间的质数
        outer:for (int i = 101;i <= 200;i++){
            for (int j = 2;j < i/2;j++){       //1是所有数的因数，所以没必要从1开始取，j从2开始取，已知2是最小的因数，i/2即是能取的最大的因数
                if (i % j == 0){
                    continue outer;             //终止本次循环，跳到标签位置进行接下来的循环
                    //break outer;            //终止结束到标签，结束语句，即只循环当次
                }
            }
            System.out.println(i + " " );
        }

    }
}

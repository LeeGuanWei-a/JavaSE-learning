package test1;//coutinue在循环语句中的使用

import java.util.Arrays;

public class Continue {
    public static void main(String[] args) {

        //显示【1,100】之间能被3整除的数
        int count = 0;                  //定义计数器
        for (int i = 1;i <= 100;i++){
            if (i % 3 !=0){             //如果不是3的倍数，则跳过本次循环，继续进行下一次循环
                continue;
            }
            System.out.print(i+ "、 " ); //如果是3的倍数，输出该数
            count ++;                   //每输出一个数，计数器加1

            if (count % 5 ==0){         //每输出5个数换行一次
                System.out.println();
                count = 0;              //重置计数器，重新计数
            }
        }
    }
}

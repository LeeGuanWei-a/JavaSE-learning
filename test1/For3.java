package test1;//for循环的使用


import java.util.Arrays;

public class For3 {
    public static void main(String[] args) {

        //for循环输出1-1000之间能被5整除的数，且每行输出5个
        //方法1
        for (int i = 1;i <= 1000;i++){
            if (i % 5 ==0){
                System.out.print(i + "\t");
            }
            if (i % 25 == 0){               //25=5*5,及5列数
                System.out.println();
            }
        }

        System.out.println("###############################################" );
        //方法2
        int h = 0;                      //加一个计数器
        for (int i = 1;i <= 1000;i++){
            if (i % 5 ==0){
                System.out.print(i + "\t");
                h++;
            }
            if (h == 5){               //当h=5时换行，同时将h清零，使计数重新开始
                System.out.println();
                h = 0;
            }
        }

    }
}

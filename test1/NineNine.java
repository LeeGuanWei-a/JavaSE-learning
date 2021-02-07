package test1;//嵌套循环，九九乘法表

import java.util.Arrays;

public class NineNine {
    public static void main(String[] args) {
        //第二步，显示全部九九乘法表的内容,使用print()时吗，显示结果在同一行，使用println()时，显示结果在同一列
        for (int n = 1;n <= 9;n++){
/*            //第一步,显示九九乘法表的其中一行
            for (int m = 1;m <= 2;m++){
                System.out.print(m + "*" + 2 + "=" + (m * 2)+"\t");     //\t水平制表，相当于一个Tab键
            }*/

            for (int m = 1;m <= n;m++){
                System.out.print(m + "*" + n + "=" + (m * n)+"\t");     //\t水平制表，相当于一个Tab键
            }

            //第三步，每显示一行，立即换行显示下一行
               System.out.println();
        }

    }
}

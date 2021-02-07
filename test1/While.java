package test1;//while语句的使用
//当循环体判断为true时，继续执行while(){}的内容，当判断为false时，跳出循环体，结束while()程序


import java.util.Arrays;

public class While {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i<=100){
            sum = sum + i;
            i++;
            //i++;                  //不写这一句，则i的值不会改变，while语句变成死循环，无法结束
        }
        System.out.println("1+2+3+...+100= " + sum);
    }

}

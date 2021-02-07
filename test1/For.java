package test1;//for语句的使用
//for语句等同于while语句，for语句结构更清晰

import java.util.Arrays;

public class For {
    public static void main(String[] args) {
        int sum=0;

        for (int i = 1;i <= 100;i++){       //先执行循环体，再迭代
            sum = sum + i;

        for (int a = 1,b = a+1 ; a<5 ; a++,b = a *2){       //初始化语句用','隔开，循环语句用';'隔开
            System.out.println("a= " + a + ";b= " + b);
        }

        for(;;){        //等同于while(true){System.out.println("猫和老鼠 " );},会无限循环
            System.out.println("猫和老鼠 " );
        }
        }
        System.out.println("1+2+3+...+100= " + sum);
    }
}


//while语句的写法
/*
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

}*/

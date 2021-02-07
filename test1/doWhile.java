package test1;//do-while语句的使用
//do-while先执行后判断，建议使用while语句


public class doWhile {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        do {
            sum = sum + i;
            i++;
            //i++;                  //不写这一句，则i的值不会改变，while语句变成死循环，无法结束
        }while (i<=100);            //注意要写；
        System.out.println("1+2+3+...+100= " + sum);
    }
}

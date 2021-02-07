package test1;//overload方法的重载

import java.util.Arrays;

public class OverLoad {
    public static void main(String[] args) {
        System.out.println(add(3,4));
        System.out.println(add(3,4,5));
        System.out.println(add(3.0,4));
        System.out.println(add(3,4.0));
    }
    //两个数求和
    public static int add(int a,int b){
        int sum = a + b;
        return sum;
    }

/*    //方法名相同，参数类型相同，参数名相同，参数顺序不同，不构成重载
    public static int add(int b,int a){
        int sum = a + b;
        return sum;
    }*/

/*    //方法名相同，参数类型相同，参数名相同，参数顺序相同，返回值不同，不构成重载
    public static double add(int b,int a){
        double sum = a + b;
        return sum;
    }*/


    //三个数求和，方法名相同，参数个数不同，构成重载
    public static int add(int a,int b,int c){
        int sum = a + b + c;
        return sum;
    }

    //方法名相同，参数类型不同，构成重载
    public static double add(double a,int b){
        double sum = a + b;
        return sum;
    }

    //方法名相同，参数顺序不同，构成重载
    public static double add(int a,double b){
        double sum = a + b;
        return sum;
    }

}

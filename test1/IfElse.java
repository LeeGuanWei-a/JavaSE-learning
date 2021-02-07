package test1;//if-else语句的使用

import java.util.Arrays;

public class IfElse {
    public static void main(String[] args) {
        int i=(int)(6*Math.random()+1);
        System.out.println(i);
        if(i<=3){
            System.out.println("小 " );
        }else{
            System.out.println("大 " );
        }

        System.out.println("############################ " );
        //根据半径求圆的周长和面积
        double r=4*Math.random();               //产生[0,4]之间的随机数
        double area=Math.PI*Math.pow(r,2);      //Math.pow(a,b)意思是b是a的几次方
        double circle=2*Math.PI*r;
        System.out.println("圆的半径为： " + r);
        System.out.println("圆的面积为： " + area);
        System.out.println("圆的周长为: " + circle);

        if(area>=circle){
            System.out.println("圆的面积大于等于周长 " );
        }else {
            System.out.println("圆的面积小于周长 " );
        }

    }
}

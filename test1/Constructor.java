package test1;

import java.util.Arrays;
//构造器
class Point{
    double x,y;

    //构造方法名称与类名一致
    //重载：方法名相同，参数不同，使得调用时使用不同的方法
    public Point(double x,double y){
        this.x=x;//this指向创建好的成员变量
        this.y=y;
    }
    //系统自动产生
    public Point(){

    }

    //求两点间距离
    public double getDistance(Point p){
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }
}


public class Constructor {
    public static void main(String[] args) {
        Point p =new Point(3,4);
        Point o =new Point(0,0);
        Point i =new Point();
        System.out.println(p.getDistance(o));
    }
}

package test2;//接口的使用
//接口类里的方法全部是抽象方法
//接口定义方法的规范
//接口可以多继承
//属性只能是常量，不能是变量，即用public static final修饰


public interface InterFace {
    //两种写法，是等价的
    int max = 100;
    public static final int max1 = 100;

    void InterFace1();
    //public abstract void InterFace2();

}

class InterFace1 implements InterFace{
    @Override
    public void InterFace1() {
        System.out.println(max);
        System.out.println("实现InterFace1()方法");
    }
}

package test2;//接口和实现类的使用

public class InterFace2 {
    public static void main(String[] args) {
        Volant volant = new Angel();
        volant.fly();
        //接口类的对象只能使用抽象类里定义的方法
        //volant.helpOther();         //Cannot resolve method 'helpOther' in 'Volant'

        Angel angel = new Angel();
        angel.fly();
        angel.helpOther();
    }
}

interface Volant{
    int height = 1000;
    void fly();

}

interface Honest{
    void helpOther();
}

class Angel implements Volant,Honest{       //实现类可以实现多个父接口

    @Override
    public void fly() {
        System.out.println("飞飞飞！");
    }

    @Override
    public void helpOther() {
        System.out.println("帮助他人");
    }
}
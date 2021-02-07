package test1;//super父类对象引用


import java.util.Arrays;

public class Super {
    public static void main(String[] args) {
        new Son().father();
        System.out.println("##################### " );
        new Son2();
    }
}

class Dad{
    public int value;

    public void father(){
        value = 100;
        System.out.println("father.value = " + value);
    }
}

class Son extends Dad{
    public int value;

    @java.lang.Override
    public void father() {
        super.father();                     //调用父类对象的普通方法
        value = 200;
        System.out.println("son.value = " + value);
        System.out.println(value);
        System.out.println(super.value);    //调用父类对象的成员变量
    }
}

class Mom{
    public Mom(){
        //super();          //当该类为父类时，可以不写super()，因为他继承的是Object类
        System.out.println("创建父类对象");
    }
}

class Son2 extends Mom{
    public Son2(){
        super();            //继承父类的方法，先创建父类的构造方法，再创建子类的构造方法，static静态初始化块的创建顺序与构造方法的创建顺序相同
        System.out.println("创建子类对象");
    }
}
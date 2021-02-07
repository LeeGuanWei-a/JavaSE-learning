package test1;//final关键字
//修饰变量后，被修饰的变量不可改变，不能被重新赋值
//修饰方法后，该方法不能被子类重写，但是可以被重载
//修饰类后，被修饰的类不能被继承

import java.util.Arrays;

public class Final {
    public static void main(String[] args) {

    }
}

class A{
    final int a =1;
}

final class B{
    int b;
}

/*
class C extends B{      //Cannot inherit from final 'B'

}*/

/*
class D extends A{
    int a = 2;
}*/

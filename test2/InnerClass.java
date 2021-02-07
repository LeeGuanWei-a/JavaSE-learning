package test2;//非静态内部类，静态内部类的使用

public class InnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();

        //创建非静态内部类对象
        Outer.Inner inner = new Outer().new Inner();        //内部类对象依托外部类对象，首先要创建外部类对象，再创建内部类对象
        inner.show();

        //创建静态内部类对象
        Outer.Inner2 inner2 = new Outer.Inner2();
        inner2.show();


    }
}


class Outer{

    private int age = 10;
    private static int age2 =10;

    public void testOuter(){
        System.out.println("测试");
    }


    //非静态内部类
    class Inner{
        int age =20;

        public void show(){
            int age = 30;

            //非静态内部类调用外部类非静态变量和静态变量
            System.out.println("外部类的成员变量age=" + Outer.this.age);
            System.out.println("外部类的成员变量age2=" + Outer.this.age2);
            //非静态内部类调用内部类变量
            System.out.println("非静态内部类的成员变量age=" + this.age);
            //非静态内部类调用局部变量
            System.out.println("非静态内部类的局部变量age=" + age);
        }

    }

    //静态内部类
    static class Inner2{
        int age = 20;

        public void show(){
            int age = 30;
            //静态内部类调用外部类静态变量，不能调用非静态成员变量
            System.out.println("外部类的静态成员变量age2=" + Outer.age2);
            //静态内部类调用内部类变量
            System.out.println("静态内部类的成员变量age=" + this.age);
            //静态内部类调用局部变量
            System.out.println("静态内部类的局部变量age=" + age);
        }
    }

}
package test2;//局部内部类的使用

public class LocalInner{
    public static void main(String[] args) {
        new LocalInner().show();
    }

    public void show(){
        //定义在方法中，只能在该方法中使用，内部类不能被public、private、static修饰
        class Inner{
            public void fun(){
                System.out.println("Hello,World!");
            }
        }
        //匿名调用内部类方法
        new Inner().fun();
    }


}
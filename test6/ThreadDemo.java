package test6;

//多线程的使用


public class ThreadDemo {
    public static void main(String args[]) {
        new PrintName("A").start( );
        new PrintName("B").start( );
    }

}

class PrintName  extends Thread {
    String name = null;
    public PrintName(String n) {//构造器
        name = n;
    }
    public void run( ) {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(500);// 休眠0.5秒
            } catch (InterruptedException e) {
                e.printStackTrace( );
            }
            System.out.println("访问：" + name);
        }
    }
}

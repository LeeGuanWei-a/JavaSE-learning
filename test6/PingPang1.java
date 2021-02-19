package test6;

//用继承Thread类方法创建线程


public class PingPang1 extends Thread {
    private int delay;
    private String message;
    public PingPang1(String m, int r) {
        message = m;
        delay = r;
    }
    public void run( ) {
        try {
            for (int i=0;i<10;i++) {
                System.out.println(message);
                sleep(delay);// 休眠
            }
        } catch (InterruptedException e) {
            return;
        }
    }

    public static void main(String[] args) {
        PingPang1 t1 = new PingPang1("ping", 500);
        PingPang1 t2 = new PingPang1("pang", 1000);
        t1.start( );
        t2.start( );
    }
}

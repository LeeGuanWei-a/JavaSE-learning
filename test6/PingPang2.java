package test6;

//用实现Runnalbe接口方法创建线程


public class PingPang2 implements Runnable {
    private int delay;
    private String message;
    public PingPang2(String m, int r) {
        message = m;
        delay = r;
    }
    public void run( ) {
        try {
            for (int i=0;i<10;i++) {
                System.out.println(message);
                Thread.sleep(delay);// 休眠
            }
        } catch (InterruptedException e) {
            return;
        }
    }

    public static void main(String[] args) {
        PingPang2 pp1 = new PingPang2("ping", 500);
        PingPang2 pp2 = new PingPang2("pang", 1000);
        Thread t1=new Thread(pp1);
        Thread t2=new Thread(pp2);
        t1.start( );
        t2.start( );
    }
}

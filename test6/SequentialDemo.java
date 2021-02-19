package test6;

//单线程的使用


public class SequentialDemo {
    public static void main(String args[]) {
        new Sequential("A").run( );
        new Sequential("B").run( );
    }

}

class Sequential {
    String name = null;
    public Sequential(String n) {//构造器
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

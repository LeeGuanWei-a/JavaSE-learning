package test6;

//线程的优先级


class MyPriorityThread extends Thread {
    public void run( ) {
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(500);// 休眠0.5秒
                System.out.println("优先级为:"+getPriority( ) + " 的子线程在运行...");
            } catch (InterruptedException e) {
                e.printStackTrace( );
            }
        }
    }
}

public class PriorityDemo {
    public static void main(String[] args) {
        //输出主线程的优先级
        System.out.println("主线程优先线:"+Thread.currentThread( ).getPriority( ));
        //创建子线程,并设置不同优先级
        MyPriorityThread t1=new MyPriorityThread( );
        t1.setPriority(Thread.MAX_PRIORITY);
        MyPriorityThread t2=new MyPriorityThread( );
        MyPriorityThread t3=new MyPriorityThread( );
        t3.setPriority(Thread.MIN_PRIORITY);
        //启动所有子线程
        t3.start( );
        t2.start( );
        t1.start( );
    }
}

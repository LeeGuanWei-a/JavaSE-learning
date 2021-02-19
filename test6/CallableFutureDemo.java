package test6;

//使用Callable、Future接口方法创建线程


import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

//1. 创建Callable接口的实现类
class Task implements Callable<Integer> {
    private int flag = 0;
    public Task(int flag) {
        this.flag = flag;
    }
    // 实现call( )方法，作为线程执行体
    public Integer call( ) throws Exception {
        if (flag == 1) {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum = sum + i;
            }
            return sum;
        } else if (flag == 2) {
            try {
                while (true) {
                    System.out.println("子线程3:looping");
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e) {
                System.out.println("子线程3:Interrupted");
            }finally{
                return -1;
            }
        } else {
            return 0;
        }
    }

}

public class CallableFutureDemo {
    public static void main(String[] args) {
        // 2.使用FutureTask类包装Callable实现类的实例
        FutureTask<Integer> task1 = new FutureTask<Integer>(new Task(0));
        FutureTask<Integer> task2 = new FutureTask<Integer>(new Task(1));
        FutureTask<Integer> task3 = new FutureTask<Integer>(new Task(2));
        // 3.创建线程,使用FutureTask对象作为Thread对象的targer,并调用start( )方法启动线程
        new Thread(task1, "子线程1").start( );
        new Thread(task2, "子线程2").start( );
        new Thread(task3, "子线程3").start( );
        // 4.调用FutrueTask对象的get( )方法获取子线程执行结束后的返回值，调用cancel( )方法中止正在执行的线程
        try {
            System.out.println("子线程1返回值：" + task1.get( ));
            Thread.sleep(2000);
            System.out.println("子线程2返回值：" + task2.get( ));
            task3.cancel(true);
        } catch (Exception e) {
            e.printStackTrace( );
        }
        // 主线程任务
        for (int i = 1000; i < 1005; i++) {
            // 使用Thread.currentThread( ).getName( )获取主线程名字
            System.out.println(Thread.currentThread( ).getName( ) + " : " + i);
        }
    }
}

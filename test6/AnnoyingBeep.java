package test6;

//小闹钟——程序运行后2秒打开闹钟，启动系统报警器，每隔1秒响铃1次，3次后输出相关信息


import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class AnnoyingBeep {
    Toolkit toolkit;
    Timer timer;
    public AnnoyingBeep( ) {
        toolkit = Toolkit.getDefaultToolkit( );
        timer = new Timer( );
        timer.schedule(new RemindTask( ), 2000, 1000);
    }
    public static void main(String[] args) {
        new AnnoyingBeep( );
    }
    //定义一个内部类来执行任务
    class RemindTask extends TimerTask {
        int numWarningBeeps = 3;
        public void run( ) {
            if (numWarningBeeps > 0) {
                toolkit.beep( );
                System.out.println("Beep!");
                numWarningBeeps--;
            } else {
                toolkit.beep( );
                System.out.println("Time's up!");
                //timer.cancel( ); //无必要,因为稍后要退出程序运行
                System.exit(0);   //退出应用程序
            }
        }
    }
}

package test6;

//数字时钟——每隔1秒，时钟数字变化一次



import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimerDemo extends JFrame {
    JLabel timer;
    public TimerDemo( ) {
        super("时钟");
        Container c = getContentPane( );
        timer = new JLabel("时钟",JLabel.CENTER);
        c.add(timer);
        timer.setFont(new Font("宋体", Font.BOLD, 200));
        setSize(1000, 250);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        TimerDemo td = new TimerDemo( );
        new myTimer(td).start( );
    }
}

class myTimer extends Thread {
    TimerDemo tb;
    myTimer(TimerDemo tb) {
        this.tb = tb;
    }
    public void run( ) {
        while (true) {
            SimpleDateFormat dateformat = new SimpleDateFormat("hh:mm:ss");
            String s = dateformat.format(new Date( ));
            tb.timer.setText(s);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace( );
            }
        }
    }
}

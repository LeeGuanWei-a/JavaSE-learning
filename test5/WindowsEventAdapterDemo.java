package test5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WindowsEventAdapterDemo extends WindowAdapter {
	JFrame f;
	JDialog dig;
	public WindowsEventAdapterDemo() {// 构造方法
		f = new JFrame("窗口事件处理");
		f.addWindowListener(this);// 注册监听者
		f.setSize(300, 200);
		f.setVisible(true);
	}
	// 重写窗口关闭方法
	public void windowClosing(WindowEvent e) {
		dig = new JDialog(f, "确认退出", true);
		JPanel p = new JPanel();
		JButton yes = new JButton("是");
		JButton no = new JButton("否");
		p.add(yes);
		p.add(no);
// 内部类形式注册及重写事件处理方法
		yes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		no.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dig.dispose();
			}
		});
		dig.add(new JLabel("想要退出吗？"));
		dig.add(p, "South");
		dig.setSize(200, 100);
		dig.setVisible(true);
	}

	public static void main(String[] args) {
		new WindowsEventAdapterDemo();
	}
}

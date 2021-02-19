package test5;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

class MyFrame extends JFrame implements WindowListener {
	MyFrame() {
		setSize(300, 200);
		setVisible(true);
		addWindowListener(this);
	}
	public void windowActivated(WindowEvent e) {
		System.out.println("窗口被激活");
	}

	public void windowDeactivated(WindowEvent e) {
		System.out.println("窗口不是激活状态了");
	}
	public void windowClosing(WindowEvent e) {
		System.out.println("窗口正在关闭");
		dispose();
	}
	public void windowClosed(WindowEvent e) {
		System.out.println("窗口已经关闭,程序结束运行");
		System.exit(0);
	}

	public void windowIconified(WindowEvent e) {
		System.out.println("窗口图标化了");
	}
	public void windowDeiconified(WindowEvent e) {
		System.out.println("窗口撤消图标化");
	}
	public void windowOpened(WindowEvent e) {
		System.out.println("窗口已经打开");	}
}

public class WindowEventDemo {
	public static void main(String args[]) {
		new MyFrame();
	}
}

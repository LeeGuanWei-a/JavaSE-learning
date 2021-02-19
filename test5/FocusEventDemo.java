package test5;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FocusEventDemo extends JFrame implements FocusListener {
	JTextField tf;
	JButton bt;

	public FocusEventDemo() {
		super("焦点事件处理");
		bt = new JButton("Test");
		tf = new JTextField();
		// 添加事件的侦听器
		tf.addFocusListener(this);
		add(tf);
		add(bt, "South");
		setSize(300, 300);
		setVisible(true);
	}

	// 组件获得焦点时调用。
	public void focusGained(FocusEvent e) {
		tf.setText("单行文本框获得焦点");
		tf.setFont(new Font("宋体", Font.BOLD,20));
	}

	// 组件失去焦点时调用
	public void focusLost(FocusEvent e) {
		tf.setText("单行文本框失去焦点");
		tf.setFont(new Font ("宋体",Font.BOLD,20));
	}

	public static void main(String[] args) {
		final FocusEventDemo obj = new FocusEventDemo();
	}
}

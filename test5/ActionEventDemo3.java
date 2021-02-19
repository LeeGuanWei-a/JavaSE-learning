package test5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ActionEventDemo3 extends JFrame implements ActionListener {
	JTextField tf;
	JTextArea ta;
	JButton b1;
	JButton b2;

	ActionEventDemo3(String title) {
		super(title);
		JPanel p1 = new JPanel();
		p1.add(new JLabel("请输入一行文字: "));
		tf = new JTextField(30);// 向文本框注册监听者对象
		tf.addActionListener(this);
		p1.add(tf);

		b1 = new JButton("发送");
		b2 = new JButton("重置");
		// 向按钮注册监听者对象
		b1.addActionListener(this);
		b2.addActionListener(this);
		JPanel p2 = new JPanel();
		p2.add(b1);
		p2.add(b2);

		ta = new JTextArea();
		ta.setEditable(false);

		add(p1, "North");
		add(ta, "Center");
		add(p2, "South");
		setSize(500, 300);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// 以下用了几种方法判断事件源,请注意比较
		Object obj = e.getSource();
		// 判断事件源是TextField的处理方法
		if ((obj instanceof JTextField)) {
			ta.append("用户: " + tf.getText() + "\n");
			tf.setText("");
		}
		// 判断事件源是JButton的处理方法
		if ((obj instanceof JButton)) {
			// 如果是"发送"按钮
			if (e.getActionCommand().equals("发送")) {
				ta.append("用户: " + tf.getText() + "\n");
				tf.setText("");
			}
			if (b2 == (JButton) obj) {
				ta.setText("");
				tf.setText("");
			}
		}
	}

	public static void main(String[] args) {
		new ActionEventDemo3("模拟聊天窗口");
	}
}

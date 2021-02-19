package test5;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ActionEventDemo2 extends JFrame implements ActionListener {
	ActionEventDemo2() {
		JPanel panel = new JPanel();
		// 创建三个事件源
		JButton redbutton = new JButton("红色");
		JButton greenbutton = new JButton("绿色");
		JButton bluebutton = new JButton("蓝色");
		panel.add(redbutton);
		panel.add(greenbutton);
		panel.add(bluebutton);
		add(panel, "North");

		// 注册事件监听器:同一个对象
		redbutton.addActionListener(this);
		greenbutton.addActionListener(this);
		bluebutton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {// 实现接口方法
		String btnLabel = e.getActionCommand();
		Container con = getContentPane();

		if (btnLabel.equals("红色")) {
			con.setBackground(Color.RED);
		} else if (btnLabel.equals("绿色")) {
			con.setBackground(Color.GREEN);
		} else if (btnLabel.equals("蓝色")) {
			con.setBackground(Color.BLUE);
		}
	}

	public static void main(String argc[]) {
		ActionEventDemo2 myframe = new ActionEventDemo2();
		myframe.setTitle("ActionEvent事件");
		myframe.setSize(300, 200);
		myframe.setVisible(true);
	}
}

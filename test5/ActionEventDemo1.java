package test5;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ColorAction implements ActionListener {
	private ActionEventDemo1 frame;
	private Color backgroundcolor;

	public ColorAction(ActionEventDemo1 aef, Color c) {
		frame = aef;
		backgroundcolor = c;
	}

	public void actionPerformed(ActionEvent e) {
		Container con = frame.getContentPane();
		con.setBackground(backgroundcolor);
	}
}

public class ActionEventDemo1 extends JFrame {
	ActionEventDemo1() {
		JPanel panel = new JPanel();
		// ���������¼�Դ
		JButton redbutton = new JButton("红色");
		JButton greenbutton = new JButton("绿色");
		JButton bluebutton = new JButton("蓝色");
		panel.add(redbutton);
		panel.add(greenbutton);
		panel.add(bluebutton);
		add(panel, "North");

		// ע���¼�������:ͬһ�����������ͬ����
		redbutton.addActionListener(new ColorAction(this, Color.red));
		greenbutton.addActionListener(new ColorAction(this, Color.green));
		bluebutton.addActionListener(new ColorAction(this, Color.blue));
	}

	public static void main(String argc[]) {
		ActionEventDemo1 myframe = new ActionEventDemo1();
		myframe.setTitle("ActionEvent窗口");
		myframe.setSize(300, 200);
		myframe.setVisible(true);
	}
}

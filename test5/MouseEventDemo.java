package test5;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventDemo extends JFrame {
	JLabel mouseInfo1, mouseInfo2;

	public MouseEventDemo() {
		super("Mouse移动处理");
		mouseInfo1 = new JLabel("");
		mouseInfo1.setOpaque(true);// 设置不透明
		mouseInfo1.setBackground(Color.YELLOW);
		mouseInfo2 = new JLabel("");
		mouseInfo2.setOpaque(true);// 设置不透明
		mouseInfo2.setBackground(Color.YELLOW);
		add(mouseInfo1, "North");
		add(mouseInfo2, "South");
		addMouseMotionListener(new MouseMotionAdapter() {
			// 鼠标按键在组件上移动（无按键按下）时调用
			public void mouseMoved(MouseEvent e) {
				mouseInfo1.setText(e.getX() + " " + e.getY());
			}
		});

		addMouseListener(new MouseAdapter() {
			// 鼠标进入组件时调用
			public void mouseEntered(MouseEvent e) {
				mouseInfo2.setText("Enter");
			}

			// 鼠标离开组件时调用
			public void mouseExited(MouseEvent e) {
				mouseInfo2.setText("Exit");
			}

			// 鼠标按键在组件上按下时调用
			public void mousePressed(MouseEvent e) {
				if (e.getButton() == e.BUTTON1)
					mouseInfo2.setText("Left Button");
				else if (e.getButton() == e.BUTTON2)
					mouseInfo2.setText("Middle Button");
				else if (e.getButton() == e.BUTTON3)
					mouseInfo2.setText("Right Button");
			}
		});
	}

	public static void main(String[] args) {
		final MouseEventDemo obj = new MouseEventDemo();
		obj.setSize(200, 200);
		obj.setVisible(true);
	}
}

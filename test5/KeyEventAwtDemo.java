package test5;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class KeyEventAwtDemo extends JFrame {
	JButton man;

	public KeyEventAwtDemo() {
		super("KeyEvent事件");
		setLayout(null);
		setSize(200, 200);
		man = new JButton("man");
		man.setBounds(100, 100, 60, 40);
		man.setBackground(Color.BLUE);
		man.setForeground(Color.WHITE);
		Container con = getContentPane();
		con.add(man);
		// 键盘方向键事件
		man.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				String direction = KeyEvent.getKeyText(e.getKeyCode());
				int x = man.getX();
				int y = man.getY();
				if (direction.equals("向右箭头"))
					x += 10;
				else if (direction.equals("向左箭头"))
					x -= 10;
				else if (direction.equals("向下箭头"))
					y += 10;
				else if (direction.equals("向上箭头"))
					y -= 10;
				man.setLocation(x, y);
			}
		});

	}

	public static void main(String[] args) {
		KeyEventAwtDemo obj = new KeyEventAwtDemo();
		obj.setVisible(true);
	}
}

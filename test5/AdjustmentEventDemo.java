package test5;

import java.awt.Font;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class AdjustmentEventDemo extends JFrame implements AdjustmentListener {
	JScrollBar  scb;
	JLabel label;

	public AdjustmentEventDemo() {
		super("AdjustmentEvent事件处理");
		label = new JLabel("Java图形界面", JLabel.CENTER);
		scb = new JScrollBar(JScrollBar.HORIZONTAL, 10,2, 10, 200);
		add(label);
		add(scb, "South");
		scb.addAdjustmentListener(this);
	}

	//在可调整的值发生更改时调用该方法
	public void adjustmentValueChanged(AdjustmentEvent e) {
		Font f = new Font("New Arial", 1, scb.getValue());
		label.setFont(f);
	}

	public static void main(String[] args) {
		final AdjustmentEventDemo obj = new AdjustmentEventDemo();
		obj.setSize(600, 300);
		obj.setVisible(true);
	}
}

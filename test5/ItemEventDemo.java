package test5;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ItemEventDemo extends JFrame implements ItemListener {
	JRadioButton cb1;
	JRadioButton cb2;
	ButtonGroup cbg = new ButtonGroup();
	JTextField tf = new JTextField();

	public ItemEventDemo() {
		super("ItemEvent事件处理");
		setLayout(new GridLayout(1, 2));
		cb1 = new JRadioButton("男", false);
		cb2 = new JRadioButton("女", false);
		cbg.add(cb1);
		cbg.add(cb2);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		JPanel p = new JPanel();
		p.add(cb1);
		p.add(cb2);
		add(tf);
		add(p);
	}

	// 在用户已选定或取消选定某项时调用
	public void itemStateChanged(ItemEvent e) {
		if ((e.getSource() == cb1) && cb1.isSelected())
			tf.setText(cb1.getText());
		if ((e.getSource() == cb2) && cb2.isSelected())
			tf.setText(cb2.getText());
	}

	public static void main(String[] args) {
		final ItemEventDemo obj = new ItemEventDemo();
		obj.pack();
		obj.setVisible(true);
	}
}

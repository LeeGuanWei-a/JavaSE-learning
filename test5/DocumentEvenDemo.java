package test5;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class DocumentEvenDemo extends JFrame implements DocumentListener {
	JLabel info;
	JLabel length;
	JTextField tf;
	String str = "";

	public DocumentEvenDemo() {
		super("DocumentEven事件处理");
		setLayout(new GridLayout(3, 1));
		// 创建组件
		info = new JLabel("字符串 :");
		length = new JLabel("字符个数:0");
		tf = new JTextField();
		add(info);
		add(length);
		add(tf);
		setSize(300, 200);
		setVisible(true);

		// 获取与编辑器关联的模型
		Document doc = tf.getDocument();
		// 添加DocumentListener侦听器
		doc.addDocumentListener(this);
	}

	void handle(DocumentEvent e) {
		Document doc = e.getDocument();
		try {
			str = doc.getText(0, doc.getLength()); // 返回文本框的内容
			info.setText("字符串 :" + str);
			length.setText("字符个数:" + str.length());
		} catch (BadLocationException be) {
			System.out.println("出错");
		}
	}
	// 文本框字符串发生改变的事件
	public void insertUpdate(DocumentEvent e) {
		handle(e);
	}
	public void removeUpdate(DocumentEvent e) {
		handle(e);
	}
	public void changedUpdate(DocumentEvent e) {
		handle(e);
	}

	public static void main(String[] args) {
		new DocumentEvenDemo();
	}
}

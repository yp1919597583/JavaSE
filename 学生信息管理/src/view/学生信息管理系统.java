package view;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.management.loading.PrivateClassLoader;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class 学生信息管理系统 extends JFrame {
	private JPanel jp1;
	private P2 jp2;
	private JTextField textField;
	private P3 jp3;
	private P4 jp4;
	public static void main(String[] args) {
		
		学生信息管理系统 frame = new 学生信息管理系统();
		frame.setResizable(false);			
		frame.setVisible(true);				
	}

	public 学生信息管理系统() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrator\\Desktop\\ico\\\u5BA2\u6237\u7BA1\u7406\u7CFB\u7EDF.png"));
		setTitle("学生信息管理系统");
		jp1=new P1();//创建面板一
		jp2=new P2();
		jp3=new P3();
		jp4=new P4();
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

		tabbedPane.add("录入",jp1);//将面板一加入表格面板
		tabbedPane.add("查询",jp2);
		tabbedPane.add("修改",jp4);
		tabbedPane.add("删除",jp3);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setContentPane(tabbedPane);

	}
}

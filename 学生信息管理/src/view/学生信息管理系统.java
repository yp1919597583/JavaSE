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

public class ѧ����Ϣ����ϵͳ extends JFrame {
	private JPanel jp1;
	private P2 jp2;
	private JTextField textField;
	private P3 jp3;
	private P4 jp4;
	public static void main(String[] args) {
		
		ѧ����Ϣ����ϵͳ frame = new ѧ����Ϣ����ϵͳ();
		frame.setResizable(false);			
		frame.setVisible(true);				
	}

	public ѧ����Ϣ����ϵͳ() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrator\\Desktop\\ico\\\u5BA2\u6237\u7BA1\u7406\u7CFB\u7EDF.png"));
		setTitle("ѧ����Ϣ����ϵͳ");
		jp1=new P1();//�������һ
		jp2=new P2();
		jp3=new P3();
		jp4=new P4();
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

		tabbedPane.add("¼��",jp1);//�����һ���������
		tabbedPane.add("��ѯ",jp2);
		tabbedPane.add("�޸�",jp4);
		tabbedPane.add("ɾ��",jp3);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setContentPane(tabbedPane);

	}
}

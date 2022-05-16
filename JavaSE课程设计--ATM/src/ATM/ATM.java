package ATM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;

public class ATM extends JFrame {
	private JPanel p1;
	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private P2 p2;
	private P3 p3;
	private P4 p4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM frame = new ATM();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ATM() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrator\\Desktop\\ATM.png"));
		setTitle("ATM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		p1=new P1();
		p2=new P2();
		p3=new P3();
		p4=new P4();
		tabbedPane.add(p1, "查询");
		tabbedPane.add(p2, "取款");
		tabbedPane.add(p3, "存款");
		tabbedPane.add(p4, "修改密码");
		
		contentPane.add(tabbedPane, BorderLayout.CENTER);
	}

}

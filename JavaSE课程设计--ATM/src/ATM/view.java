package ATM;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class view extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextPane textPane;
	private JTextPane textPane_1;
	private JButton btnNewButton;
	private JTextPane txtpnAtm;
	private ATM atm;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view frame = new view();
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
	public view() {
		setResizable(false);
		setTitle("\u767B\u5F55");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrator\\Desktop\\\u767B\u5F55 \u7528\u6237.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setBounds(166, 70, 66, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		//textField_1.SetsecureTextEntry=YES;
		textField_1.setBounds(166, 123, 66, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textPane = new JTextPane();
		textPane.setBackground(SystemColor.menu);
		textPane.setEditable(false);
		textPane.setText("\u8D26\u53F7:");
		textPane.setBounds(59, 70, 48, 21);
		contentPane.add(textPane);
		
		textPane_1 = new JTextPane();
		textPane_1.setBackground(SystemColor.menu);
		textPane_1.setEditable(false);
		textPane_1.setText("\u5BC6\u7801:");
		textPane_1.setBounds(59, 123, 48, 21);
		contentPane.add(textPane_1);
		
		btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButtonActionPerformed(e);
			}
		});
		btnNewButton.setBounds(156, 195, 93, 23);
		contentPane.add(btnNewButton);
		
		txtpnAtm = new JTextPane();
		txtpnAtm.setBackground(SystemColor.menu);
		txtpnAtm.setEditable(false);
		txtpnAtm.setForeground(Color.RED);
		txtpnAtm.setFont(new Font("»ªÎÄçúçê", Font.PLAIN, 30));
		txtpnAtm.setText("ATM");
		txtpnAtm.setBounds(139, 10, 79, 50);
		contentPane.add(txtpnAtm);
	}
	protected void btnNewButtonActionPerformed(ActionEvent e) {
		
		String AccountNumber=textField.getText();
		String password=textField_1.getText();
		control con=new control();
		boolean x= con.LoginAuthentication(AccountNumber,password);
		if (x==true) {
			JOptionPane.showMessageDialog(textField_1, "µÇÂ¼³É¹¦!");
			
			atm=new ATM();
			atm.setVisible(true);
			this.setVisible(false);
			
		}else {
			JOptionPane.showMessageDialog(textField_1, "µÇÂ¼Ê§°Ü,ÃÜÂë»òÕËºÅ´íÎó!");
		}
	}
}

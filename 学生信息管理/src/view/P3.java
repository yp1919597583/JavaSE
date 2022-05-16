package view;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import dao.connenct;

import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class P3 extends JPanel {
	private JTextField textField;

	public P3() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(203, 55, 66, 21);
		add(textField);
		textField.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(SystemColor.textHighlight);
		textPane.setEditable(false);
		textPane.setBackground(SystemColor.menu);
		textPane.setText("\u8981\u5220\u9664\u5B66\u751F\u7684\u5B66\u53F7\uFF1A");
		textPane.setBounds(71, 55, 119, 21);
		add(textPane);
		
		JButton btnNewButton = new JButton("\u5220\u9664");
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				connenct con=new connenct();
				String id=textField.getText();
				
				int x=con.delect(id);
				//ÅÐ¶ÏÉ¾³ýÊÇ·ñ³É¹¦
				if (x>0) {
					JOptionPane.showMessageDialog(textPane,"É¾³ý³É¹¦!");
				}else {
					JOptionPane.showMessageDialog(textPane, "É¾³ýÊ§°Ü!");
				}
			}
		});
		btnNewButton.setBounds(199, 188, 93, 23);
		add(btnNewButton);
	}
}

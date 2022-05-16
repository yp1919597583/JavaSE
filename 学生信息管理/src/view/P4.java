package view;

import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JTextPane;

import dao.connenct;
import model.Student;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class P4 extends JPanel {
	Student s;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	public P4() {
		
		setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBackground(SystemColor.menu);
		textPane.setForeground(new Color(255, 0, 0));
		textPane.setText("\u8F93\u5165\u4FEE\u6539\u5B66\u53F7:");
		textPane.setBounds(69, 24, 85, 21);
		add(textPane);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
			char c=e.getKeyChar();
			if (c>'9' || c<'0') {
				e.consume();
			}
	
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
	
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				char c=e.getKeyChar();
				if (c==KeyEvent.VK_ENTER) {
					
				
				connenct con=new connenct();
				
				s=con.select2(textField.getText());
				textField_1.setText(s.getId());
				textField_2.setText(s.getName());
				textField_3.setText(Float.toString(s.getMath()));
				textField_4.setText(Float.toString(s.getPhysical()));
				textField_5.setText(Float.toString(s.getEnglish()));
				}
				
			}
		});
		textField.setBounds(208, 24, 66, 21);
		add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 55, 420, 2);
		add(separator);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setBackground(SystemColor.menu);
		textPane_1.setText("\u5B66\u53F7:");
		textPane_1.setBounds(69, 90, 42, 21);
		add(textPane_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(139, 90, 66, 21);
		add(textField_1);
		textField_1.setColumns(10);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setEditable(false);
		textPane_2.setBackground(SystemColor.menu);
		textPane_2.setText("\u59D3\u540D:");
		textPane_2.setBounds(267, 90, 37, 21);
		add(textPane_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(337, 90, 66, 21);
		add(textField_2);
		textField_2.setColumns(10);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setEditable(false);
		textPane_3.setBackground(SystemColor.menu);
		textPane_3.setText("\u6570\u5B66\u6210\u7EE9:");
		textPane_3.setBounds(69, 144, 61, 21);
		add(textPane_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(139, 144, 66, 21);
		add(textField_3);
		textField_3.setColumns(10);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setEditable(false);
		textPane_4.setBackground(SystemColor.menu);
		textPane_4.setText("\u7269\u7406\u6210\u7EE9:");
		textPane_4.setBounds(267, 144, 61, 21);
		add(textPane_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(337, 144, 66, 21);
		add(textField_4);
		textField_4.setColumns(10);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setEditable(false);
		textPane_5.setBackground(SystemColor.menu);
		textPane_5.setText("\u82F1\u8BED\u6210\u7EE9:");
		textPane_5.setBounds(69, 200, 61, 21);
		add(textPane_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(141, 198, 66, 21);
		add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("\u4FEE\u6539");
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String Id=textField_1.getText();
				String name=textField_2.getText();
				float meth=(float) Double.parseDouble(textField_3.getText());
				float phy=(float) Double.parseDouble(textField_4.getText());
				float eng=(float) Double.parseDouble(textField_5.getText());
				connenct con=new connenct();
				int x=con.updete(new Student(Id, name, meth, phy, eng));
				//判断是否修改成功,提醒操作者
				if (x>0) {
					JOptionPane.showMessageDialog(textPane_1, "修改成功!");
				}else {
					JOptionPane.showMessageDialog(textPane_1, "修改失败!");
				}

			}
		});
		btnNewButton.setBounds(264, 202, 93, 23);
		add(btnNewButton);
	}
}

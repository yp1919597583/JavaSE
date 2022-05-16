package view;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.connenct;
import model.Student;

import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
public class P1 extends JPanel {
	private JTextField ID;
	private JTextField Name;
	private JTextField Meth;
	private JTextField Pyh;
	private JTextField Eng;
	public P1() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		JTextPane T1 = new JTextPane();
		T1.setFont(new Font("方正舒体", Font.PLAIN, 12));
		T1.setForeground(new Color(255, 0, 0));
		T1.setEditable(false);
		T1.setBackground(SystemColor.menu);
		T1.setText("\u5B66\u53F7:");
		T1.setBounds(51, 58, 37, 21);
		add(T1);
		ID = new JTextField();
		ID.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if (c<'0' || c>'9') {
					e.consume();
				}	
			}
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
			}
			@Override
			public void keyPressed(KeyEvent arg0) {
			}
		});
		ID.setBounds(126, 58, 66, 21);
		add(ID);
		ID.setColumns(10);
		
		JTextPane T2 = new JTextPane();
		T2.setFont(new Font("方正舒体", Font.PLAIN, 12));
		T2.setForeground(new Color(220, 20, 60));
		T2.setEditable(false);
		T2.setBackground(SystemColor.menu);
		T2.setText("\u59D3\u540D:");
		T2.setBounds(250, 58, 37, 21);
		add(T2);
		Name = new JTextField();
	Name.addKeyListener(new KeyListener() {
		@Override
		public void keyTyped(KeyEvent e) {
			char c=e.getKeyChar();
			if (c<'\u4E00'||c>'\u9FA5') {
				e.consume();
			}
		}
		@Override
		public void keyReleased(KeyEvent arg0) {		
		}
		@Override
		public void keyPressed(KeyEvent arg0) {		
		}
	});
		Name.setBounds(328, 58, 66, 21);
		add(Name);
		Name.setColumns(10);
		JTextPane T3 = new JTextPane();
		T3.setFont(new Font("方正舒体", Font.PLAIN, 12));
		T3.setForeground(new Color(220, 20, 60));
		T3.setEditable(false);
		T3.setBackground(SystemColor.menu);
		T3.setText("\u6570\u5B66\u6210\u7EE9:");
		T3.setBounds(51, 108, 66, 21);
		add(T3);
		Meth = new JTextField();
		Meth.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent arg0) {
			char c=arg0.getKeyChar();
			if (c>'9' || c<'0') {
				arg0.consume();
			}
			}
			public void keyReleased(KeyEvent arg0) {	
			}
			public void keyPressed(KeyEvent arg0) {	
			}
		});
		Meth.setBounds(126, 108, 66, 21);
		add(Meth);
		Meth.setColumns(10);
		JTextPane T4 = new JTextPane();
		T4.setFont(new Font("方正舒体", Font.PLAIN, 12));
		T4.setForeground(new Color(220, 20, 60));
		T4.setEditable(false);
		T4.setBackground(SystemColor.menu);
		T4.setText("\u7269\u7406\u6210\u7EE9:");
		T4.setBounds(250, 108, 65, 21);
		add(T4);
		Pyh = new JTextField();
        Pyh.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent arg0) {
			char c=arg0.getKeyChar();
			if (c>'9' || c<'0') {
				arg0.consume();
			}	
			}
			public void keyReleased(KeyEvent arg0) {
			}
			public void keyPressed(KeyEvent arg0) {
			}
		});
		Pyh.setBounds(329, 106, 66, 21);
		add(Pyh);
		Pyh.setColumns(10);
		JButton btnNewButton = new JButton("\u4FDD\u5B58");
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Id=ID.getText();
				String name=Name.getText();
				float meth=(float) Double.parseDouble(Meth.getText());
				float phy=(float) Double.parseDouble(Pyh.getText());
				float eng=(float) Double.parseDouble(Eng.getText());
				connenct con=new connenct();
				int x=con.get(new Student(Id, name, meth, phy, eng));
				//判断是否添加成功
				if (x>0) {
					JOptionPane.showMessageDialog(Name, "添加成功!");
				}else {
					JOptionPane.showMessageDialog(Name, "添加失败!");
				}
			}
		});
		btnNewButton.setBounds(250, 160, 93, 23);
		add(btnNewButton);
		JTextPane T5 = new JTextPane();
		T5.setFont(new Font("方正舒体", Font.PLAIN, 12));
		T5.setForeground(new Color(220, 20, 60));
		T5.setEditable(false);
		T5.setBackground(SystemColor.menu);
		T5.setText("\u82F1\u8BED\u6210\u7EE9:");
		T5.setBounds(56, 160, 61, 21);
		add(T5);
		Eng = new JTextField();
        Eng.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent arg0) {
			char c=arg0.getKeyChar();
			//限制输入数字
			if (c>'9' || c<'0') {
				arg0.consume();
			}	
			}
			@Override
			public void keyReleased(KeyEvent arg0) {
			}
			public void keyPressed(KeyEvent arg0) {
			}
		});
		Eng.setBounds(126, 160, 66, 21);
		add(Eng);
		Eng.setColumns(10);
		JButton btnNewButton_1 = new JButton("\u6E05\u7A7A");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ID.setText(null);
				Name.setText(null);
				Meth.setText(null);
				Pyh.setText(null);
				Eng.setText(null);
			}
		});
		btnNewButton_1.setBounds(250, 193, 93, 23);
		add(btnNewButton_1);
	}
}

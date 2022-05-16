package ATM;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class P3 extends JPanel {
	private JTextField textField;
	private JButton btnNewButton;
	private JLabel lblNewLabel;

	/**
	 * Create the panel.
	 */
	public P3() {
setLayout(null);
textField = new JTextField();
textField.setBounds(169, 103, 66, 21);
add(textField);
textField.setColumns(10);
btnNewButton = new JButton("\u5B58\u6B3E");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		int num=Integer.parseInt(textField.getText());
		
		int flage=num/100;
		if (flage < 1) {
			JOptionPane.showMessageDialog(textField, "请放入100元整钞");
		}
		
		
		else {
			control con=new control();
			int x=con.deposite(num);
			JOptionPane.showMessageDialog(textField, "存款成功");
		}
		
	}
});
btnNewButton.setBounds(169, 186, 93, 23);
add(btnNewButton);
lblNewLabel = new JLabel("\u5B58\u6B3E\u91D1\u989D");
lblNewLabel.setBounds(54, 106, 66, 15);
add(lblNewLabel);
	}

}

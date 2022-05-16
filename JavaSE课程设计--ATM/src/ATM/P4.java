package ATM;

import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class P4 extends JPanel {
	private JTextField textField;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public P4() {
setLayout(null);
textField = new JTextField();
textField.setBounds(192, 102, 66, 21);
add(textField);
textField.setColumns(10);
btnNewButton = new JButton("\u4FEE\u6539");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		
		String newpassword=textField.getText();
		String newpassword2=textField_1.getText();
		control con=new control();
		int x;
		int y=0;
		for (int i = 0; i < newpassword.length(); i++) {
			
			if (newpassword.charAt(i)>='0' & newpassword.charAt(i) <='9' ) {
				y++; 
			}else if(newpassword2.charAt(i)>='0' & newpassword2.charAt(i) <='9')
			{
				y++;
			}
			
		}
		if ( Integer.parseInt(newpassword2) !=Integer.parseInt(newpassword)) {
			JOptionPane.showMessageDialog(textField, "两次密码不一样");
			
		}else if(y<6)
		{
			JOptionPane.showMessageDialog(textField, "密码最小长度为六位");
		}
		
		else 
		{
			x=con.ChangeCode(newpassword);
			JOptionPane.showMessageDialog(textField, "修改成功");
		}
		

		
	}
});
btnNewButton.setBounds(192, 182, 93, 23);
add(btnNewButton);
lblNewLabel = new JLabel("\u8F93\u5165\u65B0\u5BC6\u7801:");
lblNewLabel.setBounds(87, 105, 93, 15);
add(lblNewLabel);
JLabel lblNewLabel_1 = new JLabel("\u786E\u8BA4\u5BC6\u7801:");
lblNewLabel_1.setBounds(87, 142, 54, 15);
add(lblNewLabel_1);
textField_1 = new JTextField();
textField_1.setBounds(192, 139, 66, 21);
add(textField_1);
textField_1.setColumns(10);
	}
}

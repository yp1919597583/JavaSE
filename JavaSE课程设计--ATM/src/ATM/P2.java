package ATM;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class P2 extends JPanel {
	private JButton btnNewButton;
	private JTextField textField;
	private JLabel lblNewLabel;

	public P2() {
		setLayout(null);
		
		btnNewButton = new JButton("\u53D6\u6B3E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num=Integer.parseInt(textField.getText());	
				int  num2;
				control con=new control();
				num2=Integer.parseInt( con.Quey());
				
				if(num>num2 )
				
				{
					JOptionPane.showMessageDialog(textField, "余额不足");
				}
				else if(num>5000)
				{
					JOptionPane.showMessageDialog(textField, "取款失败！一次最多能取5000");
				}else
				{

					con.teller(num);
					JOptionPane.showMessageDialog(textField, "取款成功");
					
				}	
			}
		});
		btnNewButton.setBounds(187, 174, 93, 23);
		add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(198, 67, 66, 21);
		add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("\u53D6\u6B3E\u91D1\u989D:");
		lblNewLabel.setBounds(73, 70, 66, 15);
		add(lblNewLabel);
	}

}

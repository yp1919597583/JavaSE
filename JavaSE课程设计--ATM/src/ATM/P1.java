package ATM;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class P1 extends JPanel {
	private JTextField textField;
	private JButton btnNewButton;
	private JLabel lblNewLabel;

	/**
	 * Create the panel.
	 */
	public P1() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setBounds(194, 85, 66, 21);
		add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButtonActionPerformed(e);
			}
		});
		btnNewButton.setBounds(180, 165, 93, 23);
		add(btnNewButton);
		
		lblNewLabel = new JLabel("\u4F59\u989D");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(81, 88, 54, 15);
		add(lblNewLabel);
	}
	protected void btnNewButtonActionPerformed(ActionEvent e) {
		
		control control=new control();
		String s=control.Quey();
		textField.setText(s);
		
		
		
	}
}

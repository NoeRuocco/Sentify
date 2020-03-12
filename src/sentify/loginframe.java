package sentify;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class loginframe extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;



	/**
	 * Create the frame.
	 */
	public loginframe(Controller c) {
		Controller c2 = c;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 315);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnUsername = new JTextPane();
		txtpnUsername.setBackground(new Color(204, 204, 255));
		txtpnUsername.setFont(new Font("Candara", Font.PLAIN, 16));
		txtpnUsername.setEditable(false);
		txtpnUsername.setText("Username:");
		txtpnUsername.setBounds(191, 47, 87, 19);
		contentPane.add(txtpnUsername);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setFont(new Font("Candara", Font.PLAIN, 15));
		textField.setBounds(182, 76, 106, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setBackground(new Color(204, 204, 255));
		txtpnPassword.setFont(new Font("Candara", Font.PLAIN, 16));
		txtpnPassword.setText("Password:");
		txtpnPassword.setBounds(191, 120, 87, 19);
		contentPane.add(txtpnPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username;
				char[] pass;
				username = textField.getText();
				pass = passwordField.getPassword();
				String password = new StringBuilder().append(pass).toString();
				c2.login(username, password);
			}
		});
		btnNewButton.setBackground(new Color(204, 204, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(btnNewButton.getFont().deriveFont(17f));
		btnNewButton.setBounds(191, 206, 85, 32);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(182, 151, 106, 20);
		contentPane.add(passwordField);
	}
}

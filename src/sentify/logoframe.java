package sentify;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class logoframe extends JFrame {

	private JPanel contentPane;


	
	public logoframe(Controller c) {
		Controller c1 = c;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lblSentify = new JLabel("Sentify");
		lblSentify.setForeground(new Color(0, 0, 153));
		lblSentify.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 55));
		lblSentify.setBackground(new Color(204, 204, 255));
		lblSentify.setBounds(124, 67, 197, 74);
		contentPane.add(lblSentify);
		
		JButton btnAccedi = new JButton("Accedi");
		btnAccedi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.logo();
			}
		});
		btnAccedi.setFont(new Font("Candara", Font.BOLD, 15));
		btnAccedi.setBackground(new Color(204, 204, 255));
		btnAccedi.setBounds(169, 176, 99, 20);
		contentPane.add(btnAccedi);
	}
}

package sentify;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class impostazioniartistaframe extends JFrame {

	private JPanel contentPane;
 

	
	public impostazioniartistaframe(Controller c) {
		Controller c4 = c;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JButton button = new JButton("< Indietro");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c4.indietroAllaHome();
			}
		});
		button.setBackground(new Color(204, 204, 255));
		button.setFont(new Font("Candara", Font.PLAIN, 13));
		button.setBounds(10, 10, 85, 21);
		contentPane.add(button);
		
		JTextPane txtpnAccount = new JTextPane();
		txtpnAccount.setEditable(false);
		txtpnAccount.setBackground(new Color(204, 204, 255));
		txtpnAccount.setFont(new Font("Candara", Font.PLAIN, 14));
		txtpnAccount.setText(">Account");
		txtpnAccount.setBounds(20, 39, 393, 19);
		contentPane.add(txtpnAccount);
		
		JTextPane txtpnAssistenza = new JTextPane();
		txtpnAssistenza.setEditable(false);
		txtpnAssistenza.setBackground(new Color(204, 204, 255));
		txtpnAssistenza.setFont(new Font("Candara", Font.PLAIN, 14));
		txtpnAssistenza.setText(">Assistenza");
		txtpnAssistenza.setBounds(20, 66, 393, 19);
		contentPane.add(txtpnAssistenza);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c4.logout();
			}
		});
		btnNewButton.setFont(new Font("Candara", Font.PLAIN, 13));
		btnNewButton.setBounds(10, 232, 85, 21);
		contentPane.add(btnNewButton);
		
		JTextPane txtpnSicurezza = new JTextPane();
		txtpnSicurezza.setBackground(new Color(204, 204, 255));
		txtpnSicurezza.setFont(new Font("Candara", Font.PLAIN, 14));
		txtpnSicurezza.setEditable(false);
		txtpnSicurezza.setText(">Sicurezza");
		txtpnSicurezza.setBounds(20, 92, 393, 19);
		contentPane.add(txtpnSicurezza);
		
		JTextPane txtpnPrivacy = new JTextPane();
		txtpnPrivacy.setBackground(new Color(204, 204, 255));
		txtpnPrivacy.setEditable(false);
		txtpnPrivacy.setFont(new Font("Candara", Font.PLAIN, 14));
		txtpnPrivacy.setText(">Privacy");
		txtpnPrivacy.setBounds(20, 117, 393, 19);
		contentPane.add(txtpnPrivacy);
		
		JTextPane txtpnImpostazioni = new JTextPane();
		txtpnImpostazioni.setBackground(new Color(204, 204, 255));
		txtpnImpostazioni.setFont(new Font("Candara", Font.PLAIN, 14));
		txtpnImpostazioni.setEditable(false);
		txtpnImpostazioni.setText(">Impostazioni");
		txtpnImpostazioni.setBounds(20, 142, 393, 19);
		contentPane.add(txtpnImpostazioni);
		
		JButton btnNewButton_1 = new JButton(">Retribuzione");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int follower = c4.getA().getNumFollowers();
				double paga = (0.50 * follower);
				String ret = Double.toString(paga);
				JOptionPane.showMessageDialog(null, "In base al numero di followers la sua retribuzione ammonta a: "+ret+"euro");
				
			}
		});
		btnNewButton_1.setFont(new Font("Candara", Font.PLAIN, 14));
		btnNewButton_1.setBackground(new Color(204, 204, 255));
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setBounds(20, 171, 393, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btngestisciBrani = new JButton(">Gestisci brani");
		btngestisciBrani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c4.GestisciBrani();
			}
		});
		btngestisciBrani.setHorizontalAlignment(SwingConstants.LEFT);
		btngestisciBrani.setFont(new Font("Candara", Font.PLAIN, 14));
		btngestisciBrani.setBackground(new Color(204, 204, 255));
		btngestisciBrani.setBounds(20, 201, 393, 21);
		contentPane.add(btngestisciBrani);
	}
}


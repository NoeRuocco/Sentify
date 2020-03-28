package sentify;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.ScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class homeprofiloartistaframe extends JFrame {

	private JPanel contentPane;
	private Artista B;

	
	public homeprofiloartistaframe(Controller c) {
		Controller c3 = c;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 338);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JButton btnImp = new JButton("Imp.");
		btnImp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c3.impostazioni(B);
			}
		});
		btnImp.setBounds(348, 9, 64, 21);
		contentPane.add(btnImp);
		
		JLabel lblNomeArtista = new JLabel("Nome");
		lblNomeArtista.setFont(new Font("Candara", Font.PLAIN, 16));
		lblNomeArtista.setBounds(34, 13, 121, 19);
		contentPane.add(lblNomeArtista);
		lblNomeArtista.setText(c3.getA().getNome());
		
		
		JLabel lblNumFollower = new JLabel("Num. follower");
		lblNumFollower.setFont(new Font("Candara", Font.PLAIN, 13));
		lblNumFollower.setBounds(34, 26, 121, 21);
		contentPane.add(lblNumFollower);
		String NumFollower = String.valueOf(c3.getA().getNumFollowers());
		lblNumFollower.setText(NumFollower);
		
		JLabel lblBiografia = new JLabel("Biografia");
		lblBiografia.setFont(new Font("Candara", Font.PLAIN, 16));
		lblBiografia.setBounds(34, 70, 112, 21);
		contentPane.add(lblBiografia);
		
		JLabel lblTestoBio = new JLabel("Testo bio. ");
		lblTestoBio.setFont(new Font("Candara", Font.PLAIN, 13));
		lblTestoBio.setBounds(34, 84, 349, 51);
		contentPane.add(lblTestoBio);
		lblTestoBio.setText(c3.getA().getBiografia());
		
		JLabel lblAlbum = new JLabel("Album");
		lblAlbum.setFont(new Font("Candara", Font.PLAIN, 16));
		lblAlbum.setBounds(34, 147, 84, 21);
		contentPane.add(lblAlbum);
		
		JLabel lblBrani = new JLabel("Brani");
		lblBrani.setFont(new Font("Candara", Font.PLAIN, 16));
		lblBrani.setBounds(33, 220, 46, 26);
		contentPane.add(lblBrani);
		
		JLabel lblBrano = new JLabel("Brano");
		lblBrano.setBounds(34, 167, 335, 41);
		
		String Album = c3.ShowAlbum();
		lblBrano.setText(Album);
		contentPane.add(lblBrano);
		
		JLabel lblBrano_1 = new JLabel("Brano");
		lblBrano_1.setBounds(34, 243, 349, 41);
		
		String Brani = c3.ShowBrani();
		lblBrano_1.setText(Brani);
		contentPane.add(lblBrano_1);
	}
}


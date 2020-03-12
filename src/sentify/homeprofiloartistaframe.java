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

	/**
	 * Create the frame.
	 */
	public homeprofiloartistaframe(Controller c, Artista A) {
		Controller c3 = c;
		Artista B = new Artista(A.getNome(), A.getBiografia(), A.getNumFollowers(), A.getCodAlb(), A.getCodBra());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 468);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnImp = new JButton("Imp.");
		btnImp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c3.impostazioni();
			}
		});
		btnImp.setBounds(362, 10, 64, 21);
		contentPane.add(btnImp);
		
		JLabel lblNomeArtista = new JLabel("Nome");
		lblNomeArtista.setFont(new Font("Candara", Font.PLAIN, 16));
		lblNomeArtista.setBounds(34, 13, 121, 19);
		contentPane.add(lblNomeArtista);
		lblNomeArtista.setName(B.getNome());
		
		JLabel lblNumFollower = new JLabel("Num. follower");
		lblNumFollower.setFont(new Font("Candara", Font.PLAIN, 13));
		lblNumFollower.setBounds(34, 26, 121, 21);
		contentPane.add(lblNumFollower);
		
		JLabel lblBiografia = new JLabel("Biografia");
		lblBiografia.setFont(new Font("Candara", Font.PLAIN, 16));
		lblBiografia.setBounds(34, 67, 112, 21);
		contentPane.add(lblBiografia);
		
		JLabel lblTestoBio = new JLabel("Testo bio. ");
		lblTestoBio.setFont(new Font("Candara", Font.PLAIN, 13));
		lblTestoBio.setBounds(34, 84, 79, 21);
		contentPane.add(lblTestoBio);
		
		JLabel lblAlbum = new JLabel("Album");
		lblAlbum.setFont(new Font("Candara", Font.PLAIN, 16));
		lblAlbum.setBounds(34, 171, 79, 21);
		contentPane.add(lblAlbum);
		
		JLabel lblBrani = new JLabel("Brani");
		lblBrani.setFont(new Font("Candara", Font.PLAIN, 16));
		lblBrani.setBounds(34, 264, 46, 26);
		contentPane.add(lblBrani);
	}
}

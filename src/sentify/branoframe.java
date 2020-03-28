package sentify;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class branoframe extends JFrame {
	
	private JPanel contentPane;
	private JTable table;
	private JTextField txtBoxCerca;
	private JButton btnNewButton;
	private JButton btnRimuoviBrano;
	private JTextField textFieldTitolo;
	private JTextField textFieldDurata;
	private JTextField textFieldGenere;


	public branoframe(Controller c) {
		Controller  c1 = c;		
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				DefaultTableModel model = (DefaultTableModel)getTable().getModel();
				model.setRowCount(0);
				c1.MostraBrani();
			}
		});
		setBackground(Color.GRAY);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 389);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		
		
		//Bottone per modificare un brano 
		JButton btnModificaBrano = new JButton("Modifica Brano");
		btnModificaBrano.setForeground(Color.WHITE);
		btnModificaBrano.setBackground(new Color(204, 204, 255));
		btnModificaBrano.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnModificaBrano.setEnabled(false);
		btnModificaBrano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int selectedRowIndex = table.getSelectedRow();
				c1.ModificaBrani(textFieldTitolo.getText(), textFieldDurata.getText(), textFieldGenere.getText());
				model.setRowCount(0);
				c1.MostraBrani();
				textFieldTitolo.setText("");
				textFieldDurata.setText("");
				textFieldGenere.setText("");
				JOptionPane.showMessageDialog(null, "Brano modificato!!","", JOptionPane.ERROR_MESSAGE);
			}
		});
		
		
		//Bottone per eliminare un brano
		JButton btnRimuoviBrano = new JButton("Rimuovi Brano");
		btnRimuoviBrano.setForeground(Color.WHITE);
		btnRimuoviBrano.setBackground(new Color(204, 204, 255));
		btnRimuoviBrano.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnRimuoviBrano.setEnabled(false);
		btnRimuoviBrano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int selectedRowIndex = table.getSelectedRow();
				c1.RimuoviBrani((String)(model.getValueAt(selectedRowIndex, 0) ));
				model.setRowCount(0);
				c1.MostraBrani();
				textFieldTitolo.setText("");
				textFieldDurata.setText("");
				textFieldGenere.setText("");
				btnRimuoviBrano.setEnabled(false);
				JOptionPane.showMessageDialog(null, "Brano eliminato");
			}
		});
		
		
		//Bottone per l'aggiunta di un nuovo brano
		JButton btnAggiungiBrano = new JButton("Aggiungi Brano");
		btnAggiungiBrano.setForeground(Color.WHITE);
		btnAggiungiBrano.setBackground(new Color(204, 204, 255));
		btnAggiungiBrano.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAggiungiBrano.setEnabled(false);
		btnAggiungiBrano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)getTable().getModel();
				c1.AggiungiBrano(textFieldTitolo.getText(), textFieldDurata.getText(), textFieldGenere.getText());
				model.setRowCount(0);
				c1.MostraBrani();
				JOptionPane.showMessageDialog(null, "Il brano è stato aggiunto!");
				textFieldTitolo.setText("");
				textFieldDurata.setText("");
				textFieldGenere.setText("");
			}
		});
		btnAggiungiBrano.setBounds(294, 303, 126, 43);
		contentPane.add(btnAggiungiBrano);
		btnRimuoviBrano.setBounds(156, 303, 126, 43);
		contentPane.add(btnRimuoviBrano);
		btnModificaBrano.setBounds(18, 303, 126, 43);
		contentPane.add(btnModificaBrano);
		
		
		//Tabella in cui sono mostrati i brani
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(193, 45, 389, 248);
		contentPane.add(scrollPane);
		
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int selectedRowIndex = table.getSelectedRow();
				
				textFieldTitolo.setText(model.getValueAt(selectedRowIndex, 0).toString());
				textFieldDurata.setText(model.getValueAt(selectedRowIndex, 1).toString());
				textFieldGenere.setText(model.getValueAt(selectedRowIndex, 2).toString());
				btnRimuoviBrano.setEnabled(true);
				btnAggiungiBrano.setEnabled(false);
			}
		});
		table.setName("ShowTableModel");
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Titolo","Durata","Genere",
			}
		)
		{public boolean isCellEditable(int row, int column) {return false;}});
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		//Barra di ricerca
		txtBoxCerca = new JTextField();
		txtBoxCerca.setToolTipText("");
		txtBoxCerca.setBounds(10, 8, 287, 27);
		contentPane.add(txtBoxCerca);
		txtBoxCerca.setColumns(10);
		
		//Bottone per la ricerca
		btnNewButton = new JButton("Cerca");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(204, 204, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					DefaultTableModel model = (DefaultTableModel)getTable().getModel();
					model.setRowCount(0);
					c1.MostraBranibyNomeb(txtBoxCerca.getText());
			}
		
		});
		btnNewButton.setBounds(404, 12, 82, 23);
		contentPane.add(btnNewButton);
		
		
		//Bottone per terminare il programma e tornare alla schermata delle impostazioni
		JButton btnTermina = new JButton("Fine");
		btnTermina.setForeground(Color.WHITE);
		btnTermina.setBackground(new Color(204, 204, 255));
		btnTermina.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnTermina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				c1.home();
			}
		});
		btnTermina.setBounds(430, 303, 129, 43);
		contentPane.add(btnTermina);
		
		
		//Bottone per aggiornare la tabella (refresh)
		JButton btnRefresh = new JButton("Indietro");
		btnRefresh.setForeground(Color.WHITE);
		btnRefresh.setBackground(new Color(204, 204, 255));
		btnRefresh.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)getTable().getModel();
				model.setRowCount(0);
				c1.MostraBrani();
			}
		});
		btnRefresh.setBounds(307, 12, 82, 23);
		contentPane.add(btnRefresh);
		
		
		
		JLabel lblNewLabel = new JLabel("Titolo");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(20, 45, 118, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblDurata = new JLabel("Durata");
		lblDurata.setForeground(Color.BLACK);
		lblDurata.setBounds(20, 99, 118, 14);
		contentPane.add(lblDurata);
		
		JLabel lblGenere = new JLabel("Genere");
		lblGenere.setForeground(Color.BLACK);
		lblGenere.setBounds(18, 153, 118, 14);
		contentPane.add(lblGenere);
		
		
		
		textFieldTitolo = new JTextField();
		textFieldTitolo.setBounds(86, 45, 96, 20);
		contentPane.add(textFieldTitolo);
		textFieldTitolo.setColumns(10);
		
		textFieldDurata = new JTextField();
		textFieldDurata.setColumns(10);
		textFieldDurata.setBounds(84, 96, 96, 20);
		contentPane.add(textFieldDurata);
			
		textFieldGenere = new JTextField();
		textFieldGenere.setColumns(10);
		textFieldGenere.setBounds(84, 153, 96, 20);
		contentPane.add(textFieldGenere);
		
		
		
			//DocumentListener per l'aggiornamento dei bottoni 
			DocumentListener docListener = new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				change();				
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				change();				
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				change();				
			}
			
			public void change() {
				if((textFieldTitolo.getText()).length()<3 || (textFieldDurata.getText()).length()<2) {
					btnModificaBrano.setEnabled(false);
					btnAggiungiBrano.setEnabled(false);
				}
				else {
					btnModificaBrano.setEnabled(true);
					btnAggiungiBrano.setEnabled(true);
				}
			}
		};
		
		textFieldTitolo.getDocument().addDocumentListener(docListener);
		textFieldDurata.getDocument().addDocumentListener(docListener);
		
		
		//Listener relativo alla tabella
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				table.clearSelection();
				textFieldTitolo.setText("");
				textFieldDurata.setText("");
				textFieldGenere.setText("");
				btnRimuoviBrano.setEnabled(false);
			}
		});
	}
	
	public void Errore() {
		JOptionPane.showMessageDialog(null, "Inserisci valori corretti","ERROR", JOptionPane.ERROR_MESSAGE);
	}
	public JTable getTable() {
		return table;
	}
}
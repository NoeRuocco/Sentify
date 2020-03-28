package sentify;

import java.sql.*;
import java.util.ArrayList;
import com.mysql.jdbc.Connection;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Controller {

	public static void main(String[] args) {
		Controller c = new Controller();
	}
	
	logoframe LOGO;
	loginframe LOG;
	ArtistaDAO ART;
	homeprofiloartistaframe HOME;
	impostazioniartistaframe IMP;
	AlbumDAO ADAO;
	BranoDAO BDAO;
	branoframe BF;
	Artista A = new Artista();
	
	public Controller() {
		Connection con = null;
	
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sentify?useSSL=false", "root", "root");
		
		
		} catch (SQLException | ClassNotFoundException e){e.printStackTrace();
		  }
		

		LOGO = new logoframe(this);
		LOG = new loginframe(this);
		ART = new ArtistaDAO(con);
		ADAO = new AlbumDAO(con);
		BDAO = new BranoDAO(con);
		BF = new branoframe(this);
		LOGO.setVisible(true);
		
		
	}
	
	//Pagina iniziale
	public void logo() {
		LOGO.setVisible(false);
		LOG.setVisible(true);
	}

	//Pagina del login
	public void login(String username, String password){
		A = ART.LoginDAO(username, password);
		if(A != null) {
			home();
		}	
		else {
			JOptionPane.showMessageDialog(null, "Non esiste questo artista");
		}
	}
	
	
	//Pagina home per l'artista
	public void home() {
		HOME = new homeprofiloartistaframe(this);
		LOG.setVisible(false);
		HOME.setVisible(true);
	}
	
	
	public String ShowAlbum() {
		ArrayList<String> NomiAlbum= ADAO.getAlbumByArtista(A.getNome());
		String solamenteiprimidue = NomiAlbum.get(0)+", "+
									NomiAlbum.get(1)+"... ";
		return solamenteiprimidue;
	}
	
	public String ShowBrani() {
		ArrayList<String> NomiBrani;
		NomiBrani= BDAO.getBraniByArtista(A.getNome());
		String solamenteiprimitre = NomiBrani.get(0)+", "+
									NomiBrani.get(1)+", "+
									NomiBrani.get(2)+"... ";
		return solamenteiprimitre;
	}

	
	//Pagina impostazioni per l'artista
	public void impostazioni(Artista A) {
		IMP = new impostazioniartistaframe(this);
		HOME.setVisible(false);
		IMP.setVisible(true);
	}
	
	//Pagina gestione dei brani
	public void GestisciBrani() {
		IMP.setVisible(false);
		BF.setVisible(true);
	}
	
	//Funzione del bottone di ritorno alla home artista dalla sua pagina impostazioni
	public void indietroAllaHome() {
		IMP.setVisible(false);
		HOME.setVisible(true);
	}
	
	//Funzione del bottone di ritorno alla schermata iniziale dalla pagina impostazioni artista
	public void logout() {
		IMP.setVisible(false);
		LOGO.setVisible(true);
	}
	
	public void MostraBrani() {
		ArrayList<Brano> ListaBrani =BDAO.ListaBranibynome(A.getNome());
		DefaultTableModel model = (DefaultTableModel)BF.getTable().getModel();
		Object[] row = new Object[3];
		for(int i=0; i<ListaBrani.size(); i++) {
			row[0]=ListaBrani.get(i).getTitolo();
			row[1]=ListaBrani.get(i).getDurata();
			row[2]=ListaBrani.get(i).getGenere();
			model.addRow(row);
		}	
	}
	
	
	public void MostraBranibyNome(String Nome) {
		ArrayList<Brano> ListaBrani = BDAO.ListaBranibynome(Nome);
		DefaultTableModel model = (DefaultTableModel)BF.getTable().getModel();
		Object[] row = new Object[6];
		for(int i=0; i<ListaBrani.size(); i++) {
			row[0]=ListaBrani.get(i).getTitolo();
			row[1]=ListaBrani.get(i).getDurata();
			row[2]=ListaBrani.get(i).getGenere();
			model.addRow(row);
		}	
	}
	
	public void MostraBranibyNomeb(String Nome) {
		ArrayList<Brano> ListaBrani = BDAO.ListaBranibynomeb(Nome);
		DefaultTableModel model = (DefaultTableModel)BF.getTable().getModel();
		Object[] row = new Object[6];
		for(int i=0; i<ListaBrani.size(); i++) {
			row[0]=ListaBrani.get(i).getTitolo();
			row[1]=ListaBrani.get(i).getDurata();
			row[2]=ListaBrani.get(i).getGenere();
			model.addRow(row);
		}	
	}
	
	//Gestione dei brani
	public void RimuoviBrani(String Titolo) {
		BDAO.RimuoviBrano(Titolo);
	}
	
	public void ModificaBrani(String titolo, String durata, String genere) {
		BDAO.ModificaBrano(titolo, durata, genere);
	}

	public void AggiungiBrano(String titolo, String durata, String genere) {
		BDAO.AggiungiBrano(titolo, durata, genere, A.getNome());
	}
	
	public Artista getA() {
		return A;
	}

	public void setA(Artista a) {
		A = a;
	}
	
	
}
	
 
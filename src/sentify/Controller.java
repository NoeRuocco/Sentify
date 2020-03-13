package sentify;

import java.sql.*;
import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;

public class Controller {

	public static void main(String[] args) {
		Controller c = new Controller();
	}
	
	logoframe LOGO;
	loginframe LOG;
	ArtistaDAO ART;
	homeprofiloartistaframe HOME;
	impostazioniartistaframe IMP;
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
			home(A);
		}	
		else {
			JOptionPane.showMessageDialog(null, "Non esiste questo artista");
		}
	}
	
	//Pagina home per l'artista
	public void home(Artista A) {
		HOME = new homeprofiloartistaframe(this, A);
		LOG.setVisible(false);
		HOME.setVisible(true);
	}
	
	//Pagina impostazioni per l'artista
	public void impostazioni(Artista A) {
		IMP = new impostazioniartistaframe(this, A);
		HOME.setVisible(false);
		IMP.setVisible(true);
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

	
	public Artista getA() {
		return A;
	}

	public void setA(Artista a) {
		A = a;
	}
	
	
}
	
 
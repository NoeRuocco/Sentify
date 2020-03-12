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
		IMP = new impostazioniartistaframe(this);
		LOGO.setVisible(true);
		
	}
	
	public void logo() {
		LOGO.setVisible(false);
		LOG.setVisible(true);
	}

	public void login(String username, String password){
		Artista A;
		A = ART.LoginDAO(username, password);
		if(A != null) {
			home(A);
		}	
		else {
			JOptionPane.showMessageDialog(null, "Non esiste questo artista");
		}
	}
	
	public void home(Artista A) {
		HOME = new homeprofiloartistaframe(this, A);
		LOG.setVisible(false);
		HOME.setVisible(true);
	}
	
	public void impostazioni() {
		HOME.setVisible(false);
		IMP.setVisible(true);
	}
	
	public void indietroAllaHome() {
		IMP.setVisible(false);
		HOME.setVisible(true);
	}
	
	
	public void logout() {
		IMP.setVisible(false);
		LOGO.setVisible(true);
	}
	
}
	
 
package sentify;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.mysql.jdbc.Connection;

public class BranoDAO extends Brano{
	private Connection con;
	
	public BranoDAO(Connection c) {
		con = c;
	}
	
	public ArrayList<String> getBraniByArtista(String Nome) {
	      
	      ResultSet result;
	      String A;
	      ArrayList<String> bra;
    
	      String query = "select * from brano where artista=?";
	      
	      try {
	        PreparedStatement pst = con.prepareStatement(query);
	        pst.setString(1,Nome);
	        result = pst.executeQuery();
	        bra = new ArrayList<String>();	
	          while(result.next()) {
	            A = result.getString(1);
	            bra.add(A);
	          }
	          return bra;
	        
	      } catch (SQLException e) {e.printStackTrace(); return null;}

	    }
	
	//Brani cercati per autore 
	public ArrayList<Brano> ListaBranibynome(String Nome) {
	      
	      ResultSet result;
	      Brano A;
	      ArrayList<Brano> bra= new ArrayList<Brano>();
  
	      String query = "select * from brano where artista= ?";
	      
	      try {
	        PreparedStatement pst = con.prepareStatement(query);
	        pst.setString(1,Nome);
	        result = pst.executeQuery();
	          while(result.next()) {
	            A= new Brano(result.getString("titolo"),result.getString("durata"), result.getString("genere"));
	            bra.add(A);
	          }
	          return bra;
	        
	      } catch (SQLException e) {e.printStackTrace(); return null;}

	    }
	
	//Brani cercati per titolo del brano
	public ArrayList<Brano> ListaBranibynomeb(String Nomeb) {
	      
	      ResultSet result;
	      Brano A;
	      ArrayList<Brano> bra= new ArrayList<Brano>();

	      String query = "select * from brano where titolo= ?";
	      
	      try {
	        PreparedStatement pst = con.prepareStatement(query);
	        pst.setString(1,Nomeb);
	        result = pst.executeQuery();
	          while(result.next()) {
	            A= new Brano(result.getString("titolo"),result.getString("durata"), result.getString("genere"));
	            bra.add(A);
	          }
	          return bra;
	        
	      } catch (SQLException e) {e.printStackTrace(); return null;}

	    }
	
	//Funzioni per la gestione dei brani 
	public void RimuoviBrano(String titolo) {
		String query = "delete from brano where titolo = ?";
		try {
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, titolo);
			pst.executeUpdate();
		}catch (SQLException e) {e.printStackTrace();}
	}
	
	
	public void ModificaBrano(String titolo, String durata, String genere) {
		String query = "UPDATE brano SET titolo=?, durata=?, genere=? where titolo =?";
		try {
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, titolo);
			pst.setString(2, durata);
			pst.setString(3, genere);
			pst.setString(4, titolo);
			pst.executeUpdate();
		}catch(SQLException e) {e.printStackTrace();}
	}
	
	
    public void AggiungiBrano(String titolo, String durata, String genere, String artista){
			String query = "INSERT INTO brano (titolo, durata, artista, genere) VALUES (?,?,?,?)";
			try {
				PreparedStatement pst = con.prepareStatement(query);
				pst.setString(1, titolo);
				pst.setString(2, durata);
				pst.setString(3, artista);
				pst.setString(4, genere);
				pst.executeUpdate();
			}catch(SQLException e) {e.printStackTrace();}
		}
	    
	
	
}

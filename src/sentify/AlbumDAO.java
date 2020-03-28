package sentify;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.mysql.jdbc.Connection;

public class AlbumDAO extends Album{
	private Connection con;
	
	public AlbumDAO(Connection c) {
		con = c;
	}
	
	
	
	public ArrayList<String> getAlbumByArtista(String Nome) {
	      
	      ResultSet result;
	      String A;
	      ArrayList<String> alb;
      
	      String query = "select * from album where artista=?";
	      
	      try {
	        PreparedStatement pst = con.prepareStatement(query);
	        pst.setString(1,Nome);
	        result = pst.executeQuery();
	        alb = new ArrayList<String>();	
	          while(result.next()) {
	            A = result.getString(1);
	            alb.add(A);
	          }
	          return alb;
	        
	      } catch (SQLException e) {e.printStackTrace(); return null;}

	    }
	    

}

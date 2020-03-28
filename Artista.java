package sentify;

public class Artista extends Utente{
		private String Username;
		private String Password;
		private String Nome;
		private String Biografia;
		private String Tipo;
		private String Album;
		private String Brano;
		private int NumFollowers;
		private int CodAlb;
		private int CodBra;
		
		public Artista(String user, String pass, String nom, String bio, String tip, String alb, String bra, int numFoll, 
						int codAlb, int codBra){
			setUsername(user);
			setPassword(pass);
			setNome(nom);
			setBiografia(bio);
			setTipo(tip);
			setAlbum(alb);
			setBrano(bra);
			setNumFollowers(numFoll);
			setCodAlb(codAlb);
			setCodBra(codBra);
		}
		
		public Artista(String nom, String bio, int numFoll, int codAlb, int codBra){
			setNome(nom);
			setBiografia(bio);
			setNumFollowers(numFoll);
			setCodAlb(codAlb);
			setCodBra(codBra);
		}

		public Artista(int numFoll){
			setNumFollowers(numFoll);
		}

		
		public Artista(){
		}

		public String getUsername() {
			return Username;
		}
		public void setUsername(String username) {
			Username = username;
		}

		
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		
		
		public String getNome() {
			return Nome;
		}
		public void setNome(String nom) {
			Nome = nom;
		}

		
		public String getBiografia() {
			return Biografia;
		}
		public void setBiografia(String bio) {
			Biografia = bio;
		}
		
		
		public String getTipo() {
			return Tipo;
		}
		public void setTipo(String tip) {
			Tipo = tip;
		}

		
		public String getAlbum() {
			return Album;
		}
		public void setAlbum(String alb) {
			Album = alb;
		}
		
		
		public String getBrano() {
			return Brano;
		}
		public void setBrano(String bra) {
			Brano = bra;
		}
		
		
		public int getNumFollowers() {
			return NumFollowers;
		}
		public void setNumFollowers(int numFoll) {
			NumFollowers = numFoll;
		}

		
		public int getCodAlb() {
			return CodAlb;
		}
		public void setCodAlb(int codAlb) {
			CodAlb = codAlb;
		}
		
		
		public int getCodBra() {
			return CodBra;
		}
		public void setCodBra(int codBra) {
			CodAlb = codBra;
		}
		
		//Retribuzione in base al numero di follower dell'artista
		public double retribuzione(int NumFollowers, double paga) {
			paga = (0.50 * NumFollowers);
			return paga;
		}
		
		
}


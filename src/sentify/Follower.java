package sentify;

public class Follower extends Utente {
	private String Username;
	private String Password;
	private String Nome;
	private String ArtistiSeguiti;
	private String BraniSalvati;
	private int CodBra;
	
	public Follower(String user, String pass, String nom, String artSeg, String braSal, int codBra) {
		super();
		setUsername(user);
		setPassword(pass);
		setNome(nom);
		setArtistiSeguiti(artSeg);
		setBraniSalvati(braSal);
		setCodBra(codBra);
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
	public String getArtistiSeguiti() {
		return ArtistiSeguiti;
	}
	public void setArtistiSeguiti(String artSeg) {
		ArtistiSeguiti = artSeg;
	}
	public String getBraniSalvati() {
		return BraniSalvati;
	}
	public void setBraniSalvati(String braSal) {
		BraniSalvati = braSal;
	}
	public int getCodBra() {
		return CodBra;
	}
	public void setCodBra(int codBra) {
		CodBra = codBra;
	}

	
}

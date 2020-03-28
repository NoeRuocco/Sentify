package sentify;

public class Brano {
	private String Titolo;
	private String Durata;
	private String Artista;
	private String Album;
	private String Genere;
	private int CodBra;
	private int CodAlb;
	
	public Brano(String tit, String dur, String art, String alb, String gen, int codBra, int codAlb){
		setTitolo(tit);
		setDurata(dur);
		setArtista(art);
		setAlbum(alb);
		setGenere(gen);
		setCodBra(codBra);
		setCodAlb(codAlb);
	}
	

	public Brano(String tit, String dur,String gen){
		setTitolo(tit);
		setDurata(dur);
		setGenere(gen);
	}
	
	public Brano() {
		
	}
	
	public String getTitolo() {
		return Titolo;
	}
	public void setTitolo(String tit) {
		Titolo = tit;
	}
	public String getDurata() {
		return Durata;
	}
	public void setDurata(String dur) {
		Durata = dur;
	}
	public String getArtista() {
		return Artista;
	}
	public void setArtista(String art) {
		Artista = art;
	}
	public String getAlbum() {
		return Album;
	}
	public void setAlbum(String alb) {
		Album = alb;
	}
	public String getGenere() {
		return Genere;
	}
	public void setGenere(String gen) {
		Genere = gen;
	}
	public int getCodBra() {
		return CodBra;
	}
	public void setCodBra(int codBra) {
		CodBra = codBra;
	}
	public int getCodAlb() {
		return CodAlb;
	}
	public void setCodAlb(int codAlb) {
		CodAlb = codAlb;
	}
	
	
}

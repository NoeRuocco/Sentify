package sentify;

public class Brano {
	public String Titolo;
	public String Durata;
	public String Artista;
	public String Album;
	public int CodBra;
	public int CodAlb;
	
	public Brano(String tit, String dur, String art, String alb, int codBra, int codAlb){
		setTitolo(tit);
		setDurata(dur);
		setArtista(art);
		setAlbum(alb);
		setCodBra(codBra);
		setCodAlb(codAlb);
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

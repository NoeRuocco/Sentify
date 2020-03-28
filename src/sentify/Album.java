package sentify;

public class Album {
		private String Titolo;
		private String Artista;
		private String NumCanzoni;
		private String Durata;
		private String Tipo;
		private String AnnoPubblicazione;
		private int CodAlb;
		private int CodBra;
		private String Genere;
		
		public Album(String tit, String art, String numCan, String dur, String tip, String annPubb, 
					 int codAlb, int codBra, String gen){
			setTitolo(tit);
			setArtista(art);
			setNumCanzoni(numCan);
			setDurata(dur);
			setTipo(tip);
			setAnnoPubblicazione(annPubb);
			setCodAlb(codAlb);
			setCodBra(codBra);
			setGenere(gen);
		}
		
		public Album() {
			
		}
		
		public String getTitolo() {
			return Titolo;
		}
		public void setTitolo(String tit) {
			Titolo = tit;
		}
		public String getArtista() {
			return Artista;
		}
		public void setArtista(String art) {
			Artista = art;
		}
		public String getNumCanzoni() {
			return NumCanzoni;
		}
		public void setNumCanzoni(String numCan) {
			NumCanzoni = numCan;
		}
		public String getDurata() {
			return Durata;
		}
		public void setDurata(String dur) {
			Durata = dur;
		}
		public String getTipo() {
			return Tipo;
		}
		public void setTipo(String tip) {
			Tipo = tip;
		}
		public String getAnnoPubblicazione() {
			return AnnoPubblicazione;
		}
		public void setAnnoPubblicazione(String annoPubb) {
			AnnoPubblicazione = annoPubb;
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
			CodBra = codBra;
		}
		public String getGenere() {
			return Genere;
		}
		public void setGenere(String gen) {
			Genere = gen;
		}
		
		
}
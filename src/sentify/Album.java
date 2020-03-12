package sentify;

public class Album {
		public String Titolo;
		public String Artista;
		public String NumCanzoni;
		public String Durata;
		public String Tipo;
		public String AnnoPubblicazione;
		public int CodAlb;
		public int CodBra;
		public String Genere;
		
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

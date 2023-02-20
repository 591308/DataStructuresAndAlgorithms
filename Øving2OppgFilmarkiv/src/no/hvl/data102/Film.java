package no.hvl.data102;

public class Film {

	int filmnr;
	String produsent; //filmskaper
	String tittel;
	int dato;
	Sjanger sjanger;
	String filmselskap;
	
	public Film() {
		
	}
	
	public Film(int filmnr, String produsent, String tittel, int dato, Sjanger sjanger, String filmselskap) {
		this.filmnr=filmnr;
		this.produsent=produsent;
		this.tittel=tittel;
		this.dato=dato;
		this.sjanger=sjanger;
		this.filmselskap=filmselskap;
	}
	
	
	
	
	public int getFilmnr() {
		return filmnr;
	}

	public void setFilmnr(int filmnr) {
		this.filmnr = filmnr;
	}

	public String getProdusent() {
		return produsent;
	}

	public void setProdusent(String produsent) {
		this.produsent = produsent;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public Sjanger getSjanger() {
		return sjanger;
	}

	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}

	public String getFilmselskap() {
		return filmselskap;
	}

	public void setFilmselskap(String filmselskap) {
		this.filmselskap = filmselskap;
	}

	
	
	@Override
	public String toString() {
		return "Film \n" + "[filmnr=" + filmnr + ", produsent=" + produsent + ", tittel=" + tittel + ", dato=" + dato
				+ ", sjanger=" + sjanger + ", filmselskap=" + filmselskap + "]";
	}

	@Override
	public int hashCode() {
		Integer temp = filmnr;
		return temp.hashCode();
	}
	
}

package no.hvl.data102;

import no.hvl.data102.klient.FilmArkivADT;

public class Filmarkiv implements FilmArkivADT{

	Film[] tab;
	int antall;
	
	public Filmarkiv(int lengde) {
		tab = new Film[lengde];
		antall = 0;
	}

	@Override
	public Film[] hentFilmTabell() {
		return trimTab(tab, antall);
	}
	
	/**
	 * create new filmarray and add elements from existing array untill
	 *  it has no more elements, aka we trim original array and then
	 *  returning it
	 * @param tab2
	 * @param n
	 * @return
	 */
	private Film[] trimTab(Film[] tab2, int n) {
		
		Film[] filmtab2 = new Film[n]; 
		int i = 0;
		while(i < n) {
			filmtab2[i] = tab2[i];
			i++;
		}
		return filmtab2;
	}

	@Override
	public Film finnFilm(int nr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		if(antall == tab.length) {
			utvidKapasitet();
		}
		tab[antall] = nyFilm;
		antall++;
	}

	/**
	 * extend array capacity
	 */
	private void utvidKapasitet() {
		Film[] hTab = new Film[antall +1];
		
		for(int i = 0; i< tab.length; i++) {
			hTab[i] = tab[i];
		}
		tab = hTab;
	}

	@Override
	public boolean slettFilm(int filmnr) {
		
		for(int i = 0; i < tab.length; i++) {
			
			if(tab[i].getFilmnr() == filmnr) {
				antall--;
				tab[i] = tab[antall];
				tab[antall] = null;
				trimTab(tab, antall);
				return true;
			}
		}
		return false;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		
		Film[] hTb = new Film[antall];
		int count = 0;
		
		for(int i = 0; i < tab.length; i++) {
			if(tab[i].getTittel().contains(delstreng)) {
				hTb[count] = tab[i];
				count++;
			}
		}
		
		return trimTab(hTb, count);
	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		Film[] hTb = new Film[antall];
		int count = 0;
		
		for(int i = 0; i < tab.length; i++) {
			if(tab[i].getProdusent().contains(delstreng)) {
				hTb[count] = tab[i];
				count++;
			}
		}
		
		return trimTab(hTb, count);
	}

	@Override
	public int antall(Sjanger sjanger) {
		int antallSjanger = 0;
		for(int i = 0; i < antall; i++) {
			if(tab[i].getSjanger() == sjanger) {
				antallSjanger++;
			}
		}
		return antallSjanger;
	}

	@Override
	public int antall() {
		return antall;
	}

	
}

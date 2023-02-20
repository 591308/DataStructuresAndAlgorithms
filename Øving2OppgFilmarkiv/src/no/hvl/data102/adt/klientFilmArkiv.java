package no.hvl.data102.adt;

import no.hvl.data102.Filmarkiv;
import no.hvl.data102.klient.FilmArkivADT;

public class klientFilmArkiv {

	public static void main(String[] args) {
		FilmArkivADT filma = new Filmarkiv(100); //Create new archive
		new Meny(filma).start(); //create and start a meny
	}
}

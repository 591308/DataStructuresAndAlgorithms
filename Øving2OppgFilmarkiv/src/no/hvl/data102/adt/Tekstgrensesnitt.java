package no.hvl.data102.adt;

import java.util.Scanner;

import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;
import no.hvl.data102.klient.FilmArkivADT;

public class Tekstgrensesnitt {

	/**
	 * read parameters of a movie from keyboard
	 * Use scanner!
	 * @return
	 */
	public Film lesFilm() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Skriv inn film nummer: \n");
		int filmnr = sc.nextInt();
		
		System.out.println("Skriv inn navn på produsent: \n");
		String produsent = sc.next();
		
		System.out.println("Skriv inn tittel: \n");
		String tittel = sc.next();
		
		System.out.println("Skriv inn lanseringsaar: \n");
		int lanseringsaar = sc.nextInt();
		
		System.out.println("Skriv inn sjanger: \n");
		Sjanger sjanger = Sjanger.finnSjanger(sc.next().toUpperCase());
		
		System.out.println("Skriv inn filmselskap: \n");
		String filmSelskap = sc.next();
		
		Film nyFilm = new Film(filmnr, produsent, tittel, lanseringsaar, sjanger, filmSelskap);
		
		return nyFilm;
	}
	
	/**
	 * show a movie with all parameters on the screen
	 * Also text with genre
	 * @param film
	 */
	public void visFilm(Film film) {
		
		System.out.println(film.toString());
	}
	
	/**
	 * Print out all movies that has substring as part of its title
	 * @param filma
	 * @param delstreng
	 */
	public void skrivUtFilmDelstrengITittel(FilmArkivADT filma, String delstreng) {
		
		for(Film nyFilm : filma.soekTittel(delstreng)) {
			visFilm(nyFilm);
		}
	}
	
	/**
	 * Print out all movies htat has substring as part of its producer name
	 * @param filma
	 * @param delstreng
	 */
	public void skrivUtFilmProdusent(FilmArkivADT filma, String delstreng) {
		
		for(Film nyFilm : filma.soekProdusent(delstreng)) {
			visFilm(nyFilm);
		}
	}
	
	/**
	 * Print out some basic statistics that contains number of movies total
	 * ANd how many of each genre
	 * @param filma
	 */
	public void skrivUtStatistikk(FilmArkivADT filma) {
		
		System.out.println("Antall filmer totalt: " + filma.antall());
		
		for(int i = 0; i < Sjanger.values().length; i++) {
			System.out.println("Antall Filmer med " + Sjanger.values()[i] + " sjanger: " +
					filma.antall(Sjanger.values()[i]) + "\n");
		}
	}
}

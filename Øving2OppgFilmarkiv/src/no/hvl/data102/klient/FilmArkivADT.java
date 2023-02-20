package no.hvl.data102.klient;

import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;

public interface FilmArkivADT {

	/**
	 * Get a movie given nr from archive
	 * @param nr number of movie 
	 * @return movie given the number. If number does not match return null
	 */
	Film finnFilm(int nr);
	
	/**
	 * Add new movie to film
	 * @param nyFilm
	 */
	void leggTilFilm(Film nyFilm);
	
	/**
	 * Remove a file with given nr
	 * @param filmnr of movie that is to be deleted
	 * @return true if movie is deleted, false otherwise
	 */
	boolean slettFilm(int filmnr);
	
	/**
	 * Search and get movie given substring of a title
	 * @param delstreng that must be present in title
	 * @return array of movies that consists of substring delstreng
	 */
	Film[] soekTittel(String delstreng);
	
	/**
	 * Search and find a movie given substring of movie producer
	 * @param delstreng
	 * @return
	 */
	Film[] soekProdusent(String delstreng);
	
	/**
	 * Find number of movies given the genre
	 * @param sjanger
	 * @return
	 */
	int antall(Sjanger sjanger);
	
	/**
	 * return number of movies in archive
	 * @return
	 */
	int antall();

	/**
	 * get array of all movies in archive
	 * @return
	 */
	Film[] hentFilmTabell();
	
}

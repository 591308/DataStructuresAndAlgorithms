package no.hvl.data102;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import no.hvl.data102.klient.FilmArkivADT;

/**
 * Create a Filmarkiv from tekstfile,
 * read tekstfile and create movies from it
 * @author vlads
 *
 */
public class Fil {

	final static String SKILLE = "#";
	
	//read from file
	public static void lesFraFil(FilmArkivADT filmarkiv, String filnavn) {
		
		try {
			
			
			FileReader minFil = new FileReader(filnavn);
			
			@SuppressWarnings("resource")
			BufferedReader in = new BufferedReader(minFil);
			
			String linje = in.readLine();
			
			int n = Integer.parseInt(linje); //tells us how many movies is in file
			
			String post = in.readLine();
			
			Filmarkiv filma = new Filmarkiv(n);
			
			for(int i = 0; i < n; i++) {
				
				String[] felt = post.split(SKILLE);
				
				int filmNr = Integer.parseInt(felt[0]);
				String produsent = felt[1];
				String tittel = felt[2];
				int lanseringsaar = Integer.parseInt(felt[3]);
				Sjanger sjanger1 = Sjanger.finnSjanger(felt[4]);
				String filmselskap = felt[5];
				
				Film a = new Film(filmNr, produsent, tittel, lanseringsaar, sjanger1, filmselskap);
				
				filma.leggTilFilm(a);
				post = in.readLine();
				
				System.out.println(a.toString());
			}
			
			
		} catch (IOException e) {
			System.out.println("Feil ved lesing av fil: " + e);
			System.exit(2);
		}
		
	}
	
	public static FilmArkivADT lesfraFil(String filnavn) {
		
		final String SKILLE = "#";

		try {
			FileReader minFil = new FileReader(filnavn);
			BufferedReader in = new BufferedReader(minFil);
			String linje = in.readLine();

			int n = Integer.parseInt(linje);

			String post = in.readLine();

			Filmarkiv filma = new Filmarkiv(n);

			for (int i = 0; i < n; i++) {
				String[] felt = post.split(SKILLE);

				int filmNr = Integer.parseInt(felt[0]);
				String produsent = felt[1];
				String tittel = felt[2];
				int lanserinsAar = Integer.parseInt(felt[3]);
				Sjanger sjanger1 = Sjanger.finnSjanger(felt[4]);
				String filmSelskap = felt[5];

				Film a = new Film(filmNr, produsent, tittel, lanserinsAar, sjanger1, filmSelskap);

				filma.leggTilFilm(a);

			}
			in.close();
			return filma;

		} catch (FileNotFoundException e) {
			System.out.println("Feil ved lesing av fil: " + e);
			System.exit(1);
		} catch (IOException e) {
			System.out.println("Feil ved utføring av spørring: " + e);
			e.printStackTrace();
		}
		return null;
	}
	
	//read to file
	
	public static void lesTilFil(FilmArkivADT filmarkiv, String filnavn) {
		
		int antall = filmarkiv.antall();
		
		
		try {
			PrintWriter utfil = new PrintWriter(filnavn);
			
			utfil.println(antall);
			
			for(int i = 0; i < antall; i++) {
				utfil.print(filmarkiv.hentFilmTabell()[i].getFilmnr());
				utfil.print(SKILLE);
				utfil.print(filmarkiv.hentFilmTabell()[i].getProdusent());
				utfil.print(SKILLE);
				utfil.print(filmarkiv.hentFilmTabell()[i].getTittel());
				utfil.print(SKILLE);
				utfil.print(filmarkiv.hentFilmTabell()[i].getDato());
				utfil.print(SKILLE);
				utfil.print(filmarkiv.hentFilmTabell()[i].getSjanger());
				utfil.print(SKILLE);
				utfil.print(filmarkiv.hentFilmTabell()[i].getFilmselskap());
				utfil.print("\n");
			}
			
			utfil.close();
			
		} catch (IOException e) {
			System.out.println("Feil ved skriving til fil: " + e);
			System.exit(3);
		}
		
		
	}
}

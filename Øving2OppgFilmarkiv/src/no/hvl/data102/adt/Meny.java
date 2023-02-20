package no.hvl.data102.adt;

import java.util.Scanner;

import no.hvl.data102.Fil;
import no.hvl.data102.klient.FilmArkivADT;

public class Meny {

	private Tekstgrensesnitt tekstgr;
	private FilmArkivADT filmarkiv;
	
	
	public Meny(FilmArkivADT filma) {
		tekstgr = new Tekstgrensesnitt();
		this.filmarkiv = filma;
	}

	public void start() {

		/**
		 * Print out tekst with meny options given from tasks
		 * add switch cases to execute these tasks
		 * Use library scanner
		 */
		
		System.out.println("Legge til ein film trykk:     1");
		System.out.println("Lese filmer fra fil:          2");
		System.out.println("Skriv ut statistikk:          3");
		System.out.println("Søk etter film med tittel:    4");
		System.out.println("Søk etter produsent:          5");
		System.out.println("For å avslutte tast:          6");
		
		
		Scanner in = new Scanner(System.in);
		int inn = in.nextInt();
		
		if(inn == 1) {
			
			filmarkiv.leggTilFilm(tekstgr.lesFilm());
			Fil.lesTilFil(filmarkiv, "Filmer.txt");
			
			start();
			
		} else if(inn == 2) {
			
			Fil.lesFraFil(filmarkiv, "Filmer.txt");
			
			start();
			
		} else if(inn == 3) {
			
			tekstgr.skrivUtStatistikk(filmarkiv);
			
			start();
			
		} else if(inn == 4) {
			
			System.out.println("Skriv tittell på film:");
			
			String tekst = in.next();
			
			tekstgr.skrivUtFilmDelstrengITittel(filmarkiv, tekst);
			
			start();
			
		} else if(inn == 5) {
			
			System.out.println("Skriv navn på produsent til en film:");
			
			String tekstp = in.next();
			
			tekstgr.skrivUtFilmProdusent(filmarkiv, tekstp);
			
			start();
			
		} else if(inn == 6) {
			
			in.close();
			System.out.println("Programmet er avsluttet");
		}
		
	}

}

package bagklient;

import adt.BagADT;
import kjedet.KjedetBag;

public class KlientKjedetBag {

	// Create an array of people
	static Person personer[] = {
			new Person("Berit", 4), 
			new Person("Alin", 3), 
			new Person("Marius", 5), 
			new Person("Kamil", 2), 
			new Person("Eirik", 1) };
	
	public static void main(String[] args) {
		
		//Create a collection bag using BagADT and Person as a type
		BagADT<Person> bag = new KjedetBag<>();
		//Add people to a bag
		for(int i = 0; i < personer.length; i++) {
			bag.leggTil(personer[i]);
		}
		
		((KjedetBag<Person>) bag).skriv();
		
		//Remove person in position i = 2 from colelction if exists
		Person resultat = null;
		Person person = personer[2];
		if(!bag.erTom()) {
			resultat = bag.fjern(person);
		}
		if(resultat != null) {
			System.out.println("\nPersonen " + person + " ble fjernet");
		} else {
			System.out.println("\nPersonen " + person + " er ikke i samlingen");
		}
		
		//Check if contains 
		Person prs = new Person("Kamil" , 2);
		boolean eks = bag.innehodler(prs);
		System.out.println("\nPersonen " + prs + " eksisterer i bag: " + eks);
	
		//empty bag
		bag.nullstill();
		if(bag.erTom()) {
			System.out.println("\nBagen er nullstilt");
		}else {
			System.out.println("\nNullstilling feiler");
		}
	}
	
}

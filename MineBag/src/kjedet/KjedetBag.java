package kjedet;

import exceptions.EmptyCollectionException;
import adt.BagADT;

public class KjedetBag<T> implements BagADT<T> {

	private int antall;
	private LinearNode<T> forste;
	
	public KjedetBag() {
		antall = 0;
		forste = null;
	}
	
	@Override
	public void leggTil(T el) {
		LinearNode<T> nyNode = new LinearNode<T>(el);
		nyNode.setNeste(forste);
		forste = nyNode;
		antall++;
	}

	@Override
	public T fjern(T el) {
		T resultat = null;
		if(erTom()) 
			throw new EmptyCollectionException("bag");
		LinearNode<T> node = finnNode(el);
		if(node != null) {
			resultat = node.getElement();
			node.setElement(forste.getElement());
			forste.setElement(resultat);
			forste = forste.getNeste();
			antall--;
		}
		return resultat;
	}

	private LinearNode<T> finnNode(T el){
		boolean funnet = false;
		LinearNode<T> node = null;
		LinearNode<T> aktuell = forste;
		
		for(int sok = 0; sok < antall && !funnet; sok++) {
			if(aktuell.getElement().equals(el)) {
				node = aktuell;
				funnet = true;
			} else {
				aktuell = aktuell.getNeste();
			}
		}
		return node;
		
	}
	@Override
	public int frequency(T el) {
			int count = 0;
			LinearNode<T> aktuell = forste;
			for(int sok = 0; sok < antall; sok++) {
				if(aktuell.getElement().equals(el)) {
					aktuell = aktuell.getNeste();
					count++;
				}
			}
		return count;
	}

	@Override
	public boolean innehodler(T el) {
		LinearNode<T> denne = forste;
		while(denne != null && !el.equals(denne.getElement())) {
			denne = denne.getNeste();
		}
		return (denne != null);
	}

	@Override
	public void nullstill() {
		while(!erTom()) {
			if(forste != null) {
				forste = forste.getNeste();
				antall--;
			}
		}
	}

	@Override
	public int antall() {

		return antall;
	}

	@Override
	public boolean erTom() {
		return antall == 0;
	}

	/*
	 * skriv kjedet liste til en tabell
	 */
	@Override
	public T[] tilTabell() {
		@SuppressWarnings("unchecked")
		T[] tabell = (T[]) new Object[antall];
		int i = 0;
		LinearNode<T> aktuell = forste;
		while(aktuell != null) {
			tabell[i] = aktuell.getElement();
			i++;
			aktuell = aktuell.getNeste();
		}
		return tabell;
	}
	
	public void skriv() {
		LinearNode<T> aktuell = forste;
		while(aktuell != null) {
			System.out.println(aktuell.getElement());
			aktuell = aktuell.getNeste();
		}
	}
	
	public void skrivBag() {
		T[] nyBag = tilTabell();
		for(T el : nyBag) {
			System.out.println(el);
		}
	}

}

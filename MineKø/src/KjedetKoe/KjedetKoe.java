package KjedetKoe;

import Exception.EmptyCollectionException;
import KoeADT.KoeADT;

public class KjedetKoe<T> implements KoeADT<T>{

	private LinearNode<T> foran, bak;
	
	public KjedetKoe(){
		foran = null;
		bak = null;
	}
	
	@Override
	public void innKoe(T element) {
		
		LinearNode<T> nyNode = new LinearNode<T>(element);
		
		if(erTom()) {
			foran = nyNode;
		} else {
			bak.setNeste(nyNode);
		}
		
		bak = nyNode;
	}

	@Override
	public T utKoe() {
		if(erTom()) 
			throw new EmptyCollectionException("koe");
		
		T element = foran.getElement();
		
		foran = foran.getNeste();
		
		if(foran == null) {
			bak = null;
		}
		
		return element;
	}

	@Override
	public T forste() {
		if(erTom())
			throw new EmptyCollectionException("koe");
		return foran.getElement();
	}

	@Override
	public boolean erTom() {
		// TODO Auto-generated method stub
		return ((foran != null) &&(bak != null));
	}
	
	public String toString() {
		String resultat = "";
		LinearNode<T> aktuell = foran;

		while (aktuell != null) {
			resultat = resultat + (aktuell.getElement()).toString() + "\n";
			aktuell = aktuell.getNeste();
		}

		return resultat;
		
	}

}

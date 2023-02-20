package SirkulaerTabellKoe;

import Exception.EmptyCollectionException;
import KoeADT.KoeADT;

public class SirkulaerTabellKoe<T> implements KoeADT<T>{
	
	private final static int STDK = 100;
	private T[] koe;
	private int foran, bak;
	//Trenger ikke antall, kun vite hvor er foran og bak
	
	public SirkulaerTabellKoe() {
		this(STDK);
	}

	@SuppressWarnings("unchecked")
	public SirkulaerTabellKoe(int startKapasitet) {
		koe = (T[]) new Object[startKapasitet +1];
		foran = 0;
		bak = startKapasitet;
	}

	@Override
	public void innKoe(T element) {
		if(foran == ((bak + 2)%koe.length))
			utvid();
		bak = (bak +1) % koe.length;
		koe[bak] = element;
	}

	private void utvid() {
		@SuppressWarnings("unchecked")
		T[] hjelpeTabell = (T[]) (new Object[koe.length*2]);
		int lengde = koe.length;
		for(int i = 0; i < lengde-1; i++) {
			hjelpeTabell[i] = koe[foran];
			foran = (foran+1)%koe.length;
		}
		foran = 0;
		bak = lengde -2;
		koe = hjelpeTabell;
	}

	@Override
	public T utKoe() {
		if(erTom())
			throw new EmptyCollectionException("koe");
		
		T resultat = koe[foran];
		koe[foran] = null;
		foran = (foran+1) % koe.length;
		
		return resultat;
	}

	@Override
	public T forste() {
		if(erTom())
			throw new EmptyCollectionException("koe");
		T resultat = koe[foran];
		return resultat;
	}

	@Override
	public boolean erTom() {
		return (foran == (bak+1) % koe.length);
	}
	
	
}

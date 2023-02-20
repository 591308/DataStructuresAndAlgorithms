package tabell;

import adt.StabelADT;
import exception.EmptyCollectionException;

public class TabellStabel<T> implements StabelADT<T> {

	private final static int STDK= 100;
	private T[] stabel;
	private int topp;
	
	public TabellStabel() {
		this(STDK);
	}
	
	
	@SuppressWarnings("unchecked")
	public TabellStabel(int startkapasitet) {
		topp = -1;
		stabel = (T[]) new Object[startkapasitet];
	}


	@Override
	public void push(T element) {
		if(topp == stabel.length) {
			utvid();
		}
		stabel[topp] = element;
		topp++;
		
	}

	private void utvid() {
		@SuppressWarnings("unchecked")
		T[] hjelpetabell = (T[]) new Object[stabel.length * 2];
		for(int i = 0; i < stabel.length; i++) {
			hjelpetabell[i] = stabel[i];
		}
		stabel = hjelpetabell;
		
	}


	@Override
	public T pop() {
		if(erTom())
			throw new EmptyCollectionException("stabel");
		
		T element = stabel[topp];
		stabel[topp] = null;
		topp--;
		return element;
	}

	@Override
	public T peek() {
		if(erTom())
			throw new EmptyCollectionException("Stabel");
		return stabel[topp];
	}

	@Override
	public boolean erTom() {
		// TODO Auto-generated method stub
		return topp < 0;
	}

}

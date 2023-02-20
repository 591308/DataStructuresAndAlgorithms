package kjedet;

import adt.StabelADT;
import exception.EmptyCollectionException;

public class KjedetStabel<T> implements StabelADT<T>{

	//initiate object variable needed, the top of the stack
	//is where all operations will take place
	private LinearNode<T> topp;

	//create a constructor
	public KjedetStabel() {
		topp = null;
		
	}
	@Override
	public void push(T element) {
		LinearNode<T> nyNode = new LinearNode<T>(element);
		nyNode.setNeste(topp);
		topp = nyNode;
	}

	@Override
	public T pop() {
		if(erTom()) 
			throw new EmptyCollectionException("stabel");
		T element = topp.getElement();
		topp = topp.getNeste();	
		return element;
	}

	@Override
	public T peek() {
		return topp.getElement();
	}

	@Override
	public boolean erTom() {
		return (topp == null);
	}
}

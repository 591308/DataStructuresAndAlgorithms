package kjedet;

public class LinearNode<T> {

	private LinearNode<T> neste;
	private T element;
	
	//Create an empty node
	public LinearNode() {
		neste = null;
		element = null;
	}
	
	//Create a node with an element
	public LinearNode(T element) {
		neste = null;
		this.element = element;
	}

	//get referene to the node this ndoe is refering to
	public LinearNode<T> getNeste() {
		return neste;
	}

	//set reference to node we set in parameter
	public void setNeste(LinearNode<T> neste) {
		this.neste = neste;
	}

	//get element from node
	public T getElement() {
		return element;
	}

	//set element inside the node
	public void setElement(T element) {
		this.element = element;
	}
	
}

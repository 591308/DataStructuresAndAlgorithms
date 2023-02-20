package KjedetKoe;

public class LinearNode<T> {

	public LinearNode<T> neste;
	public T element;
	
	public LinearNode() {
		neste = null;
		element = null;
	}
	
	public LinearNode(T elem) {
		neste = null;
		element = elem;
	}

	public LinearNode<T> getNeste() {
		return neste;
	}

	public void setNeste(LinearNode<T> neste) {
		this.neste = neste;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}
	
	
}

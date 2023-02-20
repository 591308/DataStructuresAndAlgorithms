package kjedet;

/**
 * Represent a node, where nodes refere to an element.
 * @author vlads
 *
 * @param <T> elementtype
 */
public class LinearNode<T> {

	private LinearNode<T> neste;
	private T element;
	
	/**
	 * Create an empty node
	 */
	public LinearNode() {
		neste = null;
		element = null;
	}
	/**
	 * Create a node with el as its element
	 * @param el
	 */
	public LinearNode(T elem) {
		neste = null;
		element = elem;
	}
	
	/**
	 * return next node of this node
	 * @return
	 */
	public LinearNode<T> getNeste() {
		return neste;
	}
	/**
	 * Set reference to next node as next for this node
	 * @param node
	 */
	public void setNeste(LinearNode<T> node) {
		neste = node;
	}
	
	/**
	 * return element to this node
	 * @return
	 */
	public T getElement() {
		return element;
	}
	
	/**
	 * set new element in this node
	 * @param elem
	 */
	public void setElement(T elem) {
		element = elem;
	}
}

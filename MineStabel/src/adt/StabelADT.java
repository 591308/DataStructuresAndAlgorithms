package adt;

/**
 * define a stack
 * @author vlads
 *
 * @param <T>
 */
public interface StabelADT<T> {
	/**
 	* Add element on top of a stack
 	* @param element
 	*/
	public void push(T element);
	/**
	 * Remove element from top of the stack
	 * @return
	 */
	public T pop();
	/**
	 * Peek at element on top of the stack
	 * @exception EmptyCollectionException if stack is empty
	 * @return
	 */
	public T peek();
	/**
	 * return true if stack doesnt have any elements false othervise
	 * @return
	 */
	public boolean erTom();
	
}

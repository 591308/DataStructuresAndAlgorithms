package adt;

/**
 * Her definere interface og pytter en generisk type
 * som parameter
 * @author vlads
 *
 * @param <T>
 */
public interface BagADT<T> {

	/**
	 * Add new object to a bag
	 * @param el is object to be added
	 */
	public void leggTil(T el);
	
	/**
	 * remove object if exists in a bag
	 * @param el is object to be removed
	 * @return el 
	 */
	public T fjern(T el);
	
	/**
	 * count how many times object is present in the bag
	 * @param el
	 * @return
	 */
	public int frequency(T el);
	/**
	 * Investigating if bag contains element
	 * @param el
	 * @return
	 */
	public boolean innehodler(T el);
	
	/**
	 * Remove all elements from the bag
	 */
	public void nullstill();
	
	/**
	 * gives quantity of object in bag
	 * @return quantity of elements in bag
	 */
	public int antall();
	
	/**
	 * Check whether the bag is empty
	 * @return true if empty and false if contains objects
	 */
	public boolean erTom();
	
	/**
	 * Gives an array of elements in a bag
	 * @return an array of elements in a bag
	 */
	public T[] tilTabell();
	
	/**
	 * @return 
	 * 
	 */
}

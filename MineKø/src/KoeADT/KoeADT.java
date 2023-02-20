package KoeADT;

public interface KoeADT<T> {

	/**
	 * Legge til et element bak i k�en
	 * @param element som blir satt inn i k�en
	 */
	void innKoe(T element);
	
	/**
	 * FJerne og returnerer element foran i k�en
	 * @return
	 * @exception EmptyCollectionException unntak kastes hvis k�en allerede er tom
	 */
	T utKoe();
	/**
	 * returnerer elementet foran i k�en uten � fjerne det fra k�en
	 * @return element foran k�en
	 * @exception Empty Collection Exception unntak kastes hvis k�en allerde er tom
	 */
	T forste();
	/**
	 * Returnerer sann hvis k�en ikke inneholder noen elementer
	 * @return sann dersom k�en er tom ellers usann
	 */
	boolean erTom();
	
	
}

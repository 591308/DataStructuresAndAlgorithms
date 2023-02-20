package KoeADT;

public interface KoeADT<T> {

	/**
	 * Legge til et element bak i køen
	 * @param element som blir satt inn i køen
	 */
	void innKoe(T element);
	
	/**
	 * FJerne og returnerer element foran i køen
	 * @return
	 * @exception EmptyCollectionException unntak kastes hvis køen allerede er tom
	 */
	T utKoe();
	/**
	 * returnerer elementet foran i køen uten å fjerne det fra køen
	 * @return element foran køen
	 * @exception Empty Collection Exception unntak kastes hvis køen allerde er tom
	 */
	T forste();
	/**
	 * Returnerer sann hvis køen ikke inneholder noen elementer
	 * @return sann dersom køen er tom ellers usann
	 */
	boolean erTom();
	
	
}

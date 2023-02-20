package exceptions;

public class EmptyCollectionException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmptyCollectionException(String collection) {
		super("Denne " + collection + " er tom.");
	}
}

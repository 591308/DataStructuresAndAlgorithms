package Exception;

@SuppressWarnings("serial")
public class EmptyCollectionException extends RuntimeException{
	
	public EmptyCollectionException(String samling) {
		super("" + samling + " er tom.");
	}

}


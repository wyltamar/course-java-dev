package exeeptions;

public class NoteProcessingException extends Exception {
	
	public NoteProcessingException(String error) {
		super("Error at studend processing notes "+error);
	}

}

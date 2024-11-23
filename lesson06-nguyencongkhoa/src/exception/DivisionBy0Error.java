package exception;

public class DivisionBy0Error extends Exception{

	private static final long serialVersionUID = 8465943383926578788L;

	public DivisionBy0Error() {
		this("Error: cannot divided by 0 !!");
	}
	
	public DivisionBy0Error(String message) {
		super(message);
	}
	
}

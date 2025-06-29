package calculation.exception;

public class CalculationException extends Exception {
	private static final long serialVersionUID = 3809846384039530296L;
	
	public CalculationException() {
		super("Exception while doing calculation");
	}
	
	public CalculationException(String message) {
		super(message);
	}
	
}

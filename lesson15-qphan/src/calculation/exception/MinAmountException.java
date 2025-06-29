package calculation.exception;

public class MinAmountException extends CalculationException {

	private static final long serialVersionUID = 7783207535246801545L;
	
	public MinAmountException() {
		super("Amount should greater than Min Amount");
	}
	
	public MinAmountException(String message) {
		super(message);
	}
		
}

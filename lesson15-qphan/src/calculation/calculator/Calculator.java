package calculation.calculator;

import calculation.exception.CalculationException;

public interface Calculator<R> {
	
	R calculate() throws CalculationException;
	
}

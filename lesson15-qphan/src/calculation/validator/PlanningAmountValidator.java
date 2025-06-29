package calculation.validator;

import calculation.exception.CalculationException;
import calculation.exception.MinAmountException;
import utils.LogUtils;

public class PlanningAmountValidator implements Validator {

	private Integer planningAmount;
	private Integer requiredMinPlanningAmount;
	
	public PlanningAmountValidator(Integer planningAmount, Integer requiredMinPlanningAmount) {
		this.planningAmount = planningAmount;
		this.requiredMinPlanningAmount = requiredMinPlanningAmount;
	}
	
	@Override
	public void validate() throws CalculationException {
		if (planningAmount < requiredMinPlanningAmount) {
			throw new MinAmountException();
		}
		
		LogUtils.log(">>> Planning Amount is greater than Min Planning Amount !!!");
	}
	
}

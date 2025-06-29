package view;

import calculation.calculator.ClAllocationCalculator;
import calculation.context.ClAllocationContext;
import calculation.exception.CalculationException;
import model.DataModel;

public class CLAllocationDemo {
	
	public static void main(String[] args) {
		System.out.println("=== Start calculation ===\n");
		
		ClAllocationContext context = ClAllocationContext.of()
				.withPlanningAmount(DataModel.planningAmount)
				.withRequiredPlanningAmount(DataModel.requiredMinPlanningAmount)
				.withMinPerStore(DataModel.minPerStore)
				.withRefItemStores(DataModel.mockRefItemStores())
				.withRefStores(DataModel.mockRefStores())
				.withRefItemWeights(DataModel.mockRefWeights())
				.withStoreIds(DataModel.mockItemStoreIds())
				.withStoreWhIds(DataModel.mockStoreWhIds())
				.withStoreTrendFactors(DataModel.mockStoreTrendFactors());
		
		
		try {
			ClAllocationCalculator calculator = new ClAllocationCalculator(context);
			calculator.calculate();
		} catch (CalculationException e) {
			e.printStackTrace();
		}
		System.out.println("\n=== Stop calculation ===");
	}
	
}

package calculation.calculator;

import bean.RefItemStoreId;
import bean.WhResultDto;
import calculation.context.ClAllocationContext;
import calculation.exception.CalculationException;
import calculation.processor.AllocateByShareProcessor;
import calculation.processor.ApplyMinProcessor;
import calculation.processor.FillingGapStorePotentialProcessor;
import calculation.processor.ShareInPercentProcessor;
import calculation.processor.StoreDemandProcessor;
import calculation.processor.WarehouseDemandProcessor;
import calculation.validator.PlanningAmountValidator;

import static utils.LogUtils.*;

import java.math.BigDecimal;
import java.util.Map;

public class ClAllocationCalculator implements Calculator<WhResultDto> {
	
	private ClAllocationContext context;
	
	public ClAllocationCalculator(ClAllocationContext context) {
		this.context = context;
	}

	@Override
	public WhResultDto calculate() throws CalculationException {
		WhResultDto whResultDto = new WhResultDto();
		
		Integer planningAmount = context.getPlanningAmount();
		Integer requiredPlanningAmount = context.getRequiredPlanningAmount();
		
		log("Step 1: Check For Planning Amount");
		PlanningAmountValidator planningAmountValidator = new PlanningAmountValidator(planningAmount, requiredPlanningAmount);
		planningAmountValidator.validate();
		
		log("\nStep 2: Filling gaps by references or average");
		Map<RefItemStoreId, BigDecimal> storePotentials = FillingGapStorePotentialProcessor.prepare()
				.withRefItemStores(context.getRefItemStores())
				.withRefStores(context.getRefStores())
				.process();
		logRefItemStoreParams(storePotentials, "StorePotential");
		
		log("\nStep 3: Calculate Store Demand of current Item");
		Map<Integer, BigDecimal> storeDemands = StoreDemandProcessor.prepare()
			.withStoreTrendFactors(context.getStoreTrendFactors())
			.withInterpolatedStorePotentials(storePotentials)
			.withStoreIds(context.getStoreIds())
			.withRefItemWeights(context.getRefItemWeights())
			.process();
		logStoreParams(storeDemands, "StoreDemand");
		
		log("\nStep 4: Sum up Demand to WH Level");
		Map<Integer, BigDecimal> warehouseDemands = WarehouseDemandProcessor.prepare()
				.withStoreDemands(storeDemands)
				.withStoreWhIds(context.getStoreWhIds())
				.process();
		logWhParams(warehouseDemands, "WhDemand");
		
		log("\nStep 5: Calculate Shares");
		Map<Integer, BigDecimal> shareInPercents = ShareInPercentProcessor.prepare()
				.withWhDemands(warehouseDemands)
				.process();
		logWhParams(shareInPercents, "Share(%)");
		
		log("\nStep 6: Allocate by Shares");
		Map<Integer, BigDecimal> whAllocatedAmounts = AllocateByShareProcessor.prepare()
				.withShareInPercents(shareInPercents)
				.withPlanningAmount(planningAmount)
				.process();
		logWhParams(whAllocatedAmounts, "WhAllocatedAmount(ByShare)");
		
		log("\nStep 7: Apply Mimimum Amount");
		whAllocatedAmounts = ApplyMinProcessor.prepare()
				.withMinPerStore(context.getMinPerStore())
				.withStoreWhIds(context.getStoreWhIds())
				.withWhAllocatedAmounts(whAllocatedAmounts)
				.process();
		logWhParams(whAllocatedAmounts, "ApplyMinimum");
		
		return whResultDto;
	}
	
	
	
}

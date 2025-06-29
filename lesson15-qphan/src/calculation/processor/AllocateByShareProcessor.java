package calculation.processor;

import static utils.NumberUtils.bd;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class AllocateByShareProcessor implements Processor<Map<Integer, BigDecimal>> {

	private Map<Integer, BigDecimal> shareInPercents;
	private Integer planningAmount;
	
	private AllocateByShareProcessor() {
	}
	
	public static AllocateByShareProcessor prepare() {
		return new AllocateByShareProcessor();
	}
	
	public AllocateByShareProcessor withShareInPercents(Map<Integer, BigDecimal> shareInPercents) {
		this.shareInPercents = shareInPercents;
		return this;
	}
	
	public AllocateByShareProcessor withPlanningAmount(Integer planningAmount) {
		this.planningAmount = planningAmount;
		return this;
	}
	
	@Override
	public Map<Integer, BigDecimal> process() {
		return shareInPercents.entrySet()
				.stream()
				.collect(Collectors.toMap(Entry::getKey, e -> {
					return e.getValue().divide(bd(100), MathContext.DECIMAL128).multiply(bd(planningAmount));
				}));
	}
	
}

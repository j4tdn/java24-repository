package calculation.processor;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class ShareInPercentProcessor implements Processor<Map<Integer, BigDecimal>> {

	private Map<Integer, BigDecimal> whDemands;
	
	private ShareInPercentProcessor() {
	}
	
	public static ShareInPercentProcessor prepare() {
		return new ShareInPercentProcessor();
	}
	
	public ShareInPercentProcessor withWhDemands(Map<Integer, BigDecimal> whDemands) {
		this.whDemands = whDemands;
		return this;
	}
	
	@Override
	public Map<Integer, BigDecimal> process() {
		final var totalOfDemands = whDemands.values()
				.stream()
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		return whDemands.entrySet()
				.stream()
				.collect(Collectors.toMap(Entry::getKey, e -> e.getValue().multiply(BigDecimal.valueOf(100)).divide(totalOfDemands, 2, RoundingMode.HALF_UP)));
	}
	
}

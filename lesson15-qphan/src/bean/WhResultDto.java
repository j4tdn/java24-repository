package bean;

import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class WhResultDto {
	
	private Map<Integer, BigDecimal> whDemands = new TreeMap<>();
	private Map<Integer, Integer> whAllocatedAmounts = new TreeMap<>();
	
	public WhResultDto() {
	}

	public WhResultDto(Map<Integer, BigDecimal> whDemands, Map<Integer, Integer> whAllocatedAmounts) {
		this.whDemands = whDemands;
		this.whAllocatedAmounts = whAllocatedAmounts;
	}

	public Map<Integer, BigDecimal> getWhDemands() {
		return whDemands;
	}

	public void setWhDemands(Map<Integer, BigDecimal> whDemands) {
		this.whDemands = whDemands;
	}

	public Map<Integer, Integer> getWhAllocatedAmounts() {
		return whAllocatedAmounts;
	}

	public void setWhAllocatedAmounts(Map<Integer, Integer> whAllocatedAmounts) {
		this.whAllocatedAmounts = whAllocatedAmounts;
	}

	@Override
	public String toString() {
		return "WhResultDto [whDemands=" + whDemands + ", whAllocatedAmounts=" + whAllocatedAmounts + "]";
	}
	
}

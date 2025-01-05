package builder;

import java.time.LocalDate;

public class Item {
	
	private int id;
	private String name;
	private Double salesPrice;
	private Double buyPrice;
	private Double tax;
	private int amount;
	private LocalDate startedDate;
	private LocalDate expiredDate;
	
	public static Builder builder() {
		return new Builder();
	}
	
	// Nested class
	public static class Builder {
		private int id;
		private String name;
		private Double salesPrice;
		private Double buyPrice;
		private Double tax;
		private int amount;
		private LocalDate startedDate;
		private LocalDate expiredDate;
		public AdvItem withId(int i) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}

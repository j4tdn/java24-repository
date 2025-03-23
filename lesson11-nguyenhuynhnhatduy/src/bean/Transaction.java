package bean;

import java.util.Objects;

public class Transaction {


	private Trader trader;
	private int year;
	private int value;

	public Transaction() {
	}

	public Transaction(Trader trader, int year, int value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	// equals, hashcode
	@Override
	public boolean equals(Object obj) {
		
		  if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Transaction that = (Transaction) obj;
	        return year == that.year &&
	               value == that.value &&
	               Objects.equals(trader, that.trader);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		  return Objects.hash(trader, year, value);
		  }

	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}

}

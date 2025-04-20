package bean;

import java.util.Objects;

public class Transaction {

	private Trader trader;
	private int year;
	private double value;

	public Transaction() {
	}

	public Transaction(Trader trader, int year, double value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader() {
		return trader;
	}

	public int getYear() {
		return year;
	}

	public double getValue() {
		return value;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getTrader());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Transaction that)) {
			return false;
		}

		return that.getTrader() == this.getTrader();
	}

	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}

}

package bean;

public abstract class Divisible {
	public int[] numbers;

	public Divisible(int[] numbers) {
		this.numbers = numbers;
	}

	public abstract int[] divisible();
	public abstract void print();

}

package bean;

public class Tuple {
	private int x;
	private int y;
	public Tuple(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	@Override
	public String toString() {
		return "Tuple [" + x + ", " + y + "]";
	}
	
	

}

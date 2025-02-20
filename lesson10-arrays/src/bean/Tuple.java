package bean;

// Đại diện cho 1 phần tử trong mảng 2 chiều
public class Tuple {
	
	private int x;
	private int y;
	private int z;
	private int k;
	
	public Tuple(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Tuple(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Tuple(int x, int y, int z, int k) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.k = k;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public int getK() {
		return k;
	}

	

	
	
	
	

}
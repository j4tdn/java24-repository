package bean;

// Dại dien cho 1 phần tử trong mảng 2 chiều
public class Tuple {

	private Integer x;
	private Integer y;
	private Integer z;
	private Integer k;

	public Tuple(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}

	public Tuple(Integer x, Integer y, Integer z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Tuple(Integer x, Integer y, Integer z, Integer k) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.k = k;
	}

	public Integer getX() {
		return x;
	}

	public Integer getY() {
		return y;
	}

	public Integer getZ() {
		return z;
	}

	public Integer getK() {
		return k;
	}

}

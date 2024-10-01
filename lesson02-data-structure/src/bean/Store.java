package bean;

public class Store {
	public char name;
	public int open;
	public int close;
	
	public Store() {
		
	}
	
	public Store(char name, int open, int close) {
		super();
		this.name = name;
		this.open = open;
		this.close = close;
	}


	@Override
	public String toString() {
		return "Store [name=" + name + ", open=" + open + ", close=" + close + "]";
	}
	
	
}

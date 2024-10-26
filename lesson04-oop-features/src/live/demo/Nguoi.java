package live.demo;

public abstract class Nguoi {
	private String name;
	private String date;
	private double heSoLuong;
    abstract void wage();
	public Nguoi() {
		super();
	}
	public Nguoi(String name, String date, double heSoLuong) {
		super();
		this.name = name;
		this.date = date;
		this.heSoLuong = heSoLuong;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	@Override
	public String toString() {
		return "Nguoi [name=" + name + ", date=" + date + ", heSoLuong=" + heSoLuong + "]";
	}
    
    
    
	
}

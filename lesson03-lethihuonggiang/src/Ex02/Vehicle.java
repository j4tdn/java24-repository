package Ex02;

public class Vehicle {
	
	private String tenChuXe;
	private String loaiXe;
	private long dungTich;
	private double gia;
	
	public Vehicle() {
	}

	public Vehicle(String tenChuXe, String loaiXe, long dungTich, double gia) {
		super();
		this.tenChuXe = tenChuXe;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.gia = gia;
	}

	public String getTenChuXe() {
		return tenChuXe;
	}

	public void setTenChuXe(String tenChuXe) {
		this.tenChuXe = tenChuXe;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public long getDungTich() {
		return dungTich;
	}

	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	@Override
	public String toString() {
		return "Vehicle [tenChuXe=" + tenChuXe + ", loaiXe=" + loaiXe + ", dungTich=" + dungTich + ", gia=" + gia + "]";
	}
	
	

}

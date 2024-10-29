package inheritance.iinterface;

public interface Shape extends Style {
	
	
	String color = "#fff";
	
	// 1 hàm trong interface mặc định có 2 từ khóa public abstract
	// hàm bên dưới chỉ có phần khai báo, không có phần thân hàm
	// --> hàm trừu tượng, abstract method
	void calcS();
	

}

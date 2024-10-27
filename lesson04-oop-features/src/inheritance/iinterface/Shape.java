package inheritance.iinterface;

public interface Shape extends Style{

	// khi tạo thuộc tính mặc định có thêm từ khóa là public static final
	// thuộc phạm vi của interface
	// ---> ít, hiếm khi tạo thuộc tính trong interface
	String color = "#fff";
	
	// 1 hàm trong interface mặc định có 2 từ khóa public, abstract
	// hàm bên dưới chỉ có phần khai báo, không có phần thân hàm
	// ----> hàm trừ tượng, abstract method
	void calcS();
	
}

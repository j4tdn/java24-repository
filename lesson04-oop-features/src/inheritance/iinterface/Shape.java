package inheritance.iinterface;

public interface Shape extends Style {
	
	// mặc định có thêm từ khóa là public static final
	// thuộc phạm vi của interface
	// --> ít, hiếm khi tạo thuộc tính trong interface
	String color = "#fff";
	
	// 1 hàm trong interface mặc định có 2 từ khóa 'public abstract'
	// hàm bên dưới chỉ có phần khai báo, ko có phần thân hàm
	// --> hàm true tượng, abstract method
	
	void calcS();
	
}
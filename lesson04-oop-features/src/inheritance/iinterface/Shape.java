package inheritance.iinterface;

public interface Shape extends Style {

	// Mặc đinh có thêm từ khóa là public static final
	// thuộc pvi của hàm interface
	// --> ít, hiếm khi tạo thuộc tính trong interface
	String color = "#fff";

	// 1 hàm trong interfae mặc định có 2 từ khóa public abstract
	// Hàm bên dưới chỉ có phần khai báo, ko có phần thân hàm
	// --> hàm trừu tượng, abstract method

	void calcS();
}
//16:59 / 2:01:09

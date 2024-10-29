package inheritance.iinterface;

public interface Shape extends Style {
	// 1 hàm trong interface mặc định có 2 từ khóa public abstract
	// hàm bên dưới chỉ có phần khai báo, ko có thân hàm
	// --> hàm trừ tượng, abstract method 
	void calcS();
}

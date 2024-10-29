package inheritance.iinterface;

// class đạng thực thi từ interface
// bắt buộc phải override lại các hàm trừu tượng tiwf interface
public class Rectangle implements Shape {
	@Override
	public void calcS() {
		System.out.println("Rectangle#calcS ... implementation");
	}
	@Override
	public void setBorder() {
		System.out.println("1px");
	}
}

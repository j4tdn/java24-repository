package inheritance.iinterface;

// Class đang thực thi từ interface
// bắt buộc phải override lại từ các hàm trừu tượng interface
public class Rectangle implements Shape{
	
	@Override
	public void calcS() {
		 System.out.println("Ractangle#calcS ... implementation");
	}
	@Override
	public void setBoder() {
		System.out.println("2px");
	}
}

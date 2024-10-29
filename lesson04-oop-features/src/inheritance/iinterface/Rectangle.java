package inheritance.iinterface;

// class đang thực thi từ interface
//bắt buộc phải override lại các hàm trừu tượng interfice

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

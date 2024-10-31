package inheritance.iinterface;

// class đang thực thi từ interface
// bắt buộc phải override lại từ các hàm trừu tượng từ interface
public class Rectangle implements Shape{
	
	@Override
	public void calcS() {
		System.out.println("Rectangle#calcS ... implementation");
		
	}
	
	 @Override
	public void setBorder() {
		// TODO Auto-generated method stub
		
	}

}

package inheritance.iinterface.afterjava8;

public class Child implements Father, Mother {
	// thừa kế được running, badminton
	// không cần, bắt buộc phải override vì hàm có body
	
	// khi class con implements từ các interface
	// ko bắt buộc phải override các hàm dèault có body
	
	// nhưng nếu các interface cha có chung phần khai báo hàm 
	// thì bắt buộc phải override 
	

	@Override
	public void cooking() {
		// Father.super.cooking();
		System.out.println("Don't know to cook ...");
	}
}

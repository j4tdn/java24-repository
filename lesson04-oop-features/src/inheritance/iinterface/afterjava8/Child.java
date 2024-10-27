package inheritance.iinterface.afterjava8;

public class Child implements Father, Mother {

	// thừa kế được running, badminton
	// không cần phải override  vì hàm có body
	
	// Khi mà class con implements từ các interface
	// Không bắt buộc phải override các hàm default có body
	
	// nhưng nếu các interface cha có chung phần khai báo hàm
	// bắt buộc override ở con
	
	@Override
	public void cooking() {
		// Father.super.cooking();
		// Mother.super.cooking();
		System.out.println("Don't know how to cook");
	}
	
}

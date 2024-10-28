package inheritance.iinterface.afterjava8;

public class Child implements Father, Mother {
	// thừa kế được running, badminton
	// không cần, bắt buộc phải override vì hàm có body

	// Khi class con implements từ các interface
	// ko bắt buộc phải override các hàm default có body

	// nhưng nếu các interface cha có chung phần khai báo hàm
	// thì bắt buộc ở con phải override
	@Override
	public void cooking() {
		// Mother.super.cooking();
		// Father.super.cooking();
		System.out.println("Dont know how to");
		// --> java ko hỗ trợ đa thừa kế, nhưng có requirement thì vẫn làm được
	}

}

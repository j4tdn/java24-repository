package inheritance.iinterface.afterjava8;

public class Child implements Father, Mother {

	// thừa kế đc running, badminton
	// ko cần, bắt buộc phải override vì hàm có body
	
	// Khi class con imp từ các interface
	// ko bắt buộc phải override các hàm default có body
	
	// nhưng nếu các interface cha có chung phần khai báo hàm
	// thì bắt buộc ở con phải override
	
	@Override
	public void cooking() {
		// TODO Auto-generated method stub
		System.out.println("Don't know how to cook ...");
	}
}

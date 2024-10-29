package inheritance.iinterface.afterjava8;

public class Child implements Father, Mother {
	// thừa kế được running, badminton
	// không cần, bắt buộc override

	// khi class con implements từ các interface
	// không bắt buộc phải override các hàm default có body

	// nhưng nếu các interface cha có chung phần khai báo hàm
	// thì bắt buộc con phải override

	
	@Override
	public void cooking() {
//		Mother.super.cooking();
//		Father.super.cooking();
		System.out.println("Dont Know how to cook");
		
	}
}

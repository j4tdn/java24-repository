package inheritance.iinterface.afterjava8;

public class Child implements Father, Mother{
	
	//thừa kế được running, badminton
	// không cần, bắt buộc phải override vì hàm có body
	
	//khi class con implements từ các interface
	// không bắt buộc phải override các hàm default có body
	
	// nhưng nếu các interface cha có chung phần khai báo hàm
	// thì phải override lại
	
	@Override
	public void cooking() {
		// TODO Auto-generated method stub
		Father.super.cooking();
		Mother.super.cooking();
		
		System.out.println("dont know cooking ...");
	}
}

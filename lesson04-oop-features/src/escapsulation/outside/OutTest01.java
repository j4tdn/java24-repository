package escapsulation.outside;

import escapsulation.inside.InTest01;

public class OutTest01 {

	public static void main(String[] args) {
		// Khác package chỉ dùng được public
		
		InTest01.a2 = 10;
		
		//	InTest01.a3 = 12;
		
		//	new InTest01().a4 = 14;

	}

}

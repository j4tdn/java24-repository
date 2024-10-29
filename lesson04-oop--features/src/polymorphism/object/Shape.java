package polymorphism.object;

class Shape {
	/*
	 *  Hàm trong class bắt buộc phải có body
	 *  
	 *  
	 *  1. Muốn hàm không có body trong KDL cha
	 * 		--> hàm trong class --> ko đc
	 *  2. Mong muốn khi con kế thừa từ cha bắt buộc phải override hàm từ cha
	 *  	--> KDL cha là class --> ko được
	 *  
	 *  --> KDL cha là interface
	 *  --> KDL con là class 
	 */
	
	void calcS() {
		
	}

}

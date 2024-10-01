package view;

public class Ex02Operator {
	public static void main(String[] args) {
		// toán tử = phép toán
		/*
		 = gán
		 += : + xong rồi gán
		 */
		
		String s = "123";
		s = s + 'z'; //s += 'z'
		System.out.println("s->" + s);
		
		int a1 = 5;
		/*
		 a1++  a1+=; a1=a1+1; sufix hậu tố
		 ++a1 ; prefix tiền tố
		 Trong 1 biểu thức dùng a1
		 a1++->BT  dùng giá trị của biến hiện tại cho BT sau đó sẽ +1 sau
		 ++a1a -> +1 vào a1, sử dụng giá trị mới của a1 cho BT
		 
		 */
		System.out.println("a1->" + ++a1);
//		System.out.println("a1->" + a1);
		
		//5 4 11
		int x = 2;
		int y = 4;
		int z = x++ + ++x - --y + y++ + ++x;
		System.out.printf("x(%s) y(%s) z (%s)" , x , y , z);
		// toán tử phủ định ! --> KDL bôlean
		//kiểm tra biểu thức có phải false không
		boolean isEven = (z % 2 == 0);
		System.out.println("íEven -->" + !isEven);
		
		
		
//		boolean.isValid = (x++ > 8|| y-- > 2);
		
				
	}

}
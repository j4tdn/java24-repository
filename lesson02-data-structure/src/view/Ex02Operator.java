package view;

public class Ex02Operator {

	public static void main(String[] args) {
		//Toán tử=phép toán
		
		//=gán
		//+= cộng xong rồi gán
		String s="123";
		s=s+ 'z';//s+='z';
		s='z'+s;
		System.out.println("s-->"+s);
		//Toán tử 1 ngôi
		int a1=5;
		//a1++; a1+1; suffic hậu tố
		//++a1; prefix tiền tố
		//trong 1 biểu thức sử dụng a1
		//a1++-->bt dùng giá trị của a1 hiện tại cho BT sau đó sẽ +1 sau
		//++a1-->+1 vào a1, sử dụng hgias trị mới của a1 cho biểu thức
		System.out.println("a1-->"+ ++a1);
		//System.out.println("a1-->"+ a1);
		
		//5 4 11
		int x=2;
		int y=4;
		int z= x++ + ++x + y++ + ++x;
		System.out.printf("x(%s) y(%s) z(%s)", x, y, z);
		//Toán tử phủ định ! -->KDL boolean
		//Phủ định TRUE FALSE
		//Kiểm tr 1 biểu thức có phải là FALSE không
		boolean isEven=(z%2 == 0);
		System.out.println("isEven-->"+ isEven);
		//Toán tử kết hợp && || --> toán tử luận lý
		// & | --> bitwise  luận 
		
		
		
	}
	
}

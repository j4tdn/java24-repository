package selfexercise;
/*
 	1. Khai báo biến toàn cục với g1 public g2 private g1 = 1_000_000 , g2 = 200_000 
 	2. In ra giá trị g1 g2 với cú pháp main g --->
 	3. Khai báo biến a1 = A
 	4. Khai báo biến cục bộ a11 = W và in ra a11
 	5. In ra a1
 	6. Tạo hàm mới tên test 01 với biến pA, pB . Trong hàm in ra giá trị g1,g2 với cú pháp test 01 g1 -->
 	Khai báo biến a2 = B . In ra a2,pA,pB
 	7. Tạo hàm mới tên test 02 . Khai báo biến a3 = C và trả về kết quả
 	8. Trong hàm main khai báo biến a3 = kết quả hàm test 02
 	9. Chạy hàm test 01 với biến a1, a3
 	
 */

public class variablescope {
		public static int g1 = 1_000_000;
		private static int g2 = 200_000;
		public static void main(String[] args) {
			System.out.println("main g1 --> " + g1);
			System.out.println("main g2 --> " + g2);
			char a1 = 'A';
			{
				char a11 = 'W';
				System.out.printf("a11(%s)\n", a11);
			}
			System.out.printf("a1(%s)\n", a1);
			char a3 = test02();
			test01(a1,a3);
			
		}
		
		public static void test01(char pA, char pB) {
			System.out.println("test 01 g1 = " + g1);
			System.out.println("test 01 g2 = " + g2);
			char a2 = 'B';
			System.out.printf("a2(%s)\n", a2);
			System.out.printf("pA(%s)\n", pA);
			System.out.printf("pB(%s)\n", pB);
		}
		public static char test02() {
			char a3 = 'C';
			return a3;
		}

}

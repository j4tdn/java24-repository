package exercises;

public class baitap5 {
	
	public static boolean kiemTraSoDoiXung(Integer n) {
		if(n<0) {
			return false;
		}
		int soBanDau = n; //12321
		int soDaoNguoc = 0; 
		while(n>0) { 
            int digit = n % 10;  
            soDaoNguoc = soDaoNguoc * 10 + digit; 
            n /= 10; 
        }
		return soBanDau == soDaoNguoc;
	}
		public static void main(String[] args) {
			
		Integer n = baitap1.nhapSoNguyen('N');
		boolean kt = kiemTraSoDoiXung(n);
		if(kt)
			System.out.println(kt);
		else
			System.out.println(kt);
	}
	}
	
	


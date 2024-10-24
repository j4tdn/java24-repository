package encapsulation.outside;

import encapsulation.inside.InTest01;

public class OutTest01 {
	public static void main(String[] args) {
		// khac package
				// --> protected , public 
				InTest01.a2 = 10;
				//KHAC PACKAGE CHỈ DÙNG ĐƯỢC PUBLIC
				//InTest01.a3 = 12;
				//new InTest01().a4 = 14;
	}
}

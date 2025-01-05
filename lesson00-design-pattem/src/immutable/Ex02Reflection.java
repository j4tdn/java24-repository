package immutable;

import java.lang.reflect.Field;

public class Ex02Reflection {
	
	public static void main(String[] args) {
		// generic type
		 Class<Warehouse> whClass = Warehouse.class;
		 
		 Warehouse wh1 = new Warehouse(2, "Hà Nội");
		 
		 try {
			Field adrField = whClass.getDeclaredField("address");
			adrField.setAccessible(true);
			System.out.println("adrField accessible: " + adrField.canAccess(wh1));
			System.out.println("wh1 address = " + adrField.getByte(wh1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

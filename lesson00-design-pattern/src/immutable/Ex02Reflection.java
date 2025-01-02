package immutable;

import java.lang.reflect.Field;

public class Ex02Reflection {
	public static void main(String[] args) {
		Class<WareHouse> whClass = WareHouse.class;
		WareHouse wh1 = new WareHouse(1, "Long an");
		
		try {
			Field adrField = whClass.getDeclaredField("address");
			
			adrField.setAccessible(true);
			
			System.out.println("adrField accessible: " + adrField.canAccess(wh1));
			
			System.out.println("wh1 address = " + adrField.get(wh1));
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}

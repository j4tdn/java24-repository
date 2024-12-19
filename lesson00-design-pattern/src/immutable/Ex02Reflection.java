package immutable;

import java.lang.reflect.Field;

public class Ex02Reflection {
	
	public static void main(String[] args) {
		Class<Warehouse> whClass = Warehouse.class;
		
		Warehouse wh1 = new Warehouse(1, "Long an");
		
		try {
			Field adrField = whClass.getDeclaredField("address");
			adrField.setAccessible(true);
			
			
			System.out.println(adrField.canAccess(wh1));
			System.out.println("wh1 address = " + adrField.get(wh1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

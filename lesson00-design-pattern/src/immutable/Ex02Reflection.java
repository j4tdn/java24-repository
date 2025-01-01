package immutable;

import java.lang.reflect.Field;

public class Ex02Reflection {

	public static void main(String[] args) {

		Class<Warehouse> whClass = Warehouse.class;

		Warehouse wh1 = new Warehouse(1, "Ben Tre");
		try {
			Field adrField = whClass.getDeclaredField("address");
			System.out.println("adrField accessible: " + adrField.canAccess(wh1));

			adrField.setAccessible(true);
			System.out.println("wh1 address: " + adrField.get(wh1));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

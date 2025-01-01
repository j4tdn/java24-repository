package immutable;

import java.lang.reflect.Field;

public class Ex02Reflection {
    public static void main(String[] args) {
        Class<WareHouse> whclass = WareHouse.class;
        WareHouse wh = new WareHouse(1, "Ben tre");
        try{
            Field adrField =  whclass.getDeclaredField("address");
            adrField.setAccessible(true);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}

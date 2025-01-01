package view.number;

import java.math.BigDecimal;

public class Ex02BigDecimalDemo {
    public static void main(String[] args) {

        BigDecimal bd1 = new BigDecimal("369369369.3456435654");
        BigDecimal bd2 = new BigDecimal(369369369.3456435654);
        BigDecimal bd3 = BigDecimal.valueOf(369369369.3456435654);

        System.out.println(bd1);
        System.out.println(bd2);
        System.out.println(bd3);

    }
}

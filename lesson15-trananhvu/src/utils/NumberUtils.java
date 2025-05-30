package utils;

import java.math.BigDecimal;
import java.util.Collection;

public class NumberUtils {

    private NumberUtils() {

    }

    public static BigDecimal bd(double val) {
        return new BigDecimal(String.valueOf(val));
    }

    public static BigDecimal sumOfBigDecimal(Collection<BigDecimal> collection) {
        return collection.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}
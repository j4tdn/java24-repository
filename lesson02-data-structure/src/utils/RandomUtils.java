package utils;
import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class RandomUtils {
	private static Random rd = new Random();
	public static double generatePoint() {
		double point = rd.nextDouble(0,11);
		if (point > 10)
		{
			point = 10;
		}
		System.out.println("\nĐiểm = " + point);
		
		double rounded = bd(point)// chuyển đổi double sang BigDecimal
				.setScale(1 , RoundingMode.HALF_UP)// làm tròn commercial 1 số 
				.doubleValue();// chuyển từ BigDecimal về lại double
		System.out.println("Điểm(Làm tròn) = " + rounded);
		return rounded;
	}
	private static BigDecimal bd(double value) {
		return new BigDecimal(String.valueOf(value));
		
	}

}
package util;

import java.util.Random;

public class Utilities {
	
	private static Random rd = new Random();
	
	public static int randomInt(int minInclusive, int maxExclusive) {
		return rd.nextInt(minInclusive, maxExclusive);
	}
	
}

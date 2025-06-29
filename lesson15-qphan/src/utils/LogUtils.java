package utils;

import java.math.BigDecimal;
import java.util.Map;

import bean.RefItemStoreId;

public class LogUtils {
	
	private LogUtils() {
	}
	
	public static void log(String message) {
		System.out.println(message);
	}
	
	public static void logRefItemStoreParams(Map<RefItemStoreId, BigDecimal> refItemStoreParams, String colName) {
		System.out.printf("%-15s %-15s %-15s\n", "RefItemId", "StoreId", colName);
		refItemStoreParams.forEach((refItemStoreId, param) -> {
			System.out.printf("%-15s %-15s %-15s\n", refItemStoreId.getRefItemId(), refItemStoreId.getStoreId(), param);
		});
	}
	
	public static void logStoreParams(Map<Integer, BigDecimal> storeParams, String colName) {
		System.out.printf("%-15s %-15s\n", "StoreId", colName);
		storeParams.forEach((storeId, storeParam) -> {
			System.out.printf("%-15s %-15s\n", storeId, storeParam);
		});
	}
	
	public static void logWhParams(Map<Integer, BigDecimal> whParams, String colName) {
		System.out.printf("%-15s %-15s\n", "WhId", colName);
		whParams.forEach((whId, whParam) -> {
			System.out.printf("%-15s %-15s\n", whId, whParam);
		});
	}
}

package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.CDDisk;
import bean.Dictionary;
import bean.Trader;
import bean.Transaction;

public class DataModel {
	private DataModel() {
		
	}
	public static List<Transaction> getTransactions() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> transactions = Arrays.asList(
			new Transaction(brian, 2011, 300),
			new Transaction(raoul, 2012, 1000), 
			new Transaction(raoul, 2011, 400),
			new Transaction(mario, 2012, 710), 
			new Transaction(mario, 2012, 700), 
			new Transaction(alan, 2012, 950)
		);
		return transactions;
	}

	public static List<CDDisk> getCDDisk() {
		List<CDDisk> cd = new ArrayList<>();
		cd.add(new CDDisk(101, "A", "Bruno", 12, 14d));
		cd.add(new CDDisk(102, "B", "Ariand Grande", 5, 8d));
		cd.add(new CDDisk(103, "A", "Justin Bieber", 20, 30d));
		cd.add(new CDDisk(105, "C", "Travis Scott", 4, 6d));
		cd.add(new CDDisk(106, "D", "Drake", 8, 10d));

		return cd;
		
	}
	public static Map<String, Dictionary> getDictionary(){
		Map<String, Dictionary> dic = new HashMap<>();
		dic.put("Apple", new Dictionary("quả táo", "danh từ", "trái cây"));
		dic.put("Bycle", new Dictionary("xe đạp", "danh từ", "phương tiện"));
		dic.put("Study", new Dictionary("học", "động từ", ""));
		dic.put("Walk", new Dictionary("đi bộ", "động từ", "hành động đi lại"));
		dic.put("Beautiful", new Dictionary("xinh đẹp", "tính từ", ""));
		dic.put("Friendly", new Dictionary("thân thiện", "tính từ", ""));
		
		return dic;
	}
	public static Map<String, Integer> getDailySpending(){
		Map<String , Integer> daily = new HashMap<>();
		
		daily.put("ăn hủ tiếu", 20000);
		daily.put("ăn gà rán", 42000);
		daily.put("mua màn hình", 2200000);
		daily.put("sửa xe", 550000);
		daily.put("đổ xăng", 30000);
		daily.put("in tài liệu", 10000);
		daily.put("bánh bao", 12000);
		return daily;
		
	}
}
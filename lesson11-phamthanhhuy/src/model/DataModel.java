package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import bean.CdDisk;
import bean.Trader;
import bean.Transaction;
import bean.Word;

public class DataModel {
	
	private DataModel() {
	}
	
	public static Map<String, Integer> getDailyExxpenses() {
	    Map<String, Integer> dailyExpenses = new LinkedHashMap<>();

	    dailyExpenses.put("Ăn hủ tiếu", 20000);
	    dailyExpenses.put("Uống cà phê", 15000);
	    dailyExpenses.put("Gửi xe", 5000);
	    dailyExpenses.put("Ăn trưa", 30000);
	    dailyExpenses.put("Mua nước suối", 10000);
	    dailyExpenses.put("Ăn vặt chiều", 25000);
	    dailyExpenses.put("Tiền xăng", 40000);

	    return dailyExpenses;
	}

	
	public static Map<String, Word> getDictionary() {
	    Map<String, Word> dictionary = new TreeMap<>();

	    dictionary.put("run", new Word("chạy", Word.WordType.Verb, "Động từ hành động"));
	    dictionary.put("beautiful", new Word("đẹp", Word.WordType.Adjective, "Tính từ mô tả"));
	    dictionary.put("quickly", new Word("nhanh", Word.WordType.Adverb, "Trạng từ"));
	    dictionary.put("under", new Word("dưới", Word.WordType.Preposition, "Giới từ vị trí"));
	    dictionary.put("and", new Word("và", Word.WordType.Conjunction, "Liên từ nối"));
	    dictionary.put("wow", new Word("thán từ", Word.WordType.Interjection, "Cảm thán"));
	    dictionary.put("he", new Word("anh ấy", Word.WordType.Pronoun, "Đại từ"));
	    dictionary.put("the", new Word("mạo từ xác định", Word.WordType.Determiner, "Mạo từ"));
	    dictionary.put("book", new Word("sách", Word.WordType.Noun, "Danh từ"));

	    return dictionary;
	}
	public static List<CdDisk> getDataCdDisk() {
		List<CdDisk> cddisks = new ArrayList<>(Arrays.asList(
			    new CdDisk(101, "Pop", "Taylor Swift", 5, 12.5),
			    new CdDisk(102, "Rock", "Linkin Park", 3, 15.0),
			    new CdDisk(103, "Jazz", "Norah Jones", 7, 10.0),
			    new CdDisk(104, "Classical", "Mozart", 4, 20.0)
			));

		return cddisks;
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
	
}
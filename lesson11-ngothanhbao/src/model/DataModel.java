package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import bean.Card;
import bean.Disk;
import bean.Trader;
import bean.Transaction;
import bean.Vocabulary;

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
	
	public static Set<Disk> getCDInf() {
		Set<Disk> disks = new HashSet<>();
		disks.add(new Disk(2, "Pop", "Son Tung", 15, 220d));
		disks.add(new Disk(3, "Rap", "Den", 15, 330d));
		disks.add(new Disk(4, "Nhac Tru Tinh", "Trinh Cong Son", 15, 225d));
		
		return disks;
	}
	
	public static List<Card> getCard() {
		List<Card> cards = new ArrayList<>();
		String[] types = {"Cơ", "Rô", "Chuồn", "Bích"};
		String[] cardNames = {"2", "3", "4", "5", "6", "7", "8",
				"9", "10", "J", "Q", "K", "A"};
		
		for(String type : types) {
			for(String cardName : cardNames) {
				cards.add(new Card(type, cardName));
			}
		}
		return cards;
	}
	
	public static Map<String, Vocabulary> getDictionary() {
		Map<String, Vocabulary> dictionary = new HashMap<>();
		dictionary.put("Tu vung 1", new Vocabulary("play", "Vui chơi", "V", "Một động từ"));
		dictionary.put("Tu vung 2", new Vocabulary("beautiful", "Đẹp đẽ", "Adj", "Một tính từ"));
		dictionary.put("Tu Vung 3", new Vocabulary("dog", "con chó", "N", "Một danh từ"));
		
		return dictionary;
	}
	
	public static Map<String, Double> getCost() {
		Map<String, Double> dailyCost = new HashMap<>();
		dailyCost.put("Ăn uống", 600d);
		dailyCost.put("Đi lại", 300d);
		dailyCost.put("Chơi", 400d);
		return dailyCost;
	}
	
}
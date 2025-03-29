package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import bean.Disk;
import bean.Trader;
import bean.Transaction;
import common.TypeOfCard;

import static common.TypeOfCard.*;


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
				new Transaction(alan, 2012, 950));
		return transactions;
	}
	
	public static Set<Disk> getDisks() {
		Set<Disk> disks = new HashSet<>();
		
		disks.add(new Disk(101, "Pop", "Single A", 10, 15.99));
		disks.add(new Disk(102, "Rock", "Single B", 12, 19.99));
		disks.add(new Disk(103, "Jazz", "Single C", 8, 12.49));
		disks.add(new Disk(104, "Classical", "Single D", 15, 22.50));
		disks.add(new Disk(105, "Pop", "Single E", 10, 17.00));
		
		return disks;
	}
	
	public static List<String> mockValueCard() {
		return Arrays.asList("2","3","4","5","6","7","8","9","10","J","Q","K","A");
	}
	
	public static List<TypeOfCard> mockTypeCard() {
		List<TypeOfCard> typeOfCard = new ArrayList<>();
		typeOfCard.add(heart);
		typeOfCard.add(diamonds);
		typeOfCard.add(clubs);
		typeOfCard.add(spades);
		return typeOfCard;
	}
	
	public static Map<String, Integer> getExpenses() {
		return Map.of(
				 "An sang", 100,
			     "An trua", 200,
			     "An toi", 300,
			     "Do xang", 400,
			     "Cat toc", 500,
			     "Gui xe", 600,
			     "In tai lieu", 700,
			     "Bida", 800,
			     "Ca phe ", 900
				);
	}
	
}

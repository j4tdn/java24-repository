package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bean.Transaction;
import model.DataModel;

public class Ex01 {
	public static void main(String[] args) {
		var transactions = DataModel.getTransactions();
//		1. Find all transactions in the year 2011 and sort them by value (small to high).
		var method1 = method1(transactions);
		generate("1. danh sach cac giao dich nam 2011: ", method1);
		
//		2. Find all transactions have value greater than 300 and sort them by trader’s city

		var method2 = method2(transactions);
		generate("2. danh sach cac giao dich lon hon 300: ", method2);
		
//		3. What are all the unique cities where the traders work?
		
//		4. Find all traders from Cambridge and sort them by name desc.
		
		var method4 = method4(transactions);
		generate("4. danh sach cac nha giao dich Cambridge: ", method4);
		
//		5. Return a string of all traders’ names sorted alphabetically.
		var method5 = method5(transactions);
		generate("5. danh sach cac nha giao dich: ", method5);
		
//		6. Are any traders based in Milan?
		var method6 = method6(transactions);
		generate("6. danh sach cac nha giao dich Milan: ", method6);
		
//		7. Count the number of traders in Milan.
		System.out.println("7. so luong nha giao dich Milan: " + numberTradersInMilan(transactions));
//		8. Print all transactions’ values from the traders living in Cambridge.
		var method8 = method8(transactions);
		generate("8. danh sach cac nha giao dich Milan: ", method8);
		
		
//		9. What’s the highest value of all the transactions?

//		10. Find the transaction with the smallest value.

	}
	
	private static void generate(String prefix, Collection<Transaction> collection) {
		System.out.println(prefix);
		collection.forEach(t -> {
			System.out.println("  - " + t);
		});
	}

	private static  List<Transaction> method1(List<Transaction> transactions) {
		List<Transaction> result = new ArrayList<>();
		transactions.forEach(s -> {
			if(s.getYear() == 2011) {
				result.add(s);
			}
		});
		result.sort((t1, t2) -> {
			return t1.getValue() - t2.getValue();
		});
		return result;
	}
	
	private static  List<Transaction> method2(List<Transaction> transactions) {
		List<Transaction> result = new ArrayList<>();
		transactions.forEach(s -> {
			if(s.getValue() > 300) {
				result.add(s);
			}
		});
		result.sort((t1, t2) -> {
			return t1.getTrader().getCity().compareTo(t2.getTrader().getCity());
		});
		return result;
	}
	
	private static  Set<Transaction> method4(List<Transaction> transactions) {
		Set<Transaction> result = new HashSet<Transaction>();
		transactions.forEach(s -> {
			if(s.getTrader().getCity() == "Cambridge") {
				result.add(s);
			}
		});
		return result;
	}
	
	private static  List<Transaction> method5(List<Transaction> transactions) {
		List<Transaction> result = new ArrayList<>(transactions);
		
		result.sort((t1, t2) -> {
			return t1.getTrader().getName().compareTo(t2.getTrader().getName());
		});
		
		return result;
	}
	
	private static  List<Transaction> method6(List<Transaction> transactions) {
		List<Transaction> result = new ArrayList<>();
		transactions.forEach(s -> {
			if(s.getTrader().getCity() == "Milan") {
				result.add(s);
			}
		});
		result.sort((t1, t2) -> {
			return t2.getTrader().getName().compareTo(t1.getTrader().getName());
		});
		return result;
	}
	
	private static int numberTradersInMilan(List<Transaction> transactions) {
		Set<Transaction> TradersInMilan = new HashSet<Transaction>();
		transactions.forEach(s -> {
			if(s.getTrader().getCity() == "Milan") {
				TradersInMilan.add(s);
			}
		});
		return TradersInMilan.size();
	}
	
	private static  List<Transaction> method8(List<Transaction> transactions) {
		List<Transaction> result = new ArrayList<>();
		transactions.forEach(s -> {
			if(s.getTrader().getCity() == "Cambridge") {
				result.add(s);
			}
		});
		return result;
	}
}

package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import bean.MinMax;
import bean.Trader;
import bean.Transaction;
import functional.Compare;
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
		var method3 = method3(transactions);
		generate("3. danh sach cac thanh pho: ", method3);
		
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
		System.out.println("Gia tri giao dich cao nhat la: " + findValue(transactions, MinMax.MAX, (a, b) -> {
			return a < b;
		}));
//		10. Find the transaction with the smallest value.
		System.out.println("Gia tri giao dich thap nhat la: " + findValue(transactions, MinMax.MIN, (a, b) -> {
			return a > b;
		}));
	}
	
	private static int findValue(List<Transaction> transactions, MinMax e, Compare cp) {
		int result = 0;
		if(e == MinMax.MAX) 
			result = Integer.MIN_VALUE;
		if(e == MinMax.MIN)
			result = Integer.MAX_VALUE;
		
		for (Transaction s:transactions) {
			if (cp.compare(result, s.getValue())) {
				result = s.getValue();
			}
		};
		return result;
	}
	


	private static <T> void generate(String prefix, Collection<T> collection) {
		System.out.println(prefix);
		collection.forEach(t -> {
			System.out.println("  - " + t);
		});
	}

	private static List<Transaction> method1(List<Transaction> transactions) {
		List<Transaction> result = new ArrayList<>();
		transactions.forEach(s -> {
			if (s.getYear() == 2011) {
				result.add(s);
			}
		});
		result.sort((t1, t2) -> {
			return t1.getValue() - t2.getValue();
		});
		return result;
	}
	
	private static Set<String> method3(List<Transaction> transactions) {
		Set<String> result = new HashSet<>();
		transactions.forEach(s -> {
				result.add(s.getTrader().getCity());
		});
		return result;
	}

	private static List<Transaction> method2(List<Transaction> transactions) {
		List<Transaction> result = new ArrayList<>();
		transactions.forEach(s -> {
			if (s.getValue() > 300) {
				result.add(s);
			}
		});
		result.sort((t1, t2) -> {
			return t1.getTrader().getCity().compareTo(t2.getTrader().getCity());
		});
		return result;
	}

	private static Set<Trader> method4(List<Transaction> transactions) {
		Set<Trader> result = new HashSet<>();
		transactions.forEach(s -> {
			if (s.getTrader().getCity() == "Cambridge") {
				result.add(s.getTrader());
			}
		});
		return result;
	}

	private static List<Trader> method5(List<Transaction> transactions) {
		Set<Trader> set = new HashSet<>();

		transactions.forEach(s -> {
			set.add(s.getTrader());
		});
		
		List<Trader> result = new ArrayList<Trader>(set);
		result.sort((a, b) -> a.getName().compareTo(b.getName()));
		return result;
	}

	private static Set<Trader> method6(List<Transaction> transactions) {
		Set<Trader> result = new HashSet<>();
		transactions.forEach(s -> {
			if (s.getTrader().getCity() == "Milan") {
				result.add(s.getTrader());
			}
		});
		return result;
	}

	private static int numberTradersInMilan(List<Transaction> transactions) {
		Set<Transaction> TradersInMilan = new HashSet<Transaction>();
		transactions.forEach(s -> {
			if (s.getTrader().getCity() == "Milan") {
				TradersInMilan.add(s);
			}
		});
		return TradersInMilan.size();
	}

	private static List<Transaction> method8(List<Transaction> transactions) {
		List<Transaction> result = new ArrayList<>();
		transactions.forEach(s -> {
			if (s.getTrader().getCity() == "Cambridge") {
				result.add(s);
			}
		});
		return result;
	}
}

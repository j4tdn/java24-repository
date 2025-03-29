package view;

import static utils.CollectionUtils.generate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import bean.Trader;
import bean.Transaction;
import functional.MinMax;
import functional.MinMaxOperation;
import model.DataModel;

public class Ex01TransactionDemo {

	public static void main(String[] args) {
		
		var transaction = DataModel.getTransactions();
		generate("Danh sách data", transaction);
		
		//1. Find all transactions in the year 2011 and sort them by value (small to high).
		
		findYear(transaction,2011, (a,b)-> {
			return Integer.compare(a.getValue(), b.getValue());
		});
		
		//2. Find all transactions have value greater than 300 and sort them by trader’s city
		findValue(transaction, 300, (a,b)-> {
			return a.getTrader().getCity().compareTo(b.getTrader().getCity());
		});
		
		//3. What are all the unique cities where the traders work?
		findUniqueCity(transaction);
		
		
		//4. Find all traders from Cambridge and sort them by name desc.
		findCamBrideTrader(transaction, "Cambridge", (a,b)-> {
			return b.getTrader().getName().compareTo(a.getTrader().getName());
		});
		
		
		//5. Return a string of all traders’ names sorted alphabetically.
		findTraderName(transaction);
		
		//6. Are any traders based in Milan?
		Set<Trader> set = findTraderBasedInMilan(transaction);
		if (set.size()> 0) {
			System.out.println(true);
		} else System.out.println(false);
		System.out.println();
		
		//7. Count the number of traders in Milan.
		System.out.println("So luong trader Milan: "+ set.size() + "\n");
		
		//8. Print all transactions’ values from the traders living in Cambridge.
		findAllTransactionValue(transaction);
		
		//9. What’s the highest value of all the transactions?
		System.out.println("highest value of all the transactions: "+ findMinMaxValue(transaction,MinMax.MAX ,(a,b )-> {
			if (a > b ) {
				b = a;
			}
			return b;
		})+ "\n");
		//10. Find the transaction with the smallest value.
		System.out.println("smallest value of all the transactions: "+findMinMaxValue(transaction,MinMax.MIN ,(a,b)-> {
			if (a < b) {
				b = a;
			}
			return b;
		})+ " \n");
	}
	
	private static void findYear(List<Transaction> list, int year, Comparator<Transaction> compartor) {
		List<Transaction> result = new ArrayList<>();
		for (Transaction e : list ) {
			if (e.getYear() == 2011) {
			result.add(e);
		}
		list.sort(compartor);
	}
		generate("Danh sách transaction 2011 ", result);
	
}
	private static int findMinMaxValue(List<Transaction> list,MinMax e ,MinMaxOperation ope) {
		int result = Integer.MAX_VALUE;
		if (e == MinMax.MAX) {
			result = Integer.MIN_VALUE;
		}
		for (Transaction s :list) {
		 result = ope.process(s.getValue(), result);
		}
		return result;	
	}
	
	private static void findAllTransactionValue(List<Transaction> list) {
		List<Integer> result = new ArrayList<>();
		for (Transaction e : list ) {
			if(e.getTrader().getCity() == "Cambridge") {
				result.add(e.getValue());
		}
		}
		generate("Danh sách transaction value ", result);
		
	}
	private static void findValue(List<Transaction> list, int value, Comparator<Transaction> compartor) {
		List<Transaction> result = new ArrayList<>();
		for (Transaction e : list ) {
			if (e.getValue() > 300) {
				result.add(e);
			}
			list.sort(compartor);
		}
		generate("Danh sách transaction value > 300 ", result);
		
	}
	private static void findCamBrideTrader(List<Transaction> list, String name, Comparator<Transaction> comparator) {
		List<Transaction> result = new ArrayList<>();
		for (Transaction e : list ) {
			if (e.getTrader().getCity() == name) {
				result.add(e);
			}
			list.sort(comparator);
		}
		generate("Danh sách Trader from Cambridge ", result);
		
	}
	private static void findUniqueCity(List<Transaction> list) {
		List<String> e = new ArrayList<>();
		list.forEach(s -> {
			e.add(s.getTrader().getCity());
		});
		Set<String> city = new HashSet<>(e);
		
		
		generate("Danh sach unique city", city);
		
		
}
	private static void findTraderName(List<Transaction> list) {
		Set<String> set = new TreeSet<>();
		list.forEach(s -> {
			set.add(s.getTrader().getName());
		});
		generate("Danh sách Trader Name", set);
	}
	private static Set<Trader> findTraderBasedInMilan(List<Transaction> list) {
		Set<Trader> set = new HashSet<>();
		for (Transaction e : list) {
			if (e.getTrader().getCity()== "Milan") {
				set.add(e.getTrader());
			}
		}
		return set;
	}
	}
	
	

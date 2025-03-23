package view;

import static utils.CollectionUtils.generate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class Ex01TransactionDemo {
	
	public static void main(String[] args) {
		
		var transactions = DataModel.getTransactions();
		var traders = DataModel.getTraders();
		
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		generate("Find all transactions in the year 2011 and sort them by value (small to high): ", SortingTransaction11(transactions));
		
		
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		generate("2. Find all transactions have value greater than 300 and sort them by trader’s city: ", SortingTransaction300(transactions));
		
		// 3. What are all the unique cities where the traders work?
		generate("3. What are all the unique cities where the traders work? ", uniqueCities(traders));
		
		// 4. Find all traders from Cambridge and sort them by name desc.
		
		// 5. Return a string of all traders’ names sorted alphabetically.
		
		// 6. Are any traders based in Milan?
		
		// 7. Count the number of traders in Milan.
		
		// 8. Print all transactions’ values from the traders living in Cambridge.
		
		// 9. What’s the highest value of all the transactions?
		
		// 10. Find the transaction with the smallest value.
	}
	
	private static List<Transaction> SortingTransaction11(List<Transaction> transactions) {
		List<Transaction> transaction11 = new ArrayList<>();
		for(Transaction transaction:transactions) {
			if(transaction.getYear() == 2011) {
				transaction11.add(transaction);
			}
		}
		Collections.sort(transaction11, (a,b) -> {
			return Integer.compare(a.getValue(), b.getValue());
		});
		
		return transaction11;
	}
	
	private static List<Transaction> SortingTransaction300(List<Transaction> transactions) {
		List<Transaction> transaction300 = new ArrayList<>();
		for(Transaction transaction:transactions) {
			if(transaction.getValue() >= 300) {
				transaction300.add(transaction);
			}
		}
		Collections.sort(transaction300, (a,b) -> {
			return a.getTrader().getCity().compareTo(b.getTrader().getCity());
		});
		
		return transaction300;
	}
	
	private static List<String> uniqueCities(List<Trader> traders) {
		
		Set<String> uniqueCities = new HashSet<>();
		
		for (Trader trader : traders) {
            uniqueCities.add(trader.getCity());
        }
		
		List<String> cities = new ArrayList<String>(uniqueCities);
		
		return cities;
	}
	
}















package view;

import static utils.CollectionUtils.generate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Predicate;

import bean.Trader;
import bean.Transaction;
import common.funcComp;
import model.DataModel;

public class Ex01TransactionDemo {
	
	static final List<Transaction>  transactions = DataModel.getTransactions();
	
	public static void main(String[] args) {
		
		var traders = DataModel.getTraders();
		
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		generate("1. Find all transactions in the year 2011 and sort them by value (small to high): ", 
				filterAndSort(t -> t.getYear() == 2011, (t1,t2) -> t1.getValue() - t2.getValue() ));

		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		
		// 3. What are all the unique cities where the traders work?
		
		generate(
			    "3. What are all the unique cities where the traders work?",
			    mapping(t -> t.getTrader().getCity())
			);
		
		generate(
			    "3. What are all the unique years when the traders work",
			    mapping(t -> t.getYear())
			);
		
		// 4. Find all traders from Cambridge and sort them by name desc.
		var tradersByCity = new TreeSet<Trader>((t1,t2) -> t1.getName().compareTo(t2.getName()));
		transactions.forEach(t -> 
		{
			if(t.getTrader().getCity().equals("Cambridge")) {
				tradersByCity.add(t.getTrader());
			}
		});
		generate("4. Find all traders from Cambridge and sort them by name desc.", tradersByCity);
		// 5. Return a string of all traders’ names sorted alphabetically.
		var traderNames = new TreeSet<Trader>((t1,t2) -> t1.getName().compareTo(t2.getName()));
		generate("5. Return a string of all traders’ names sorted alphabetically.", traderNames);
		// 6. Are any traders based in Milan?
		
		// 7. Count the number of traders in Milan.
		
		// 8. Print all transactions’ values from the traders living in Cambridge.
		
		// 9. What’s the highest value of all the transactions?
		
		// 10. Find the transaction with the smallest value.
	}
	
	private static List<Transaction> filterAndSort(Predicate<Transaction> predicate, Comparator<Transaction> comparator) {
		var target = new ArrayList<Transaction>();
		transactions.forEach(transaction -> {
			if(predicate.test(transaction)) {
				target.add(transaction);
			}
		});
		return target;
	}
	
	private static <R> Set<R> mapping(Function<Transaction, R>func) {
		var target = new HashSet<R>();
		transactions.forEach(t -> target.add(func.apply(t)));
		return target;
	}
	
}















package view;

import java.util.ArrayList;
import java.util.Collection;
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
import model.DataModel;

public class Ex01TransactionDemo {
	
	private static final List<Transaction> transactions = DataModel.getTransactions();
	
	public static void main(String[] args) {
		generate(
			"0. Prototype model data", 
			transactions
		);
		
		generate(
			"1. Find all transactions in the year 2011 and sort them by value (small to high)", 
			filterAndSort(t -> t.getYear() == 2011, (t1, t2) -> t1.getValue() - t2.getValue())
		);
		
		generate(
			"2. Find all transactions have value greater than 300 and sort them by trader’s city", 
			filterAndSort(t -> t.getValue() > 300, (t1, t2) -> t1.getTraderCity().compareTo(t2.getTraderCity()))
		);
		
		generate(
			"3. What are all the unique cities where the traders work", 
			mapping(t -> t.getTraderCity())
		);
		
		generate(
			"3. What are all the unique years when the traders work", 
			mapping(t -> t.getYear())
		);
		
		var tradersByCity = new TreeSet<Trader>((t1, t2) -> t1.getName().compareTo(t2.getName()));
		transactions.forEach(t -> {
			if ("Cambridge".equals(t.getTraderCity())) {
				tradersByCity.add(t.getTrader());
			}
		});
		generate(
			"4. Find all traders from Cambridge and sort them by name desc", 
			tradersByCity
		);
		
		var traderNames = new TreeSet<String>();
		transactions.forEach(t -> {
			traderNames.add(t.getTraderName());
		});
		System.out.println("5. Return a string of all traders’ names sorted alphabetically: " + String.join(", ", traderNames));
		
		// 6. Are any traders based in Milan?
		var hasTraderBasedInCity = false;
		for (var t: transactions) {
			if ("Milan".equals(t.getTraderCity())) {
				hasTraderBasedInCity = true;
				break;
			}
		};
		System.out.println("6. Are any traders based in Milan --> " + hasTraderBasedInCity);
		
		// 7. Count the number of traders in Milan.
		
		// 8. Print all transactions’ values from the traders living in Cambridge.
		
		// 9. What’s the highest value of all the transactions?
		
		// 10. Find the transaction with the smallest value.
	}
	
	private static <R> Set<R> mapping(Function<Transaction, R> func) {
		var target = new HashSet<R>();
		transactions.forEach(t -> target.add(func.apply(t)));
		return target;
	}
	
	private static List<Transaction> filterAndSort(Predicate<Transaction> predicate, Comparator<Transaction> comparator) {
		var target = new ArrayList<Transaction>();
		transactions.forEach(transaction -> {
			if (predicate.test(transaction)) {
				target.add(transaction);
			}
		});
		target.sort(comparator);
		return target;
	}
	
	private static <E> void generate(String prefix, Collection<E> elements) {
		System.out.println(prefix + " --> {");
		elements.forEach(element -> System.out.println("    + " + element));
		System.out.println("}\n");
	}
	
}

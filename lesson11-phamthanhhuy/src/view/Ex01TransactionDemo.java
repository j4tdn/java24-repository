package view;

import static utils.CollectionUtils.generate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Predicate;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class Ex01TransactionDemo {

	private final static List<Transaction> transactions = DataModel.getTransactions();

	public static void main(String[] args) {
		

		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		generate("1. Find all transactions in the year 2011 and sort them by value (small to high)", 
				sortingTransaction(t -> t.getYear() == 2011, (t1, t2) -> 
					Integer.compare(t1.getValue(), t2.getValue())
				));

		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		generate("2. Find all transactions have value greater than 300 and sort them by trader’s city",
				sortingTransaction(t-> t.getValue() > 300, (t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity())));
		
		// 3. What are all the unique cities where the traders work?
		generate("3. What are all the unique cities where the traders work?",
				mapping(f -> f.getTrader().getCity()));
		
		// 4. Find all traders from Cambridge and sort them by name desc.
		generate("4. Find all traders from Cambridge and sort them by name desc.", 
				sortingTransaction(t -> t.getTrader().getCity() == "Cambridge", (t1,t2) -> t1.getTrader().getName().compareTo(t2.getTrader().getName())));

		// 5. Return a string of all traders’ names sorted alphabetically.
		generate("5. Return a string of all traders’ names sorted alphabetically.", 
				mapping(t -> t.getTrader().getName()));

		// 6. Are any traders based in Milan?
		var hasBeentradersCities = false;
		
		for(var t: transactions) {
			if("Milan".equals(t.getTrader().getCity())) {
				hasBeentradersCities = true;
				break;
			};
		}
		System.out.println("6. Are any traders based in Milan? -> " + hasBeentradersCities);
		// 7. Count the number of traders in Milan.
		var numberMilanTraders = new HashSet<Trader>();
		
		for(var t:transactions) {
			if("Milan".equals(t.getTrader().getCity())) {
				numberMilanTraders.add(t.getTrader());
			}
		}
		
		System.out.println("7. Count the number of traders in Milan." + numberMilanTraders.size());

		// 8. Print all transactions’ values from the traders living in Cambridge.
		generate("8. Print all transactions’ values from the traders living in Cambridge.",
				sortingTransaction(t -> t.getTrader().getCity() == "Cambridge", (t1,t2) -> t1.getValue() - t2.getValue()));

		// 9. What’s the highest value of all the transactions?
		
		System.out.println("9. What’s the highest value of all the transactions\n" +
		sortingTransaction(t -> true, (t1,t2) -> t2.getValue() - t1.getValue()).get(0));

		// 10. Find the transaction with the smallest value.
		
		System.out.println("10. Find the transaction with the smallest value.\n" +
				sortingTransaction(t -> true, (t1,t2) -> t1.getValue() - t2.getValue()).get(0));
	}
	private static <R> Set<R> mapping(Function<Transaction, R> function) {
		var target = new TreeSet<R>();
		
		transactions.forEach(transaction -> {
			target.add(function.apply(transaction));
		});
		
		
		return target;
	}
	

	private static List<Transaction> sortingTransaction(Predicate<Transaction> predicate, Comparator<Transaction> comparator) {
		var target = new ArrayList<Transaction>();
		
		transactions.forEach(transaction -> {
			if(predicate.test(transaction)) {
				target.add(transaction);
			}
		});
		
		target.sort(comparator);
		
		return target;
	}

}

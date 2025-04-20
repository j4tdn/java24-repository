package view;

import static utils.CollectionUtils.generate;

import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class StreamExcersises {
	
	public static void main(String[] args) {
		
		List<Transaction> transactions = DataModel.getTransactions();
		
		generate("Data: ", transactions);
		
		generate("Find all transactions in the year 2011 and sort them by value (small to high). ", 
				transactions.stream()
				.filter(t -> t.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.toList());
		generate(" Find all transactions have value greater than 300 and sort them by trader’s city  ",
				transactions.stream()
				.filter(t -> t.getValue()>300)
				.sorted((t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity()))
				.toList());
		generate("What are all the unique cities where the traders work?",
				getElements(transactions, amount -> amount == 1));
		
		generate("Find all traders from Cambridge and sort them by name desc.", 
				transactions.stream()
				.filter(t -> t.getTrader().getCity().equals("Cambridge"))
				.sorted((o1, o2) -> o2.getTrader().getName().compareTo(o1.getTrader().getName()))
				.collect(Collectors.toList())
				);
		
		generate("Find all traders from Cambridge and sort them by name desc.", transactions.stream()
				.map(Transaction::getTrader)
				.filter(t -> t.getCity().equals("Cambridge"))
				.sorted(Comparator.comparing(Trader::getName).reversed())
				.collect(Collectors.toList()));
		
		System.out.println("Return a string of all traders’ names sorted alphabetically. " + transactions.stream()
		.map(Transaction::getTrader)
		.map(Trader::getName)
		.sorted()
		.collect(Collectors.joining(", ")));
		
		System.out.println("Are any traders based in Milan? " + transactions.stream()
		.map(Transaction::getTrader)
		.anyMatch(t -> t.getCity().equals("Milan")) + "\n");
		
		System.out.println("Count the number of traders in Milan. " + transactions.stream()
		.map(Transaction::getTrader)
		.filter(t -> t.getCity().equals("Milan"))
		.distinct().count() + "\n");
		
		generate("Print all transactions’ values from the traders living in Cambridge.", 
				transactions.stream()
				.filter(t -> t.getTrader().getCity().equals("Cambridge"))
				.collect(Collectors.toList()));
				
		System.out.println("What’s the highest value of all the transactions? " + transactions.stream()
		.map(Transaction::getValue)
		.sorted()
		.toList().getLast() + "\n");
		
		System.out.println("Find the transaction with the smallest value. \n+ "+ transactions.stream()
		.sorted(Comparator.comparing(Transaction::getValue))
		.toList()
		.getFirst());
	}
	
	private static List<String> getElements(List<Transaction> elements, Predicate<Long> predicate) {
 	    return elements.stream() //
 	        .collect(Collectors.groupingBy(e -> e.getTrader().getCity(), Collectors.counting())) // Map<E, Long> Long: số lần xuất hiện
 	        .entrySet() // Set<Entry<E, Long>>
 	        .stream()
 	        .filter(e -> predicate.test(e.getValue()))
 	        .map(Entry::getKey)
 	        .toList();
 	}
		
}

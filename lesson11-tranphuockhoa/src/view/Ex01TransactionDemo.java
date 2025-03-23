package view;

import model.DataModel;
import bean.Trader;
import bean.Transaction;
import java.util.List;
import java.util.Set;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Ex01TransactionDemo {

	public static void main(String[] args) {

		var transactions = DataModel.getTransactions();

		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		
		List<Transaction> transactions2011 = transactions.stream().filter(t -> t.getYear() == 2011)
				.sorted(Comparator
				.comparingInt(Transaction::getValue))
				.collect(Collectors.toList());
		System.out.println("1.");
		System.out.println("Transactions in 2011 sorted by value (small to high): " + transactions2011);

		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		
		List<Transaction> transactionsOver300 = transactions.stream()
				.filter(t -> t.getValue() > 300)
				.sorted(Comparator.comparing(t -> t.getTrader().getCity()))
				.collect(Collectors.toList());
		System.out.println("2.");
		System.out.println("Transactions have value greater than 300 sorted by trader’s city:");
		transactionsOver300.forEach(System.out::println);
		
		// 3. What are all the unique cities where the traders work?
        Set<String> uniqueCities = transactions.stream()
            .map(t -> t.getTrader().getCity())
            .collect(Collectors.toSet());
        System.out.println("3.");
        System.out.println("Unique cities where traders work: " + uniqueCities);
        
        // 4. Find all traders from Cambridge and sort them by name desc.
        List<Trader> tradersFromCambridge = transactions.stream()
            .map(Transaction::getTrader)
            .filter(trader -> trader.getCity().equals("Cambridge"))
            .distinct()
            .sorted(Comparator.comparing(Trader::getName).reversed())
            .collect(Collectors.toList());
        System.out.println("4.");
        System.out.println("Traders from Cambridge sorted by name (desc):");
        tradersFromCambridge.forEach(System.out::println);
        
        // 5. Return a string of all traders’ names sorted alphabetically.
        String traderNames = transactions.stream()
            .map(t -> t.getTrader().getName())
            .distinct()
            .sorted()
            .collect(Collectors.joining(", "));
        System.out.println("5.");
        System.out.println("All traders’ names sorted alphabetically: " + traderNames);

        // 6. Are any traders based in Milan?
        boolean hasTraderInMilan = transactions.stream()
            .map(t -> t.getTrader().getCity())
            .anyMatch(city -> city.equals("Milan"));
        System.out.println("5.");
        System.out.println("Are any traders based in Milan? " + hasTraderInMilan);
	}
	
	
}

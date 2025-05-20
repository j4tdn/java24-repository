package view;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Pair;
import bean.Trader;
import bean.Transaction;
import model.DataModel;

import static utils.CollectionUtils.*;

public class Ex01TransactionApp {
	
private static final List<Transaction> transactions = DataModel.getTransactions();
	
	public static void main(String[] args) {
		generate(
			"0. Prototype model data", 
			transactions
		);
		
		generate(
			"1. Find all transactions in the year 2011 and sort them by value (small to high)", 
			transactions.stream()
				.filter(tn -> tn.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.toList()
		);
		
		generate(
			"2. Find all transactions have value greater than 300 and sort them by trader’s city",
			transactions.stream()
				.filter(tn -> tn.getValue() > 300)
				.sorted(Comparator.comparing(Transaction::getTraderCity))
				.toList()
		);
		
		generate(
			"3. What are all the unique cities where the traders work",
			transactions.stream()
				.map(Transaction::getTraderCity)
				.collect(Collectors.toSet())
		);
		
		generate(
			"4. What are all the unique years when the traders work",
			transactions.stream()
				.map(Transaction::getYear)
				.collect(Collectors.toSet())
		);
		
		generate(
			"5. Find all traders from Cambridge and sort them by name desc",
			transactions.stream()
				.map(Transaction::getTrader)
				.filter(td -> "Cambridge".equals(td.getCity()))
				.sorted(Comparator.comparing(Trader::getName, Comparator.reverseOrder()))
				.toList()
		);
		
		System.out.printf(
			"5. Return a string of all traders' names sorted alphabetically --> %s\n\n",
			transactions.stream()
				.map(Transaction::getTraderName)
				.distinct()
				.collect(Collectors.joining(", "))
			);
		
		
		System.out.printf(
			"6. Are any traders based in Milan --> %s\n\n", 
			transactions.stream()
				.anyMatch(tn -> "Milan".equals(tn.getTraderCity()))
			); 
		
		// 7. Count the number of traders in Milan.
		System.out.printf(
				"7. Count the number of traders in Milan. --> %s\n\n", 
				transactions.stream()
					.filter(tn -> "Milan".equals(tn.getTraderCity()))
					.count()
				); 
		
		// 8. Print all transactions’ values from the traders living in Cambridge.
		
		generate("8. Print all transactions’ values from the traders living in Cambridge.",
			transactions.stream()
				.filter(tn -> "Cambridge".equals(tn.getTraderCity()))
				.map(tn -> new Pair<>(tn.getTraderName(), tn.getValue()))
				.toList()
				);
		
//		 9. What’s the highest value of all the transactions?
		System.out.printf(
				"9. What’s the highest value of all the transactions? --> %s\n\n", 
				transactions.stream()
					.mapToInt(Transaction::getValue)
//					.reduce(Integer.MIN_VALUE, Integer::max)   //Integer::max
					.max()
					.orElse(Integer.MIN_VALUE)
				); 
		
		
		// 10. Find the transaction with the smallest value.
		System.out.printf(
				"10. Find the transaction with the smallest value. --> %s\n\n", 
				transactions.stream()
					.reduce((tn1, tn2) -> tn1.getValue() < tn2.getValue() ? tn1 : tn2)
					.orElse(null)
				); 
	}
	
}

package view;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;
import static utils.CollectionUtils.generate;

import java.util.List;
import java.util.stream.Collectors;

import bean.Pair;
import bean.Trader;
import bean.Transaction;
import model.DataModel;

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
				.sorted(comparing(Transaction::getValue))
				.toList()
		);
		
		generate(
			"2. Find all transactions have value greater than 300 and sort them by trader’s city", 
			transactions.stream()
				.filter(tn -> tn.getValue() > 300)
				.sorted(comparing(Transaction::getTraderCity))
				.toList()
		);
		
		generate(
			"3. What are all the unique cities where the traders work", 
			transactions.stream()
				.map(Transaction::getTraderCity)
				.collect(Collectors.toSet())
		);
		
		generate(
			"3. What are all the unique years when the traders work", 
			transactions.stream()
				.map(Transaction::getYear)
				.collect(Collectors.toSet())
		);
		
		generate(
			"4. Find all traders from Cambridge and sort them by name desc", 
			transactions.stream()
				.map(Transaction::getTrader)
				.filter(td -> "Cambridge".equals(td.getCity()))
				.sorted(comparing(Trader::getName, reverseOrder()))
				.toList()
		);
		
		
		System.out.printf(
			"5. Return a string of all traders’ names sorted alphabetically --> %s\n\n",
			transactions.stream()
				.map(Transaction::getTraderName)
				.distinct()
				.collect(Collectors.joining(", ", "[", "]"))
		);
		
		System.out.printf(
			"6. Are any traders based in Milan1 --> %s\n\n",
			transactions.stream()
				.anyMatch(tn -> "Milan1".equals(tn.getTraderCity()))
		);
		
		System.out.printf(
			"7. Count the number of traders in Milan --> %s\n\n",
			transactions.stream()
				.filter(tn -> "Milan".equals(tn.getTraderCity()))
				.count()
		);
		
		generate(
			"8. Print all transactions’ values from the traders living in Cambridge", 
			transactions.stream()
				.filter(tn -> "Cambridge".equals(tn.getTraderCity()))
				.map(tn -> new Pair<>(tn.getTraderName(), tn.getValue()))
				.toList()
		);
		
		// T: X a1, a2, a3
		// Stream<T>
		//   .groupingBy(T::getA1) ==> Map<X, List<T>>
		
		// Apple: name, value, color
		//         A     100    Red
		//         B     200    Yellow
		//         C     300    Blue
		//         B     180    Black
		
		// groupingBy(Apple::getName) -- Map<String, List<Apple>>
		// A ->  Apple(A     100    Red)
		// B ->  Apple(B     200    Yellow), Apple(B     180    Black)
		// C ->  Apple(C     300    Blue)
		
		generate(
			"8. Print all transactions’ values from the traders living in Cambridge", 
			transactions.stream()
				.filter(tn -> "Cambridge".equals(tn.getTraderCity()))
				.collect(Collectors.groupingBy(Transaction::getTraderName))
		);
		
		System.out.printf(
			"9. What’s the highest value of all the transactions --> %s\n\n",
			transactions.stream()
				.map(Transaction::getValue) // Stream<Integer>
				.reduce(Integer.MIN_VALUE, Integer::max)
		);
		
		System.out.printf(
			"9. What’s the highest value of all the transactions --> %s\n\n",
			transactions.stream()
				.mapToInt(Transaction::getValue) // IntStream
				.max()
				.orElse(Integer.MIN_VALUE)
		);
		
		// 10. Find the transaction with the smallest value.
		System.out.printf(
			"10. Find the transaction with the smallest value --> %s\n\n",
			transactions.stream()
				.reduce((tn1, tn2) -> tn1.getValue() < tn2.getValue() ? tn1 : tn2)
				.orElse(null)
		);
	}
	
}
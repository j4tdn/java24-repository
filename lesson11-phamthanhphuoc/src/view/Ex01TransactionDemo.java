package view;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class Ex01TransactionDemo {
	
	public static void main(String[] args) {
		
		var transactions = DataModel.getTransactions();
		
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		 generate("Các giao dịch năm 2011 (sắp xếp theo giá trị tăng dần):", findTransactionsIn2011SortedByValue(transactions));
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		 generate("các giao dịch có giá trị lớn hơn 300 và sắp xếp chúng theo thành phố của giao dịch viên", findTransactionsWithValueGreaterThan300SortedByTraderCity(transactions));
		// 3. What are all the unique cities where the traders work?
		generate(" tất cả các thành phố duy nhất mà các giao dịch viên làm việc", findUniqueCitiesOfTraders(transactions));
		// 4. Find all traders from Cambridge and sort them by name desc.
		// 5. Return a string of all traders’ names sorted alphabetically.
		
		// 6. Are any traders based in Milan?
		
		// 7. Count the number of traders in Milan.
		
		// 8. Print all transactions’ values from the traders living in Cambridge.
		
		// 9. What’s the highest value of all the transactions?
		
		// 10. Find the transaction with the smallest value.
	}
	 public static List<Transaction> findTransactionsIn2011SortedByValue(List<Transaction> transactions) {
	        return transactions.stream()
	                .filter(transaction -> transaction.getYear() == 2011)
	                .sorted(Comparator.comparing(Transaction::getValue))
	                .collect(Collectors.toList());
	    }
	 public static List<Transaction> findTransactionsWithValueGreaterThan300SortedByTraderCity(List<Transaction> transactions) {
		    return transactions.stream()
		            .filter(transaction -> transaction.getValue() > 300)
		            .sorted(Comparator.comparing(transaction -> transaction.getTrader().getCity()))
		            .collect(Collectors.toList());
		}
	 public static Set<String> findUniqueCitiesOfTraders(List<Transaction> transactions) {
		    return transactions.stream()
		            .map(transaction -> transaction.getTrader().getCity())
		            .collect(Collectors.toSet());
		}
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public static <T> void generate(String prefix, Collection<T> collection) {
			System.out.println(prefix + "  {");
			collection.forEach(element -> {
				System.out.println("   + " + element);
			});
			System.out.println("}\n");
		}
			
	
	
}
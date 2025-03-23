package view;

import model.DataModel;
import bean.Trader;
import bean.Transaction;

import java.util.*;

public class Ex01TransactionDemo {

	public static void main(String[] args) {

		var transactions = DataModel.getTransactions();

		// 1. Find all transactions in the year 2011 and sort them by value (small to
		// high).
		System.out.println("1. Find all transactions in the year 2011 and sort them by value (small to high).");
		System.out.println(getTransactionsByYearAndSort(transactions, 2011));

		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		System.out.println("2. Find all transactions have value greater than 300 and sort them by trader’s city");
		System.out.println(getTransactionsByValueAndSort(transactions, 300));
		// 3. What are all the unique cities where the traders work?

		// 4. Find all traders from Cambridge and sort them by name desc.

		// 5. Return a string of all traders’ names sorted alphabetically.

		// 6. Are any traders based in Milan?

		// 7. Count the number of traders in Milan.

		// 8. Print all transactions’ values from the traders living in Cambridge.

		// 9. What’s the highest value of all the transactions?

		// 10. Find the transaction with the smallest value.
	}

	private static List<Transaction> getTransactionsByYearAndSort(List<Transaction> transactions, int year) {
		List<Transaction> result = new ArrayList<>();
		for (Transaction t : transactions) {
			if (t.getYear() == year) {
				result.add(t);
			}
		}
		result.sort(Comparator.comparingInt(Transaction::getValue));
		return result;
	}

	private static List<Transaction> getTransactionsByValueAndSort(List<Transaction> transactions, int value) {
		List<Transaction> result = new ArrayList<>();
		for (Transaction t : transactions) {
			if (t.getValue() > value) {
				result.add(t);
			}
		}
		result.sort(Comparator.comparing(t -> t.getTrader().getCity()));
		return result;
	}

}
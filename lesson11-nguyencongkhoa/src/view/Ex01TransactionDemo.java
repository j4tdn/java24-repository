package view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.sql.rowset.serial.SQLOutputImpl;

import bean.Trader;
import bean.Transaction;
import model.DataModel;

public class Ex01TransactionDemo {
	
	public static void main(String[] args) {
		
		var transactions = DataModel.getTransactions();
		
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		List<Transaction> transactionsIn2011 = findAllTransactionsIn2011AndSortByValue(transactions, 2011);
		for (Transaction t : transactionsIn2011) {
			System.out.println(t);
		}
		System.out.println();
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		List<Transaction> transactionsGreaterThan300 = findAllTransactionsHaveValueGreaterThan300AndSortByCity(transactions, 300);
		for (Transaction t : transactionsGreaterThan300) {
			System.out.println(t);
		}
		System.out.println();
		// 3. What are all the unique cities where the traders work?
		Set<String> cities = findAllTheUniqueCities(transactions);
		for (String city : cities) {
		    System.out.println(city);
		}
		System.out.println();
		// 4. Find all traders from Cambridge and sort them by name desc.
		List<Trader> tradersFromCambridge = findTradersFromCambridgeAndSortByNameDesc(transactions);
		for (Trader t : tradersFromCambridge) {
			System.out.println(t);
		}
		System.out.println();
		// 5. Return a string of all traders’ names sorted alphabetically.
		List<String> names = findAllTradersName(transactions);
		for (String t : names) {
			System.out.println(t);
		}
		System.out.println();
		// 6. Are any traders based in Milan?
		boolean tradersInMilan = areTradersBasedInMilan(transactions);
		System.out.println("Are any traders based in Milan?" + tradersInMilan);
		System.out.println();
		// 7. Count the number of traders in Milan.
		int totalTraderInMilan = countTradersInMilan(transactions);
		System.out.println("Total trader in Milan: " + totalTraderInMilan);
		System.out.println();
		// 8. Print all transactions’ values from the traders living in Cambridge.
		printAllTransactionValuesInCambridge(transactions);
		System.out.println();
		// 9. What’s the highest value of all the transactions?
		int highestValueTransaction = findHighestTransactionValue(transactions);
		System.out.println("the highest value of all the transactions: " + highestValueTransaction);
		System.out.println();
		// 10. Find the transaction with the smallest value.
		List<Transaction> transSmallestValue = findTransactionSmallestValue(transactions);
		for (Transaction t : transSmallestValue) {
			System.out.println(t);
		}
	}
	
	private static List<Transaction> findAllTransactionsIn2011AndSortByValue(List<Transaction> transactions, int year){
		List<Transaction> res = new ArrayList<>();
		for (Transaction t : transactions) {
			if (t.getYear() == year) {
				res.add(t);
			}
		}
		res.sort((t1, t2) -> Integer.compare(t1.getValue(), t2.getValue()));
		return res;
	}
	
	private static List<Transaction> findAllTransactionsHaveValueGreaterThan300AndSortByCity(List<Transaction> transactions, int value){
		List<Transaction> res = new ArrayList<>();
		for (Transaction t : transactions) {
			if (t.getValue() >value ) {
				res.add(t);
			}
		}
		res.sort((t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity()));
		return res;
	}
	
	private static Set<String> findAllTheUniqueCities(List<Transaction> transactions){
		Set<String> cities = new HashSet<>();
		for (Transaction t : transactions) {
			cities.add(t.getTrader().getCity());
		}
		return cities;
	}
	
	private static List<Trader> findTradersFromCambridgeAndSortByNameDesc(List<Transaction> transactions){
		List<Trader> res = new ArrayList<>();
		for (Transaction t : transactions) {
			if (t.getTrader().getCity().equals("Cambridge")) {
				res.add(t.getTrader());
			}
		}
		res.sort((t1, t2) -> t2.getName().compareTo(t1.getName()));
		return res;
	}
	
	private static List<String> findAllTradersName(List<Transaction> transactions){
		List<String> res = new ArrayList<>();
		for (Transaction t : transactions) {
			res.add(t.getTrader().getName());
		}
		res.sort((t1, t2) -> t1.compareTo(t2));
		return res;
	}
	
	private static boolean areTradersBasedInMilan(List<Transaction> transactions){
		for (Transaction t : transactions) {
			if (t.getTrader().getCity().equals("Milan")) {
				return true;
			}
		}
		return false;
	}
	
	private static int countTradersInMilan(List<Transaction> transactions){
		int cnt = 0;
		for (Transaction t : transactions) {
			if (t.getTrader().getCity().equals("Milan")) {
				cnt++;
			}
		}
		return cnt;
	}
	
	private static void printAllTransactionValuesInCambridge(List<Transaction> transactions){
		for (Transaction t : transactions) {
			if (t.getTrader().getCity().equals("Cambridge")) {
				System.out.println(t);
			}
		}
	}
	
	private static int findHighestTransactionValue(List<Transaction> transactions){
		int max = Integer.MIN_VALUE;
		for (Transaction t : transactions) {
			max = Math.max(max, t.getValue());
		}
		return max;
	}
	
	private static List<Transaction> findTransactionSmallestValue(List<Transaction> transactions){
		int min = Integer.MAX_VALUE;
		List<Transaction> transSmallesValue = new ArrayList<>();
		for (Transaction t : transactions) {
			min = Math.max(min, t.getValue());
		}
		for (Transaction t : transactions) {
			if (t.getValue() == min) {
				transSmallesValue.add(t);
			}
		}
		return transSmallesValue;
	}
	
}
package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bean.Transaction;
import model.DataModel;

public class Ex01TransactionDemo {

	public static void main(String[] args) {
		
		var transaction = DataModel.getTransactions();
		genrate("Danh sách data", transaction);
		
		//1. Find all transactions in the year 2011 and sort them by value (small to high).
		
		findYear(transaction,2011, (a,b)-> {
			return Integer.compare(a.getValue(), b.getValue());
		});
		
		//2. Find all transactions have value greater than 300 and sort them by trader’s city
		findValue(transaction, 300, (a,b)-> {
			return a.getTrader().getCity().compareTo(b.getTrader().getCity());
		});
		
		//3. What are all the unique cities where the traders work?
		
		
		//4. Find all traders from Cambridge and sort them by name desc.
		
		//5. Return a string of all traders’ names sorted alphabetically.
		
		//6. Are any traders based in Milan?
		
		//7. Count the number of traders in Milan.
		
		//8. Print all transactions’ values from the traders living in Cambridge.
		
		//9. What’s the highest value of all the transactions?
		
		//10. Find the transaction with the smallest value.
		
		
	}
	private static <E> void genrate(String prefefix, List<E> list) {
		
		System.out.println(prefefix + " {");
		for (E e: list) {
			System.out.println("+ " +e);
		}
		System.out.println("}\n");
	}
	private static  void findYear(List<Transaction> list, int year, Comparator<Transaction> compartor) {
		List<Transaction> result = new ArrayList<>();
		for (Transaction e : list ) {
			if (e.getYear() == 2011) {
			result.add(e);
		}
		list.sort(compartor);
		genrate("Danh sách transaction 2011 ", result);
	}
	
}
	private static  void findValue(List<Transaction> list, int value, Comparator<Transaction> compartor) {
		List<Transaction> result = new ArrayList<>();
		for (Transaction e : list ) {
			if (e.getValue() > 300) {
				result.add(e);
			}
			list.sort(compartor);
			genrate("Danh sách transaction value > 300 ", result);
		}
		
	}}
	
	

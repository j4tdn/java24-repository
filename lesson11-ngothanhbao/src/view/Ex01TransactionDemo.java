package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bean.Transaction;
import functional.TransFunc;
import model.DataModel;

public class Ex01TransactionDemo {
	
	public static void main(String[] args) {
		
		List<Transaction> transactions = DataModel.getTransactions();
		
		// 1. Find all transactions in the year 2011 and sort them by value (small to high).
		
		generate("1. Find all transactions in the year 2011 and sort them by value",
				findTrans(t -> t.getYear() == 2011, transactions,(t1, t2) -> t1.compareTo(t2)));
		
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		
		generate("2. Find all transactions have value greater than 300 and sort them by trader’s city"
				, findTrans(t -> t.getValue() > 300, transactions, (t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity())));
		
		// 3. What are all the unique cities where the traders work?
		
		generate(" 3. What are all the unique cities where the traders work",
				findUniqueCity(transactions));
		
		// 4. Find all traders from Cambridge and sort them by name desc.
		
		generate("4. Find all traders from Cambridge and sort them by name desc.",
				findTrans(t -> t.getTrader().getCity() == "Cambridge", transactions, (t1, t2) -> t1.getTrader().getName().compareTo(t2.getTrader().getName())));
		
		// 5. Return a string of all traders’ names sorted alphabetically.
		
		generate("5. Return a string of all traders’ names sorted alphabetically",
				nameList(transactions));
		
		// 6. Are any traders based in Milan?
		
		generate("6. traders based in Milan",
				findCityTraderBased(transactions, "Milan"));
		
		// 7. Count the number of traders in Milan.
		
		generate("7. Count the number of traders in Milan.",
				countTraderInCity(transactions, "Milan"));
		
		
		// 8. Print all transactions’ values from the traders living in Cambridge.
		
		generate("8. Print all transactions’ values from the traders living in Cambridge",
				findValues(transactions,"Cambridge"));
		
		// 9. What’s the highest value of all the transactions?
		
		generate("9. What’s the highest value of all the transactions",
				maxValue(transactions));
		
		// 10. Find the transaction with the smallest value.
		
		generate("10. Find the transaction with the smallest value.",
				minValue(transactions));
		
	}
	
	private static List<Transaction> findTrans(TransFunc trans,List<Transaction> sources,Comparator<Transaction> comparator) {
		List<Transaction> res = new ArrayList<>();
		for(Transaction source : sources) {
			if(trans.test(source)) {
				res.add(source);
			}
		}
		res.sort(comparator);
		return res;
	}
	
	private static List<Integer> findValues(List<Transaction> sources, String city) {
		List<Integer> res = new ArrayList<>();
		for(Transaction source : sources) {
			if(source.getTrader().getCity().equals(city)) {
				res.add(source.getValue());
			}
		}
		return res;
	}
	
	private static Set<String> findUniqueCity(List<Transaction> sources) {
		Set<String> res = new HashSet<>();
		for(Transaction source : sources) {
			res.add(source.getTrader().getCity());
		}
		return res;
	}
	
	private static Set<Transaction> findCityTraderBased(List<Transaction> sources,String city) {
		Set<Transaction> res = new HashSet<>();
		for(Transaction source : sources) {
			if(source.getTrader().getCity().equals(city)) {
				res.add(source);
			}
		}
		return res;
	}
	
	private static List<String> nameList(List<Transaction> sources) {
		Set<String> nameSet = new HashSet<>();
		for(Transaction source: sources) {
			nameSet.add(source.getTrader().getName());
		}
		List<String> res = new ArrayList<>(nameSet);
		res.sort((t1, t2) -> t1.compareTo(t2));
		return res;
	}
	
	private static int countTraderInCity(List<Transaction> sources, String city) {
		Set<Transaction> count = new HashSet<>();
		for(Transaction source : sources) {
			if(source.getTrader().getCity().equals(city)) {
				count.add(source);
			}
		}
		List<Transaction> res = new ArrayList<>(count);
		return res.size();
	}
	
	public static int maxValue(List<Transaction> sources) {
		int max = Integer.MIN_VALUE;
		for(Transaction source : sources) {
			if(max < source.getValue()) {
				max = source.getValue();
			}
		}
		return max;
	}
	
	public static List<Transaction> minValue(List<Transaction> sources) {
		int min = Integer.MAX_VALUE;
		List<Transaction> res = new ArrayList<>();
		for(Transaction source : sources) {
			if(min > source.getValue()) {
				min = source.getValue();
				res.add(source);
			}
		}
		return res;
	}
	
	public static <T> void generate(String prefix, Collection<T> collection) {
		System.out.println(prefix + "  {");
		collection.forEach(element -> {
			System.out.println("   + " + element);
		});
		System.out.println("}\n");
	}
	
	
	public static void generate(String prefix, int number) {  
	    System.out.println(prefix + "  {");  
	    System.out.println("   + " + number);  
	    System.out.println("}\n");  
	}  
}
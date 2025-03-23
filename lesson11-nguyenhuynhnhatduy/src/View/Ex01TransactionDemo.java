package View;



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
	
	  System.out.println("1. Transactions in 2011 :");
      findTransactionsIn2011(transactions).forEach(System.out::println);

      System.out.println("2. Transactions  > 300 sorted by city:");
      findTransactionsGreaterThan300(transactions).forEach(System.out::println);

      System.out.println("3. Unique cities where traders work:");
      System.out.println(findUniqueCitie(transactions));

      System.out.println("4. Traders from Cambridge :");
      findTradersFromCambridge(transactions).forEach(System.out::println);

      System.out.println("5. All traders' names sorted alphabetically:");
      System.out.println(getAllTraderNamesSorted(transactions));

      System.out.println("6.  traders based in Milan? " + isTraderInMilan(transactions));

      System.out.println("7. Number of trader in Milan: " + countTradersInMilan(transactions));

      System.out.println("8. Transactions from traders in Cambridge:");
      printTransactionsFromCambridge(transactions);

  
}
public static List<Transaction> findTransactionsIn2011(List<Transaction> transactions) {
    return transactions.stream()
            .filter(t -> t.getYear() == 2011)
            .sorted(Comparator.comparingInt(Transaction::getValue))
            .collect(Collectors.toList());
}

public static List<Transaction> findTransactionsGreaterThan300(List<Transaction> transactions) {
    return transactions.stream()
            .filter(t -> t.getValue() > 300)
            .sorted(Comparator.comparing(t -> t.getTrader().getCity()))
            .collect(Collectors.toList());
}

public static Set<String> findUniqueCitie(List<Transaction> transactions) {
    return transactions.stream()
            .map(t -> t.getTrader().getCity())
            .collect(Collectors.toSet());
}

public static List<Trader> findTradersFromCambridge(List<Transaction> transactions) {
    return transactions.stream()
            .map(Transaction::getTrader)
            .filter(t -> "Cambridge".equals(t.getCity()))
            .distinct()
            .sorted(Comparator.comparing(Trader::getName).reversed())
            .collect(Collectors.toList());
}

public static String getAllTraderNamesSorted(List<Transaction> transactions) {
    return transactions.stream()
            .map(t -> t.getTrader().getName())
            .distinct()
            .sorted()
            .collect(Collectors.joining(", "));
}

public static boolean isTraderInMilan(List<Transaction> transactions) {
    return transactions.stream()
            .anyMatch(t -> "Milan".equals(t.getTrader().getCity()));
}

public static long countTradersInMilan(List<Transaction> transactions) {
    return transactions.stream()
            .map(Transaction::getTrader)
            .filter(t -> "Milan".equals(t.getCity()))
            .distinct()
            .count();
}

public static void printTransactionsFromCambridge(List<Transaction> transactions) {
    transactions.stream()
            .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
            .map(Transaction::getValue)
            .forEach(System.out::println);
}


}

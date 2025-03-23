package view;

import bean.Transaction;
import model.DataModel;

import java.util.*;

public class Ex01TransactionDemo {
    public static void main(String[] args) {
        var transaction = DataModel.getTransactions();
        /*
        1. Find all transactions in the year 2011 and sort them by value (small to high).
        2. Find all transactions have value greater than 300 and sort them by trader’s city
        3. What are all the unique cities where the traders work?
        4. Find all traders from Cambridge and sort them by name desc.
        5. Return a string of all traders’ names sorted alphabetically.
        6. Are any traders based in Milan?
        7. Count the number of traders in Milan.
        8. Print all transactions’ values from the traders living in Cambridge.
        9. What’s the highest value of all the transactions?
        10. Find the transaction with the smallest value.
         */

        System.out.println(getTransactionByYearAndSortByValue(transaction, (o1, o2) -> o1.getValue() - o2.getValue()));
        System.out.println(getTransactionByValueAndSortByCity(transaction, (o1, o2) -> o1.getTrader().getCity().compareTo(o2.getTrader().getCity())));
        System.out.println(getCity(transaction));
    }

    private static <T> Collection<T> getTransactionByYearAndSortByValue(Collection<T> collection, Comparator<T> comparator) {
            List<T> transactions = new ArrayList<>();
            for (T transaction : collection) {
                if (transaction instanceof Transaction) {
                    if (((Transaction) transaction).getYear() == 2011) {
                        transactions.add(transaction);
                    }
                }
            }

          transactions.sort(comparator);
          return transactions;
    }

    private static <T> Collection<T> getTransactionByValueAndSortByCity(Collection<T> collection,  Comparator<T> comparator) {
            List<T> transactions = new ArrayList<>();
            for (T transaction : collection) {
                if (transaction instanceof Transaction) {
                    if (((Transaction) transaction).getValue() > 300) {
                        transactions.add(transaction);
                    }
                }
            }
            transactions.sort(comparator);
            return transactions;
    }

    private static <T> Set<String> getCity(Collection<T> collection){
        Set<String> cities = new HashSet<>();
        for (T transaction : collection) {
            if (transaction instanceof Transaction) {
                cities.add(((Transaction) transaction).getTrader().getCity());
            }
        }
        return cities;
    }



}

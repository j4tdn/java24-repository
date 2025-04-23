package view;

import bean.Transaction;
import model.DataModel;

import java.util.stream.Collectors;

import static java.util.Comparator.*;

public class Ex01TransactionApp {

    public static void main(String[] args) {

        final var transactions = DataModel.getTransactions();

        var findTransactionsIn2011 = transactions.stream()
                .filter(a -> a.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .toList();
//        System.out.println(findTransactionsIn2011);

        var findTransHaveValueGreaterThan300 = transactions.stream()
                .filter(a -> a.getYear() > 300)
                .sorted(comparing(Transaction::getValue))
                .toList();
//        System.out.println(findTransHaveValueGreaterThan300);

        var allTheUniqueCities = transactions.stream()
                .map(Transaction::getTraderCity)
                .collect(Collectors.toSet());
//        System.out.println(allTheUniqueCities);

        var allTheUniqueYearsWhenTradersWork = transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toSet());
//        System.out.println(allTheUniqueYearsWhenTradersWork);

        var findAllTradersFromCambrideAndSortByNameDescending = transactions.stream()
                .filter(t -> t.getTraderCity().equals("Cambridge"))
                .sorted(comparing(Transaction::getTraderName))
                .toList();
        System.out.println(findAllTradersFromCambrideAndSortByNameDescending);

        var returnStringOfAllTradersNamesSortedAlphabetically = transactions.stream()
                .map(Transaction::getTraderName)
                .distinct()
                .collect(Collectors.joining(", "));
        System.out.println(returnStringOfAllTradersNamesSortedAlphabetically);

        var checkIfAnyTraderIsBasedInMilan = transactions.stream()
                .anyMatch(t -> t.getTraderCity().equals("Milan"));
        System.out.println(checkIfAnyTraderIsBasedInMilan);

        var countTheNumberOfTradersInMilan = transactions.stream()
                .filter(t -> t.getTraderCity().equals("Milan"))
                .count();
        System.out.println(countTheNumberOfTradersInMilan);

        var printAllTransactionValuesFromCambridge = transactions.stream()
                .filter(t -> t.getTraderCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .reduce(0, Integer::sum);
        System.out.println(printAllTransactionValuesFromCambridge);

        var getHighestValueOfAllTransactions = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(getHighestValueOfAllTransactions);

        var findTheSmallestTransaction = transactions.stream()
                .reduce((a, b) -> a.getValue() < b.getValue() ? a : b)
                .orElse(null);
        System.out.println(findTheSmallestTransaction);
    }

}

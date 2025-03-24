package model;

import bean.Trader;
import bean.Transaction;

import java.util.*;

public class DataModel {
    private DataModel() {

    }

    public static List<Transaction> getTransactions() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        return transactions;
    }

    public static List<String> mockCardName() {
        List<String> name = new ArrayList<>();
        name.add("2");
        name.add("3");
        name.add("4");
        name.add("5");
        name.add("6");
        name.add("7");
        name.add("8");
        name.add("9");
        name.add("10");
        name.add("J");
        name.add("Q");
        name.add("K");
        name.add("A");
        return name;
    }
    public static List<String> mockCardType() {
        List<String> type = new ArrayList<>();
        type.add("co");
        type.add("ro");
        type.add("chuon");
        type.add("bich");
        return type;
    }

    public static Map<String, Integer> getExpense(){
        Map<String, Integer> expense = new HashMap<>();
        expense.put("An sang", 100);
        expense.put("An trua", 200);
        expense.put("An toi", 300);
        expense.put("Do xang", 400);
        expense.put("Cat toc", 500);
        expense.put("Gui xe", 600);
        expense.put("In tai lieu", 700);
        expense.put("Bida", 800);
        expense.put("Ca phe ", 900);
        return expense;
    }
}

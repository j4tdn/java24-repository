package view;

import bean.Card;
import model.DataModel;

import java.util.*;

public class Ex04CardGame {
    public static void main(String[] args) {
        List<Card> cards = getCards();

        shufflingAndDeal(cards);
    }

    private static List<Card> getCards() {
        List<String> names = DataModel.mockCardName();
        List<String> types = DataModel.mockCardType();
        List<Card> cards = new ArrayList<>();
        for (String name : names) {
            for (String type : types) {
                cards.add(new Card(name, type));
            }
        }
        return cards;
    }

    private static void shufflingAndDeal(List<Card> cards) {
        List<Card> player1 = new ArrayList<>();
        List<Card> player2 = new ArrayList<>();
        List<Card> player3 = new ArrayList<>();
        List<Card> player4 = new ArrayList<>();

        //xao bai
        Collections.shuffle(cards);

        //chia bai
        for (int i = 0; i < cards.size(); i = i + 4) {
            player1.add(cards.get(i));
            player2.add(cards.get(i + 1));
            player3.add(cards.get(i + 2));
            player4.add(cards.get(i + 3));
        }

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(player4);
    }

}

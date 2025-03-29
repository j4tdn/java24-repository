package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.Card;
import common.TypeOfCard;
import model.DataModel;
import static utils.CollectionUtils.*;

public class Ex04ShuffleCard {
	public static void main(String[] args) {
		
		List<Card> cards = getCards();
		
		
		shuffleAndDeal(cards);
		
	}
	
	private static List<Card> getCards() {
		List<String> values = DataModel.mockValueCard();
		List<TypeOfCard> types = DataModel.mockTypeCard();
		List<Card> cards = new ArrayList<>();
		
		for (String value : values) {
			for (TypeOfCard type : types) {
				cards.add(new Card(type, value));
			}
		}
		return cards;
	}
	
	private static void shuffleAndDeal(List<Card> cards) {
		List<Card> player1 = new ArrayList<>();
		List<Card> player2 = new ArrayList<>();
		List<Card> player3 = new ArrayList<>();
		List<Card> player4 = new ArrayList<>();
		
		Collections.shuffle(cards);
		
		for (int i = 0; i < cards.size(); i += 4) {
			player1.add(cards.get(i));
			player2.add(cards.get(i + 1));
			player3.add(cards.get(i + 2));
			player4.add(cards.get(i + 3));
		}
		
		generate("Player 1>>>", player1);
		generate("Player 2>>>", player2);
		generate("Player 3>>>", player3);
		generate("Player 4>>>", player4);
		
	}

}

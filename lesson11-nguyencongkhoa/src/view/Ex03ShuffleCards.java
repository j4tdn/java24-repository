package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.PokerCard;
import model.Generate52Cards;

public class Ex03ShuffleCards {

	public static void main(String[] args) {
		List<PokerCard> listCard = Generate52Cards.get52Cards();

//		printListCard(listCard);
//
//		System.out.println();

//		listCard = shuffleCards(listCard);
//		printListCard(listCard);

		List<List<PokerCard>> playersCards = dealCards(listCard);

		int cnt = 1;
		for (List<PokerCard> player : playersCards) {
			System.out.println("Player " + (cnt++) + ": " + player);
		}

	}

	private static List<List<PokerCard>> dealCards(List<PokerCard> listCard) {
		List<List<PokerCard>> playersCards = new ArrayList<>();

		listCard = shuffleCards(listCard);
//		printListCard(listCard);

		for (int i = 0; i < 4; i++) {
			playersCards.add(new ArrayList<>());
		}

		for (int i = 0; i < listCard.size(); i++) {
			playersCards.get(i % 4).add(listCard.get(i));
		}
		return playersCards;
	}

	private static List<PokerCard> shuffleCards(List<PokerCard> listCard) {
		Collections.shuffle(listCard);
		return listCard;
	}

	private static void printListCard(List<PokerCard> listCard) {
		for (PokerCard p : listCard) {
			System.out.println(p);
		}
	}
}

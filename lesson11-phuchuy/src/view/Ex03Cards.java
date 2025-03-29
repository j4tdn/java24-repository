package view;

import static utils.CollectionUtils.generate;

import java.util.List;

import bean.Card;
import bean.Deck;

public class Ex03Cards {

	public static void main(String[] args) {
		
		Deck d1 = new Deck();
		d1.shuffle();
		List<List<Card>> hands = d1.handing(4);	
		for ( int i =0; i< hands.size(); i++) {
			generate("Bộ bài của từng người chơi", hands.get(i));
		}
			
	}
}

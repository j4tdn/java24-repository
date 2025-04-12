package bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static utils.CollectionUtils.*;

public class Deck extends Card {
	
	private static List<Card> deck = new ArrayList<Card>(); 
	
	private static List<Card> createDeck() {
		
		for(Suit suit:Suit.values()) {
			for(Rank rank:Rank.values()) {
				deck.add(new Card(suit,rank));
			}
		}
		
		return deck;
	}
	
	public Deck() {
		createDeck();
		generate("Bộ bài 52 lá", deck);
	}
	
	public static void shuffle() {
		Collections.shuffle(deck);
		generate("Đã xào bài", deck);
	}
	
	
	public static void handing(int numberOfPlayers){
		List<List<Card>> players = new ArrayList<>();
		
		for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new ArrayList<>());
        }
		
		 
		// Hàm chia bài lần lượt từng lá cho 4 người
        for (int i = 0; i < deck.size(); i++) {
            Card card = deck.get(i);
            players.get(i % numberOfPlayers).add(card);
        }
        
        for(int i =0; i < numberOfPlayers; i ++) {
        	System.out.println("Bài của người chơi " + i + players.get(i));
        }
		
	}
	
	
}

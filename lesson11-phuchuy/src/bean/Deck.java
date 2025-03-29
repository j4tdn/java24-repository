package bean;

import static utils.CollectionUtils.generate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Deck {
	private static List<Card> cards;
	public Deck() {
	cards = new ArrayList<>();							// Tạo list card rồi lặp 2 vòng với mỗi suit sẽ add 13 rank trong Enum
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				cards.add(new Card(suit, rank));
			}
		}
		generate("Bộ bài 52 lá", cards);
	}
	
	
	  public static void shuffle() { Collections.shuffle(cards);
	  generate("Bộ bài sau khi xào", cards);}
	 
	public static List<List<Card>> handing(int numberPlayer) {				// tạo 1 list lớn -> như 1 sòng bài -> trong sòng bài sẽ có bao nhiu số người chơi đó
		int cardPerPlayer = (cards.size())/numberPlayer;					// với mỗi người chơi sẽ là 1 list nhỏ các lá bài
		List<List<Card>> hands = new ArrayList<>();
		
		for (int i =0 ; i < numberPlayer; i++) {							// tạo array list rỗng danh sách bài cho mỗi người chơi
			hands.add(new ArrayList<Card>());
		}
		
		for (int i =0; i < cardPerPlayer; i++) {							// lặp 2 vòng for, 52 lá bài sẽ gồm 13 lần chia,  mỗi lần chia sẽ chia cho 4 người
			for (int j = 0; j < numberPlayer; j++) {						// ý tưởng ở đây là cứ mỗi lần add 1 lá cho 1 người chơi, em sẽ remove lá đó khỏi list cards
				if (!cards.isEmpty()) {										// list cards lúc này sẽ hao hụt dần cho đến khi empty
					hands.get(j).add(cards.remove(0));						
				}
			}
		}
		return hands;
	}
	
 
	


}

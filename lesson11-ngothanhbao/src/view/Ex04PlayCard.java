package view;

import static model.DataModel.getCard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.Card;
import bean.Player;
public class Ex04PlayCard {

	public static void main(String[] args) {
		List<Card> listCard = getCard();
		
		List<Player> listPlayer = new ArrayList<>();
		listPlayer.add(new Player("Nam",null));
		listPlayer.add(new Player("Duc",null));
		listPlayer.add(new Player("An",null));
		listPlayer.add(new Player("Binh",null));
		playing(listCard, listPlayer);
		
		for(Player player : listPlayer) {
			System.out.println(player);
		}
	}
	
	private static List<Player> playing(List<Card> Csources,List<Player> Psources) {
		Collections.shuffle(Csources);
		for(int i = 0;i < 13;i++) {
			for(Player player : Psources) {
				player.getHand().add(Csources.remove(0));
			}
		}
		return Psources;
	}
	
	
}

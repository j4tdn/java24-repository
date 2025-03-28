package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.PokerCard;
import common.TypeOfCard;

public class Generate52Cards {
	
	public Generate52Cards() {
	}
	
	public static List<PokerCard> get52Cards(){
		List<PokerCard> listCard = new ArrayList<>();
		for (int i = 1; i < 14; i++) {
			for (TypeOfCard toc : TypeOfCard.values()) {
				listCard.add(new PokerCard(toc, i));
			}
		}
		return listCard;
	}
	
	public static void main(String[] args) {
		
		for (PokerCard c : get52Cards()) {
			System.out.println(c);
		}
		
	}
	
}

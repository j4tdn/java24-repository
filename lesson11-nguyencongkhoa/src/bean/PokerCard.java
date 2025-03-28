package bean;

import common.TypeOfCard;

public class PokerCard {

	private TypeOfCard typeOfCard;
	private int card;

	public PokerCard() {
	}

	public PokerCard(TypeOfCard typeOfCard, int card) {
		super();
		this.typeOfCard = typeOfCard;
		this.card = card;
	}

	public TypeOfCard getTypeOfCard() {
		return typeOfCard;
	}

	public void setTypeOfCard(TypeOfCard typeOfCard) {
		this.typeOfCard = typeOfCard;
	}

	public int getCard() {
		return card;
	}

	public void setCard(int card) {
		this.card = card;
	}

	@Override
	public String toString() {
		String cardName = "";

		switch (card) {
		case 11: {
			cardName = "Ri";
			break;
		}
		case 12: {
			cardName = "Đầm";
			break;
		}
		case 13: {
			cardName = "Già";
			break;
		}
		case 1: {
			cardName = "Xì";
			break;
		}
		case 2: {
			cardName = "Heo";
			break;
		}
		default:
			cardName = String.valueOf(card);
		}
		return cardName + " " + typeOfCard.getCardVNM();
	}

}

package bean;

import java.util.Objects;

import common.TypeOfCard;

public class Card {
	private TypeOfCard typeOfCard;
	private String valueCard;
	
	public Card() {
	}

	public Card(TypeOfCard typeOfCard, String valueCard) {
		this.typeOfCard = typeOfCard;
		this.valueCard = valueCard;
	}

	public TypeOfCard getTypeOfCard() {
		return typeOfCard;
	}

	public void setTypeOfCard(TypeOfCard typeOfCard) {
		this.typeOfCard = typeOfCard;
	}

	public String getValueCard() {
		return valueCard;
	}

	public void setValueCard(String valueCard) {
		this.valueCard = valueCard;
	}

	@Override
	public int hashCode() {
		return Objects.hash(typeOfCard, valueCard);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return typeOfCard == other.typeOfCard && valueCard == other.valueCard;
	}

	@Override
	public String toString() {
		return "Card [typeOfCard=" + typeOfCard + ", valueCard=" + valueCard + "]";
	}
	
	
	
	

}

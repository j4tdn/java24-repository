package bean;

import java.util.Objects;

public class Card {

	private String type;
	private String cardName;
	
	public Card() {
	}

	public Card(String type, String cardName) {
		super();
		this.type = type;
		this.cardName = cardName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(cardName);
	}
	
	
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		
		if(!(o instanceof Card that)) {
			return false;
		}
		
		return cardName == that.cardName;
	}

	@Override
	public String toString() {
		return "Card [type=" + type + ", cardName=" + cardName + "]";
	}
	
	
	
}

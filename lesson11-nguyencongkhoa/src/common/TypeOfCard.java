package common;

public enum TypeOfCard {
	HEARTS("Cơ"),

	DIAMONDS("Rô"),

	CLUBS("Chuồn"),

	SPADES("Bích");

	private TypeOfCard() {
	}

	private String cardVNM;

	TypeOfCard(String cardVNM) {
		this.cardVNM = cardVNM;
	}

	public String getCardVNM() {
		return this.cardVNM;
	}

}

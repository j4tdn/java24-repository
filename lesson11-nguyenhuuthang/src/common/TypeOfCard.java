package common;

public enum TypeOfCard {
	
	heart("Cơ"), diamonds("Rô"), clubs("Chuồn"), spades("Bích");
	
	private String typeCard;
	private TypeOfCard() {}

	TypeOfCard(String typeCard) {
		this.typeCard = typeCard;
	}
	
	public String getTypeCard() {
		return typeCard;
	}

}

package bean;


enum Suit {
	Cơ, Rô, Bích, Chuồn;
}
enum Rank {
	Hai, Ba, Bốn, Năm, Sáu, Bảy, Tám, Chín, Mười, J, Q, K, Xì ;
}


public class Card {
	private Suit suit;
	private Rank rank;
	
	public Card() {
	}

	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return rank + " "+ suit;
	}
	
	
	
	
	
}

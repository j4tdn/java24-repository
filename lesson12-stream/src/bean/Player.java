package bean;

import java.util.List;

public class Player {
	
	private String name;
	private List<String> cards;
	private boolean status;
	
	public Player() {
	}

	public Player(String name, List<String> cards, boolean status) {
		this.name = name;
		this.cards = cards;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public List<String> getCards() {
		return cards;
	}

	public boolean isStatus() {
		return status;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCards(List<String> cards) {
		this.cards = cards;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", cards=" + cards + ", status=" + status + "]";
	}
	
}

package bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Player {
	private String name;
	private List<Card> hand;
	
	public Player() {
	}

	public Player(String name, List<Card> hand) {
		super();
		this.name = name;
		this.hand = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		
		if(!(o instanceof Player that)) {
			return false;
		}
		return name == that.name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(name);
	}
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", hand=" + hand + "]";
	}
	
	
}

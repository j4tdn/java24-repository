package view.stream;

import java.util.Arrays;
import java.util.List;

import bean.Player;
import model.DataModel;

public class Ex06StreamMapFlat {
	
	public static void main(String[] args) {
		
		// Collection<T> -> Stream<T> ... từng phần tử trong stream là từng T
		
		// Collection<Collection<T>> -> Stream<Collection<T>> ... từng phần tử là từng collection
		
		List<Player> players = DataModel.getPlayers();
		
		// Tìm những quân 'hai' còn lại của những người chơi bị thua
		
		// { ("baco", "haichuon", "giaro"), ("bonco", "hairo", "giabich"), ("bayco", "boichuon", "giaco") } 
		// {"baco", "haichuon", "giaro", "bonco", "hairo", "giabich", "bayco", "boichuon", "giaco"}
		
		
		players.stream()                           // Stream<Player>
			.filter(p -> !p.isStatus()) // thua       Stream<Player>
			.map(Player::getCards)                 // Stream<List<String>> { ("baco", "haichuon", "giaro"), ("bonco", "hairo", "giabich"), ("bayco", "boichuon", "giaco") }
			.flatMap(cards -> cards.stream())      // Stream<String> // Collection::stream
			.filter(card -> card.startsWith("hai"))
			.forEach(System.out::println);
			
		// Stream<Collection<T>> --> stream(collection -> collectoon.stream()) --> Stream<T>
		
		// Stream<T[]> --> stream(az -> Arrays.stream(az)) --> Stream<T>
		
		String[][] a2D = { {"a1", "a2"}, {"a3", "a4"}, {"a5", "a6"} };
		
		Arrays.stream(a2D)                      // Stream<String[]>
			.flatMap(a1D -> Arrays.stream(a1D)) // Stream<T> // Arrays::stream
			.forEach(System.out::println);
	}
	
}

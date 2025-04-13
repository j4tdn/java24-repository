package view.stream;

import java.util.Arrays;
import java.util.List;

import bean.Player;
import model.DataModel;

public class Ex06StreamMapFlat {

	public static void main(String[] args) {
		
		// Collection<T> -> Stream<T> ... từng phần tử trong stream là tnwgf T
		
		// Collection<Collection<T>> -> Stream<Collection<T>> ... từng phần tử là từng collection
		
		List<Player> players = DataModel.getPlayer();
		
		//Tim nhung quan '2' con lai cua nhung nguoi choi bi thua
		players.stream()
			.filter(p -> !p.isStatus()) //thua
			.map(Player::getCards) //Stream<List<String>>
			.flatMap(cards -> cards.stream()) //Stream<String>
			.filter(card -> card.startsWith("hai"))
			.forEach(System.out::println);
		
		// Stream<Collection<T>> --> stream(col -> col.stream()) --> Stream<T>
		
		// Stream<T[]> --> stream(az -> Arrays.stream(az)) --> Stream<T>
		
		String[][] a2D = { {"a1", "a2"}, {"a3", "a4"}, {"a5", "a6"}};
		
		Arrays.stream(a2D) // Stream<String[]>
			.flatMap(a1D -> Arrays.stream(a1D)) //Stream<T>
			.forEach(System.out::println);
	}
	
}

package view.stream;

import java.util.Arrays;
import java.util.List;

import bean.Player;
import model.DataModel;

public class Ex06StreamMapFlat {

	public static void main(String[] args) {
		
		// Collection<T> -> Stream<T> .. từng phần tử trong stream là từng T
		
		// Collection<Collection<T>> -> Stream<Collection<T>> ... từng phần tử là từng collection
		
		List<Player> players = DataModel.getPlayers();
		
		// Tìm những quân hai còn lại của những người chơi bị thua 
		
		players.stream()						//Stream<Player>
		.filter(p -> p.isStatus() == false)		//Stream<Player> == thua
		.map(Player::getCards)					//từ Player mapping qua List<String> là các Cards ( Stream<List<String>>
		.flatMap(cards -> cards.stream())		// Làm phẳng thành mảng 1 chiều (từ 2 chiều)
		.filter(card -> card.startsWith("hai"))
		.forEach(System.out::println);
		
		
		//Stream<Collection<T>> --> stream(collection --> collection.stream()) --> Stream<T>
		
		//Stream<T[]> --> stream(az -> Arrays.stream(az)) --> Stream<T>
		
		String[][] a2D = {{"a1", "a2"}, {"a3", "a4"}, {"a5", "a6"}};
		Arrays.stream(a2D)						//Stream<String[]>
		.flatMap(a1D -> Arrays.stream(a1D))		//Stream<T> //Arrays::stream
		.forEach(System.out::println);
	}
}

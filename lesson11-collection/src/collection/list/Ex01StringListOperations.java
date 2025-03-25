package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01StringListOperations {
	
	public static void main(String[] args) {
		List<String> list = mockData();
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		list.forEach(s -> {
			System.out.println(s + " ** ");
		});
		
		System.out.println();
	}

	
	private static List<String> mockData() {
		List<String> list = new ArrayList<>();
		
		list.add("b22");
		list.add("k22");
		list.add("bg2");
		list.add("k3");
		list.add("t98");
		list.add("k33");
		list.add("ad5");
		list.add("k10");
		list.add("b52");
		
		return list;
	}
}

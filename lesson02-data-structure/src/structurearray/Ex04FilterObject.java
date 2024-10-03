package structurearray;

import java.util.Arrays;

import bean.Item;

public class Ex04FilterObject {
	public static void main(String[] args) {

		Item it1 = new Item(1, 'A', 720);
		Item it2 = new Item(2, 'B', 120);
		Item it3 = new Item(3, 'C', 320);
		Item[] items = { it1, it2, it3 };
		Item[] result = findPrice(items);
		System.out.println("Result: " + Arrays.toString(result));

	}

	// Tìm những mặt hàng có giá trị lớn hơn 200
	private static Item[] findPrice(Item[] elements) {
		Item[] result = new Item[elements.length];
		int count = 0;
		for (Item element : elements) {
			if (element.salesPrice > 200) {
				elements[count] = element;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}

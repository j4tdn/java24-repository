package view;

import static utils.InputUtils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import bean.CDShop;
import model.ModelCDShop;

public class Ex02ManagementCDShop {

	public static void main(String[] args) {
		var cd = ModelCDShop.getCDShop();
//		addNewCD(cd);
		System.out.println("Số lượng CD có trong danh sách: " + cd.size());
		System.out.println("Tổng giá thành của các CD là: " + totalPrice(cd));

		// sortDescById(cd);

		sortDescByPrice(cd);
	}

	private static void addNewCD(Map<Integer, CDShop> cd) {
		int id = inputInt("\nNhập mã CD: ");
		String type = inputString("Nhập loại CD: ");
		String single = inputString("Nhập tên ca sỹ: ");
		int amountOfSong = inputInt("Nhập số lượng bài hát: ");
		double price = inputDouble("Nhập giá: ");
		CDShop newCD = new CDShop(id, type, single, amountOfSong, price);
		if (cd.containsKey(id)) {
			System.out.println("Id đã tồn tại, thêm thất bại!!");
		} else {
			System.out.println("Thêm thành công");
			cd.put(newCD.getCDId(), newCD);
		}
	}

	private static double totalPrice(Map<Integer, CDShop> cd) {
		double price = 0;
		for (Map.Entry<Integer, CDShop> entry : cd.entrySet()) {
			CDShop value = entry.getValue();
			price += value.getPrice();
		}
		return price;
	}

	private static void sortDescByPrice(Map<Integer, CDShop> cd) {
		List<Map.Entry<Integer, CDShop>> listCD = new ArrayList<>(cd.entrySet());
//		System.out.println("size lisstCD: " + listCD.size());

		// vì đưa vào map nên default đã sort asc Map listCD <id, CDShop>
		System.out.println("CD trước khi sort:");
		for (Map.Entry<Integer, CDShop> entry : listCD) {
			System.out.println(entry.getValue());
		}
		listCD.sort((l1, l2) -> Double.compare(l1.getValue().getPrice(), l2.getValue().getPrice()));

		System.out.println("CD sau khi sort:");
		for (Map.Entry<Integer, CDShop> entry : listCD) {
			System.out.println(entry.getValue());
		}
	}

	private static void sortDescById(Map<Integer, CDShop> cd) {
		List<Map.Entry<Integer, CDShop>> listCD = new ArrayList<>(cd.entrySet());
//		System.out.println("size lisstCD: " + listCD.size());

		// vì đưa vào map nên default đã sort asc Map listCD <id, CDShop>
//		System.out.println("Mã CD trước khi sort:");
//		for (Map.Entry<Integer, CDShop> entry : listCD) {
//			System.out.println(entry.getValue());
//		}
		listCD.sort((l1, l2) -> Integer.compare(l2.getValue().getCDId(), l1.getValue().getCDId()));

		System.out.println("Mã CD sau khi sort:");
		for (Map.Entry<Integer, CDShop> entry : listCD) {
			System.out.println(entry.getValue());
		}
	}
}

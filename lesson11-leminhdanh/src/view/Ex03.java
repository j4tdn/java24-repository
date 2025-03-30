package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import bean.StoreCD;

public class Ex03 {
	public static void main(String[] args) {
		List<StoreCD> cdList = new ArrayList<>();
		cdList.add(new StoreCD(1, "Pop", "Taylor Swift", 12, 15.99));
		cdList.add(new StoreCD(2, "Rock", "Imagine Dragons", 10, 17.50));
		cdList.add(new StoreCD(3, "Jazz", "Norah Jones", 9, 14.75));
		cdList.add(new StoreCD(4, "Hip Hop", "Drake", 13, 16.20));
		cdList.add(new StoreCD(5, "Country", "Luke Combs", 11, 13.99));
		cdList.add(new StoreCD(6, "EDM", "Martin Garrix", 8, 18.00));
		cdList.add(new StoreCD(8, "R&B", "The Weeknd", 10, 19.99));
		cdList.add(new StoreCD(9, "Classical", "Ludovico Einaudi", 7, 12.50));
		cdList.add(new StoreCD(10, "Latin", "Bad Bunny", 12, 21.00));

		addCD(new StoreCD(7, "K-Pop", "BTS", 14, 20.00), cdList);
		addCD(new StoreCD(8, "K-Pop", "BTS", 14, 20.00), cdList);
		generate(cdList);

		System.out.println("\n===============================\n");
		System.out.println("so phan tu trong danh sach: " + getCDCount(cdList));
		
		System.out.println("\n===============================\n");
		System.out.println("sắp xếp danh sách giảm dần theo giá thành.");
		sortByPriceDesc(cdList);
		generate(cdList);

		System.out.println("\n===============================\n");
		System.out.println("sắp xếp danh sách tĕng dần theo mã CD.");
		sortByCDIdAsc(cdList);
		generate(cdList);
	}

	private static <E> void generate(Collection<E> elements) {
		elements.forEach(s -> {
			System.out.println(s.toString());
		});
	}

	public static boolean addCD(StoreCD newCD, List<StoreCD> cdList) {
		for (StoreCD cd : cdList) {
			if (cd.getCdId() == newCD.getCdId()) {
				return false;
			}
		}
		cdList.add(newCD);
		return true;

	}

	private static int getCDCount(List<StoreCD> elements) {
		return elements.size();
	}

	public Double getTotalPrice(List<StoreCD> cdList) {
		Double result = 0d;
		for (StoreCD cd : cdList) {
			result += cd.getPrice();
		}
		return result;
	}

	public static void sortByPriceDesc(List<StoreCD> cdList) {
		cdList.sort((a, b) -> {
			return a.getPrice().compareTo(b.getPrice());
		});
	}

	public static void sortByCDIdAsc(List<StoreCD> cdList) {
		cdList.sort((a, b) -> {
			return a.getCdId().compareTo(b.getCdId());
		});
	}

}
package view;

import static model.DataModel.getCDDisk;
import static utils.CollectionUtils.generate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bean.CDDisk;

public class Ex02storeManagement {
	
	public static void main(String[] args) {
		
		List<CDDisk> cd = getCDDisk();
		
		generate("Danh sách đĩa CD", cd);
		
		addCD(cd, new CDDisk(111, "a", "as",12, 12d));
		
		
		System.out.println("So luong dia CD = "+ cd.size());

		System.out.println("Tong gia tri dia CD = "+ sumOfCD(cd));
		
		
		sortByPrice(cd, (a,b)-> {
			return Double.compare(a, b);
		});
		sortByID(cd, (a,b)-> {
			return Integer.compare(a, b);
		});
		
		
		
	}
	private static  void addCD(List<CDDisk> list, CDDisk target) {
		if (!(list.contains(target))) {
			list.add(target);
			System.out.println("Da them thanh cong");
			generate("Danh sach sau khi add", list);
		} else {
			System.out.println("Dia CD co ID "+ target.getId()+ " da ton tai");
		}
		
		}
	
	private static Integer sumOfCD(List<CDDisk> list) {
		int sum = 0;
		for (CDDisk cd : list) {
			sum += cd.getPrice();
		}
		return sum;
	}
	private static void sortByPrice (List<CDDisk> list, Comparator<? super Double> o) {
		List<Double> prices = new ArrayList<>();
		for (CDDisk price : list) {
			prices.add(price.getPrice());
	}
		prices.sort(o);
		generate("Danh sach sort theo Price", prices);
	}
	private static void sortByID (List<CDDisk> list, Comparator<? super Integer> o) {
		List<Integer> prices = new ArrayList<>();
		for (CDDisk price : list) {
			prices.add(price.getId());
		}
		prices.sort(o);
		generate("Danh sach sort theo ID", prices);
	}
	
	
	
	

}

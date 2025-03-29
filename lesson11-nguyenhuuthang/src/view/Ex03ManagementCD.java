package view;

import static utils.CollectionUtils.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import bean.Disk;
import model.DataModel;

public class Ex03ManagementCD {
	
	/*
	- Viết phương thức thêm 1 CD vào danh sách, thêm thành công nếu không trùng mã CD.
	- Tìm số lượng CD có trong danh sách.
	- Tình tổng giá thành của các CD.
	- Viết phương thức sắp xếp danh sách giảm dần theo giá thành.
	- Viết phương thức sắp xếp danh sách tĕng dần theo mã CD.
	  
	  
	 */	
	
	public static void main(String[] args) {
		var disks = DataModel.getDisks();
		
		generate("Danh sach dia>>>", disks);
		addDisk(disks, new Disk(10, "Pop", "JD", 10, 100.0));
		generate("Danh sach dia>>>", disks);
		System.out.println("So luong>>> " + disks.size());
		System.out.println("TOng gia>>> " + sumPriceOfDisks(disks));
		System.out.println("Sap xep theo gia thanh>>> ");
		
		List<Disk> sortPrice = new ArrayList<>(disks);
		sortPrice.sort((s1, s2) -> s2.getPrice().compareTo(s1.getPrice()));
		generate("\nDs sau khi da sap xep theo gia>>>", sortPrice);
		sortPrice.sort((s1, s2) -> s1.getId() - s2.getId());
		generate("\nDs sau khi da sap xep theo ma CD>>>", sortPrice);
	}
	
	private static void addDisk(Collection<Disk> collections, Disk disk) {
		boolean res = collections.add(disk);
		if (res) System.out.println("Them thanh cong.");
		else System.out.println("Them that bai do trung id!!!");		
	}
	
	private static Double sumPriceOfDisks(Collection<Disk> disks) {
		Double sum = 0.0;
		for (Disk collection : disks) {
			sum += collection.getPrice();
		}
		return sum;
	}
	
	

}

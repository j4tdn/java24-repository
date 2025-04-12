package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

import java.util.List;
import java.util.Set;

import bean.CdDisk;
import static utils.CollectionUtils.*;
import model.DataModel;

public class Ex02 {


	public static void main(String[] args) {

		List<CdDisk> disks = DataModel.getDataCdDisk();
		
		generate("Danh sách đĩa: ", disks);
		
		CdDisk cd1 = new CdDisk(101, "Pop", "Taylor Swift", 10, 250000.0);

		addCd(disks, cd1);
		
		generate("Danh sách đĩa: ", disks);
		
		System.out.println("Số lượng CD: " + disks.size());
		
		System.out.println("Tổng gái trị của các CD: " + sumOfCost(disks) + "$");
		
		generate("Xếp danh sách giảm dần theo giá thành: ", sortingCd(disks, (t1,t2) -> Double.compare(t2.getValue(), t1.getValue())));	
		
		generate("Xếp danh sách tăng dần theo mã CD.", sortingCd(disks, (t1,t2) -> Integer.compare(t1.getId(), t2.getId())));
	}
	
	private static void addCd (List<CdDisk> disks, CdDisk disk) {
			if(!disks.contains(disk)) {
				disks.add(disk);
				System.out.println("Thêm thành công");
			} else {
				System.out.println("Bị trùng");
			}
	}
	
	private static double sumOfCost(List<CdDisk> disks) {
		double sum = 0;
		
		for(CdDisk disk:disks) {
			sum = sum + disk.getValue();
		}
		return sum;
	}
	
	private static List<CdDisk> sortingCd(List<CdDisk> disks, Comparator<CdDisk> comparator) {
		disks.sort(comparator);
		return disks;
	}
}

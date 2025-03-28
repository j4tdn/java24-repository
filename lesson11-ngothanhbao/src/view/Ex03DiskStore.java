package view;

import static model.DataModel.getCDInf;
import static utils.CollectionUtils.generate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import bean.Disk;
public class Ex03DiskStore {
	private static int idDisk;
	private static String typeDisk;
	private static String artist;
	private static int amount;
	private static Double salesPrice;
	
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		
		Set<Disk> diskStore = getCDInf();
		
		addDisk(diskStore);
		System.out.println("So luong: " + diskStore.size());
		System.out.println("Tong tien: " + sumOfPrice(diskStore));
		
		generate("Sap xep theo salesPrice giam dan", 
				sortDisk(diskStore,(o1, o2) -> o2.getSalesPrice().compareTo(o1.getSalesPrice())));
		
		generate("Sap xep theo idDisk tang dan",
				sortDisk(diskStore, (o1, o2) -> o1.getIdDisk() - o2.getIdDisk()));
	}
	
	private static void addDisk(Set<Disk> sources) {
		System.out.print("Nhap id: ");
		idDisk = Integer.parseInt(ip.nextLine());
		System.out.print("Nhap the loai: ");
		typeDisk = ip.nextLine();
		System.out.print("Nhap nghe si: ");
		artist = ip.nextLine();
		System.out.print("Nhap so luong: ");
		amount = Integer.parseInt(ip.nextLine());
		System.out.print("Nhap gia ban: ");
		salesPrice = Double.parseDouble(ip.nextLine());
		ip.close();
		Disk ndisk = new Disk(idDisk, typeDisk, artist, amount, salesPrice);
		if(sources.add(ndisk)) {
			System.out.println("Them thanh cong");
		} else {
			System.out.println("Da ton tai");
		}
	}
	
	private static Double sumOfPrice(Set<Disk> sources) {
		Double sum = 0d;
		for(Disk source : sources) {
			sum += source.getSalesPrice();
		}
		return sum;
		
	}
	
	private static List<Disk> sortDisk(Set<Disk> sources,Comparator<Disk> comparator) {
		List<Disk> res = new ArrayList<>();
		for(Disk source : sources) {
			res.add(source);
		}
		res.sort(comparator);
		return res;
	}

	
}

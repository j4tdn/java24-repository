package view;

import bean.Vehice;

public class Ex02Vehice {
	
	public static void main(String[] args) {
		
		Vehice v1 = new Vehice("Nguyễn Văn Tùng", "Sirius", 100, 30000000);
		Vehice v2 = new Vehice("Lê Hữu Toàn", "Jupiter", 120, 35000000);
		Vehice v3 = new Vehice("Đoàn Văn Tuấn", "Mercedes", 1000, 1000000000);
		Vehice v4 = new Vehice("Bách Minh Đạt", "Suzuki", 200, 40000000);
		Vehice v5 = new Vehice("Lê Thị Tuyết", "SuperCup", 50, 20000000);
		
		Vehice[] vehices = {v1,v2,v3,v4,v5};
		
		System.out.printf("%-20s %-20s %10s %20s %20s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá",
				"Thuế phải nộp");
		System.out.println(
				"==================================================================================================");
		for (Vehice vehice : vehices) {
			System.out.printf("%-20s %-20s %10d %20.2f %20.2f\n", 
					vehice.getOwner(),
					vehice.getType(), 
					vehice.getVolume(),
					vehice.getPrice(), 
					vehice.getTax());
							
		}		
	}

}

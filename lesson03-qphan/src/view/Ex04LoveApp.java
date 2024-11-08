package view;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

import bean.Player;

public class Ex04LoveApp {
	
	public static void main(String[] args) {
		String[] choices = {"Bóng đá", "Bóng chuyền", 
				"Cầu lông", "Chạy bộ", "Bơi lội", "Tập thể dục",
				"Chơi game", "Đọc sách", "Đi dạo", "Chèo thuyền"};
		
		Player p1 = new Player(
				"Lê Văn Tèo", 
				true, 
				"Đà Nẵng", 
				new String[] {choices[0], choices[1], choices[2], choices[6], choices[4], choices[8]}, 
				LocalDate.of(2002, 11, 30));
		
		Player p2 = new Player(
				"Lê Thị A", 
				false, 
				"Đà Nẵng", 
				new String[] {choices[0], choices[1], choices[2], choices[6], choices[5]}, 
				LocalDate.of(2004, 11, 28));
		
		System.out.println("Kiểm tra hợp nhau không --> " + isValid(p1, p2));
		
	}
	
	private static boolean isValid(Player p1, Player p2) {
		// Điều kiện để 2 người đến với nhau
		
		// + Khác giới tính
		if (p1.getGender() == p2.getGender()) {
			System.err.println(">>> Trùng giới tính");
			return false;
		}
		
		// + Hơn kém nhau không quá 8 tuổi
		LocalDate younger = p1.getDateOfBirth();
		LocalDate older = p2.getDateOfBirth();
		if (younger.isAfter(older)) {
			younger = p2.getDateOfBirth();
			older = p1.getDateOfBirth();
		}
		
		int yearDiff = Period.between(younger, older).getYears();
		if (yearDiff > 8) {
			System.err.println(">>> Chênh nhau hơn 8 tuổi");
			return false;
		}
		
		// + Có chung >= 4 sở thích
		// + Các sở thích sau có thể xem là như nhau: múa hát, Múa Hát, mua hat, MUA HAT
		String[] dupHobbies = getDupHobbies(p1, p2);
		
		if(dupHobbies.length < 4) {
			System.err.println("Yêu cầu chung ít nhất 4 sở thích");
			return false;
		}
		
		return true;
	}
	
	private static String[] getDupHobbies(Player p1, Player p2) {
		String[] p1Hobbies = p1.getHobbies();
		String[] p2Hobbies = p2.getHobbies();
		
		// {Bóng đá, Cầu lông, Chơi game, null, null}
		String[] result = new String[Math.min(p1Hobbies.length, p2Hobbies.length)];
		int count = 0; // Số ptu thật sự muốn đưa/lưu vào result
		
		for (String p1Hobby: p1Hobbies) {
			if (isExist(p1Hobby, p2Hobbies)) {
				result[count] = p1Hobby;
				count++;
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
	
	// == --> 100% so sánh ở stack
	// equals: sử dụng mặc định từ class Object --> 
	
	private static boolean isExist(String checkingElement, String[] elements) {
		for (String element: elements) {
			// xử lý nhiều hơn
			if (element.equals(checkingElement)) {
				return true;
			}
		}
		return false;
	}
	
}

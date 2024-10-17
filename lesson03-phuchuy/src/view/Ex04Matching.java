package view;

import java.time.LocalDate;

import bean.Person;
import utils.MatchingCheck;

public class Ex04Matching {
	public static void main(String[] args) {

		final Person p1 = new Person("Nguyễn Phúc Huy", "Nam", "Quảng Nam",
				new String[] { "Hát", "Nghe nhạc", "Đá bóng", "Game", "Phim", "Ăn", "Ngủ", },
				LocalDate.of(2003, 1, 12));

		final Person p2 = new Person("Nguyễn Thị Ngân Hà ", "Nữ", "Huế",
				new String[] { "Ăn", "Ngủ", "Chụp ảnh", "phIm" }, LocalDate.of(2003, 5, 19));

		MatchingCheck.Check(p1, p2);

	}
}

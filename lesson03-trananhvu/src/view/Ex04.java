package view;

import java.time.LocalDate;

import bean.Person;
import utils.MatchUtils;

public class Ex04 {
	public static void main(String[] args) {

		Person p1 = new Person("Anh Vũ", "Nam", "Viet Nam", new String[] { new String("chơi game"),
				new String("mÚa háT"), new String("đạp vịt"), new String("dua xe") }, LocalDate.of(2003, 02, 27));
		Person p2 = new Person("Anh Vũ Trần", "Nữ", "Hue", new String[] { new String("chƠi gaMe"),
				new String("múa hát"), new String("dap vit"), new String("đua xe") }, LocalDate.of(2012, 02, 27));
		MatchUtils.export(new Person[] { p1, p2 });
	}
}

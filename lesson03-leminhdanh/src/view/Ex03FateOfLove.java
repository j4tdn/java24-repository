package view;

import java.time.LocalDate;

import bean.Person;
import utils.Export;
import utils.UtilsString;

public class Ex03FateOfLove {
	public static void main(String[] args) {
		final Person p1 = new Person("Le Van A", "male", "da nang",
				new String[] { "Doc SaCh", "da Bong", "choi game", "dA cau", "daNh dần" }, LocalDate.of(2003, 3, 17));
		final Person p2 = new Person("Nguyen Van B", "female", "da nang",
				new String[] { "Doc Sach", "da Bong", "choi game", "da cAu", "daNh dàn" }, LocalDate.of(2003, 6, 8));

		Export.export(p1, p2, UtilsString.matching(p1, p2));
	}
}

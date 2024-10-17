package view;

import java.time.LocalDate;

import bean.Person;
import utils.LoveUtils;

public class Ex04FallInLove {

	public static void main(String[] args) {
		
		Person Z1 = new Person("Nguyễn Văn Tuấn","Nam","Đà Nẵng", new String[] {"bóng đá","ca hát","nhảy","bida","bóng rổ"}, LocalDate.of(1997, 6, 12));
		Person Z2 = new Person("Lê Thị Tuyết","Nữ","Huế", new String[] {"ca hát","bóng đá","make up","đi dạo","bóng rổ","nhảy"}, LocalDate.of(2000, 8, 20));
		LoveUtils.checkConditions(Z1, Z2);

	}
}
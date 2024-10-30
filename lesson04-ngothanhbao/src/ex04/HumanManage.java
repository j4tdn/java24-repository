package ex04;

import java.time.LocalDate;
import java.time.Month;

import bean.Leader;
import bean.Manager;
import bean.Staff;

public class HumanManage {

	
	public static void main(String[] args) {
		
		
		Staff st1 = new Staff("An", LocalDate.of(1998, Month.OCTOBER, 10), 5d, "VP1", "Nam");
		Staff st2 = new Staff("Bao", LocalDate.of(2000, Month.APRIL, 2), 6d, "VP2", "Dung");
		Staff st3 = new Staff("Chau", LocalDate.of(2002, Month.AUGUST, 23), 7d, "VP2", "Dung");
		Staff st4 = new Staff("Danh", LocalDate.of(1996, Month.FEBRUARY, 14), 8d, "VP1", "Nam");
		Staff st5 = new Staff("Giang", LocalDate.of(1994, Month.JULY, 5), 9d, "VP1", "Nam");
		Staff st6 = new Staff("Hung", LocalDate.of(1992, Month.JANUARY, 30), 4d, "VP2", "Dung");
		
		Leader ld1 = new Leader("Nam", LocalDate.of(1990, Month.AUGUST, 20), 13d, 0d, "VP1");
		Leader ld2 = new Leader("Dung", LocalDate.of(1989, Month.SEPTEMBER, 27), 13d, 5d, "VP2");
		
		Manager mg1 = new Manager("Manh", LocalDate.of(1980, Month.MARCH, 24), 30d, 5d);
		
		
		
		
		System.out.printf("Tien luong st1: %.0f \n" , st1.salaryInDouble());
		System.out.printf("Tien luong st2: %.0f \n" , st2.salaryInDouble());
		System.out.printf("Tien luong st3: %.0f \n" , st3.salaryInDouble());
		System.out.printf("Tien luong st4: %.0f \n" , st4.salaryInDouble());
		System.out.printf("Tien luong st5: %.0f \n" , st5.salaryInDouble());
		System.out.printf("Tien luong st6: %.0f \n" , st6.salaryInDouble());
		System.out.printf("Tien luong ld1: %.0f \n", ld1.salaryInDouble());
		System.out.printf("Tien luong ld2: %.0f \n", ld2.salaryInDouble());
		System.out.printf("Tien luong mg1: %.0f", mg1.salaryInDouble());
	}

}

package live.demo;

import java.time.LocalDate;

public class Management {
	Director d1 = new Director("Anh Vu", LocalDate.of(2003, 02, 27), 2, 5);
	Manager m1 = new Manager("Tran Vu 1", LocalDate.of(2003, 02, 27), 2, 3, "A");
	Manager m2 = new Manager("Tran Vu 2", LocalDate.of(2003, 02, 27), 2, 3, "B");
	Employee e1 = new Employee("Tran Vu 3", LocalDate.of(2003, 02, 2), 3, "C", m1);
	Employee e2 = new Employee("Tran Vu 4", LocalDate.of(2003, 02, 7), 3, "C", m2);
	Employee e3 = new Employee("Tran Vu 5", LocalDate.of(2003, 02, 21), 3, "C", m1);
	Employee e4 = new Employee("Tran Vu 6", LocalDate.of(2003, 02, 26), 3, "C", m2);
	Employee e5 = new Employee("Tran Vu 7", LocalDate.of(2003, 02, 24), 3, "C", m1);
	Employee e6 = new Employee("Tran Vu 8", LocalDate.of(2003, 02, 22), 3, "C", m2);

}

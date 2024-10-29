package view;

import bean.Manager;
import bean.Precident;
import bean.Staff;

public class Ex04 {

	public static void main(String[] args) {
		
		System.out.println("Nhan su cong ty: ");
		for(Object person : human()) {
			System.out.println(person);
		}
		
		System.out.println("\n======================\n");
		
		personManager(human());
		
		System.out.println("\n======================\n");
		
		salaryPerson(human());
		
	}
	
	private static Object[] human() {
		Precident precident = new Precident("HuuThang", "07/04/2003", 2.3d, 2d);
//		Precident[] precidents = new Precident[] {precident};
		
		Manager manager1 = new Manager("NguyenVanA", "18/11/2003", 2d, 1.8d, "Human Resourses");
		Manager manager2 = new Manager("NguyenThiVang", "15/10/2003", 1.8d, 1.8d, "Human Resourses");
//		Manager[] managers = new Manager[] {manager1, manager2};
		
		Staff staff1 = new Staff("NguyenA", "20/09/2003", 1.5d, "Batinder", "NguyenVanA");
		Staff staff2 = new Staff("NguyenB", "20/09/2003", 1.2d, "Food Service", "NguyenThiVang");
		Staff staff3 = new Staff("NguyenC", "20/09/2003", 1.2d, "Food Service", "NguyenThiVang");
		Staff staff4 = new Staff("NguyenD", "20/09/2003", 1.3d, "Clean Room", "NguyenVanA");
		Staff staff5 = new Staff("NguyenE", "20/09/2003", 1.2d, "Food Service", "NguyenThiVang");
		Staff staff6 = new Staff("NguyenF", "20/09/2003", 1.3d, "Clean Room", "NguyenThiVang");
//		Staff[] staffs = new Staff[] {staff1, staff2, staff3, staff4, staff5, staff6};
		
		Object[] human = new Object[] {precident, manager1, manager2, staff1, staff2, staff3, staff4, staff5, staff6};
		
		return human; 
	}
	
	private static void personManager(Object[] human) {
		
		for(Object person : human) {
			if(person instanceof Manager) {
				System.out.println("Name Manager: " + ((Manager) person).getName());
				personStaff(person, human);
			}
		}
	}
	
	private static void personStaff(Object manager, Object[] objects) {
		for(Object person : objects) {
			if(person instanceof Staff) {
				if(((Staff) person).getNameManager() == ((Manager) manager).getName()) {
					System.out.println(person.toString());
				}
			}
		}
	}
	
	private static void salaryPerson(Object[] human) {
		double salaryStaff = 0;
		double salaryManager = 0;
		double salaryPrecident = 0;
		for(Object person : human) {
			if(person instanceof Staff) {
				salaryStaff += ((Staff) person).salary();
			}
			if(person instanceof Manager) {
				salaryManager += ((Manager) person).salary();
			}
			if(person instanceof Precident) {
				salaryPrecident += ((Precident) person).salary();
			}
		}
		
		System.out.println("Nhan vien: Luong = " + salaryStaff);
		System.out.println("Truong phong: Luong = " + salaryManager);
		System.out.println("Giam doc: Luong = " + salaryPrecident);
	}
	
}

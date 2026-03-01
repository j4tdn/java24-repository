package view;

import service.ClassService;
import service.ClassServiceImpl;
import utils.IoUtils;
public class Ex01FindByClassId {
	private static ClassService classService;
	static {
		classService = new ClassServiceImpl();
	}
	public static void main(String[] args) {
		
		IoUtils.generate(
				"1. List all student by class id", 
				classService.findByClassId(3)
			);
	}
}

package view;

import java.util.Arrays;

import javax.swing.plaf.basic.BasicPopupMenuSeparatorUI;

import bean.Students;
import utils.HigherThan;
import utils.StudentsInput;

public class Ex01 {

	public static void main(String[] args) {

		Students s1 = new Students(106210241, "Phạm Thanh Huy", 8.5, 9.5);
		Students s2 = new Students(106210240, "Nguyễn Phúc Huy", 10d, 9d);
		Students s3 = StudentsInput.sI();
		

		Students[] sv = { s1, s2, s3 };
		System.out.print(Arrays.toString(sv));
		System.out.println("==========================");
		
		HigherThan.h85(s1, s2, s3);
		HigherThan.HP(s1, s2, s3);
	}

}

package nguyenthilannhu.Ex01;

import java.util.Objects;

public class Student {
	// Những cái a hướng dẫn đâu hết rồi :(
	// Vì sao lại code như thế này
	
      int id;
      String name;
      char grade;
	
      public Student(int id, String name, char grade) {
      this.id = id;
      this.name = name;
      this.grade = grade;
      
      
}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
}
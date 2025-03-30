package view;

import functional.TestRunnable;

public class Ex01UsingLocalVariableFromLambda {
	
	/*
	 Việc sử dụng các biến toàn cục/cục bộ bên trong lambda 
	 Lý thuyết
	 Khi có class A có hàm M chứa biểu thức lambda
	   --> lambda có thể sử dụng tất cả 
	       + các biến toàn cục của class A : không có bất kỳ giới hạn nào
	       + các biến cục bộ trong method M: các biến cục bộ đó ngầm định là final(ko thể gán = lại được)
	 */
	
	public static String author = "Admin";
	
	public static void main(String[] args) {
		testing01(10);
		
		System.out.println("\n=========================\n");
		
		testing02(10);
	}
	
	public static void testing01(int duration) {
		// local variable
		String taskName = "TaskExecutor";
		
		// tạo functional interface sử dụng lambda
		Runnable runnable = () -> {
			author = "PublicUser";
			
			// Local variable duration defined in an enclosing scope must be final or effectively final
			// duration = 22;
			// taskName = "RandomTask";
			
			// Sử dụng được cả local/global variables
			System.out.println(taskName + " should be implemented about " + duration + "(s)");
			System.out.println("By --> " + author);
		};
		
		// gọi abstract method bên trong functional interface
		runnable.run();
	}
	
	public static void testing02(int duration) {
		// local variable
		String taskName = "TaskExecutor";
		
		// tạo functional interface sử dụng lambda
		// khi truyền tham số qua hàm, ko bao giờ tham số có thể cập nhật giá trị ở stack
		Runnable runnable = new TestRunnable(taskName, duration);
		
		// gọi abstract method bên trong functional interface
		runnable.run();
	}
	
}

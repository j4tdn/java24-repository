package view;

public class Ex01UsingLocalVariableFromLambda {
	/*
	 Việc sú dụng các biến toàn cục, cục bộ trong lambda
	 Lý thuyết:
	 + Khi có class A có hàm M chứa biểu thức Lambda
	 	--> lambda có thể sử dụng tất cả 
	 			+ các biến toàn cục của class A: không có bất kỳ giới hạn nào
	 			+ các biến cục bộ trong method M: các biến cục bộ đó ngầm định là final
	 	*/
	public static String author = "hehe";
	
	public static void main(String[] args) {
		testing(10);
		
	}
	
	public static void testing(int duration) {
		// local variable
		String taskName = "TaskExecutor";
		
		// tạo functional interface sử dụng lambda
		Runnable runnable = () -> {
			System.out.println(taskName + " should be implemented about " + duration + "(s)");
		};
		
		// gọi absstract method bên trong functional interface
		runnable.run();
	}

}

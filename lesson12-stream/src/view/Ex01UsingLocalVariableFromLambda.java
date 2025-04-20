package view;

public class Ex01UsingLocalVariableFromLambda {

	/*
	 Việc sử dụng các biến toàn cục/ cục bộ bên trong lambda
	  
	 Lý thuyết
	+ khi có 1 class A có hàm M chứa biểu thức trong lambda 
	  ---> lambda có thể sử dụng tất cả:
	 + các biến toàn cục của class A : không có giới hạn nào
	 + các biến cục bộ trong method M: các biến cục bộ đó sẽ đc ngầm định là fina (ko thể cập nhập STACK, ko gán = được)
	 
	 
	 
	 *** 1 lambda có thể truy cập biến toàn cục của class khác ko giới hạn 
	 *** tuy nhiên lambda với class hiện tại là 2 class khác nhau, ko thể cập nhập được giá trị của biến trong hàm class hiện tại
	 */
	public static String author = "admin";
	public static void main(String[] args) {
		testing(10);
		
		testing(22);
		
		
	}
	public static void testing(int duration) {
		//local variable
		String taskName = "TaskExecutor";
		//tạo functional inteface sử dụng lambda
		Runnable runnable = () -> {
			author = "User";
			System.out.println(taskName + " should be implemented about :"+ duration + "(s)");
			System.out.println("by ---> "+ author);
		};
		// gọi abstract method
		runnable.run();
	}
}

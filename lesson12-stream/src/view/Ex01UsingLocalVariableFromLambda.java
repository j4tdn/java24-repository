package view;

public class Ex01UsingLocalVariableFromLambda {
	
	private static String author = "Admin";
	
	
	public static void main(String[] args) {
		
		testing(10);
		
	}
	
	
	/*
	 Hình dung lambda trong function là 1 class khác, mà đã là class khác thì 
	 vẫn có thể truy cập được các biến toàn cục của class và biến cục bộ của 
	 function, nhma vì là class khác nên muốn dùng lại thì phải truyền vào, tại vì
	 trong trường hợp này nó cùng class nên không cần truyền vào. Như là 1 class khác
	 vậy nên chỉ được truy cập chứ k cập nhật được địa chỉ ở stack.
	 * */
	
	public static void testing(int duration) {
//		Local variable
		String taskName = "TaskExecutor";
		
//		Tao functional interface su dung lambda
		Runnable runable = () -> {
			
//			Local variable duration defined in an enclosing ...
//			duration = 22;
//			taskName = "RandomTask";
			
//			Su dung duoc ca local/global variables
			System.out.println(taskName + " Should be implemented about " + duration + "(s)");
			System.out.println("By ---> " + author);
		};
		
//		goi abstract method ben trong functional interface
		runable.run();
	}
	
}

package functional;

import view.Ex01UsingLocalVariableFromLambda;

public class TestRunnable implements Runnable {

	private String taskName;
	private int duration;
	
		

	@Override
	public void run() {
		// local variable
		String taskName = "PublicUser";
		// tạo functional inteface sử dụng lambda
		duration = 22;
		taskName = "User";
			
			System.out.println(taskName + " should be implemented about :" + duration + "(s)");
			System.out.println("by ---> " + Ex01UsingLocalVariableFromLambda.author);

	}
}


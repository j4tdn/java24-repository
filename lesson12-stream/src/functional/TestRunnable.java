package functional;

import view.Ex01UsingLocalVariableFromLambda;

public class TestRunnable implements Runnable {
	
	private String taskName;
	private int duration;
	
	public TestRunnable(String taskName, int duration) {
		this.taskName = taskName;
		this.duration = duration;
	}
	
	@Override
	public void run() {
		Ex01UsingLocalVariableFromLambda.author = "PublicUser";
		
		// Local variable duration defined in an enclosing scope must be final or effectively final
		duration = 22;
		taskName = "RandomTask";
		
		// Sử dụng được cả local/global variables
		System.out.println(taskName + " should be implemented about " + duration + "(s)");
		System.out.println("By --> " + Ex01UsingLocalVariableFromLambda.author);
	}
	
}

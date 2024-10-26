package inheritance.abstractclass;

public abstract class EmailService {
	
	
	public abstract void login();
	
	void login2Steps() {
		System.out.println("EmailService#optional");
	}
	
}

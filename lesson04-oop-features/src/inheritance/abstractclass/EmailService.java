package inheritance.abstractclass;

public abstract class EmailService {
	
	abstract void login();
	
	void login2Step() {
		System.out.println("EmailService#optional ...");
	}

}

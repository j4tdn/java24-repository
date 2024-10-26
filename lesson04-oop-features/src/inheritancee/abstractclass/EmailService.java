package inheritancee.abstractclass;

public abstract class EmailService {
	abstract void login();

	void login2steps() {
		System.out.println("EmailService#optional...");
	}
}

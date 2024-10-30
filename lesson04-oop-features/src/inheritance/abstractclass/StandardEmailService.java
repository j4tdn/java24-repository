package inheritance.abstractclass;

public class StandardEmailService extends Emailservice{

	@Override
	void login() {
		
		System.out.println("StandardEmailService#login");
	}
}

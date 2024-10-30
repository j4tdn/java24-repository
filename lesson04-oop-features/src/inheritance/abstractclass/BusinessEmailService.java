package inheritance.abstractclass;

public class BusinessEmailService extends Emailservice{
	
	@Override
	void login() {
		
		System.out.println("BusinessEmailService#login");
	}

	@Override
	void login2Steps() {
		
		System.out.println("BusinessEmailServi#login2Steps");
	}
}

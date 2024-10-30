package inheritance.abstractclass;

public class BusinessEmailService extends EmailService {

	@Override
	void login() {
		System.out.println("BusinessEmailServiceLogin");
		
	}
	
	@Override
	void login2Steps() {
		
		System.out.println("BusinessEmailServiceLogin2Steps");
	}
}


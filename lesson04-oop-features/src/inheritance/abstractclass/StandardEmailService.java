package inheritance.abstractclass;

public class StandardEmailService extends EmailService{
	
	@Override
	public void login() {
		System.out.println("StandardEmailServiec#login");
	}
	
}

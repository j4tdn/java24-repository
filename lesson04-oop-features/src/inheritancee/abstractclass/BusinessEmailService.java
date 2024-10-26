package inheritancee.abstractclass;

public class BusinessEmailService extends EmailService {
	@Override
	void login() {
		System.out.println("BusinessEmailService#login");

	}

	@Override
	void login2steps() {
		System.out.println("BusinessEmailService#login2steps");
	}
}

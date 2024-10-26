package inheritancee.abstractclass;

public class Ex01InheritanceAbstractClassDemo {
	public static void main(String[] args) {
		EmailService em1 = new StandardEmailService();

		// Anonymous class
		EmailService em2 = new EmailService() {

			@Override
			void login() {
				// TODO Auto-generated method stub

			}
		};
	}
}

package inheritance.abstractclass;

public class Ex01InheritanceAbstactclassDemo {
	
	public static void main(String[] args) {
		
		Emailservice em1 = new StandardEmailService();
		
		Emailservice em2 = new Emailservice() {
			
			@Override
			void login() {
				
				System.out.println("Anonymous em2 # login");
			}
		};
		
		em2.login();
		em2.login2Steps();
	}

}

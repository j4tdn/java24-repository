package lesson06_nguyenhuynhnhatduy;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {
        try {
            String email = checkEmail();
            System.out.println("Valid email: " + email);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static String checkEmail() {
        Scanner sc = new Scanner(System.in);
        String mail;
        Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z]+(\\.[a-zA-Z]+){1,3}$");

        while (true) { 
            System.out.println("Enter your email:");
            mail = sc.nextLine();

            if (p.matcher(mail).matches()) {
           
                return mail;
            } else {
              
                System.err.println("Invalid email, please enter your email again.");
            }
        }
    }
}

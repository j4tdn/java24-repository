package view;

import exception.*;

public class Ex04 {

    private static boolean isPassword(String password, String account) {
        int count = 0;

        if (password.length() < 8 || password.length() > 256) {
            throw new RequireLengthException();
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new AtLeastAUppercaseException();
        }
        if (!password.matches(".*[0-9].*")) {
            throw new AtLeastANumberException();
        }
        if (!password.matches(".*[^a-zA-Z0-9].*")) {
            throw new AtLeastASpecialCharacterException();
        }

        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < account.length(); j++) {
                if (password.charAt(i) == account.charAt(j)) {
                    count++;
                    if (count >= 3) throw new MatchWithAccountException();
                }
            }

        }

        return true;
    }

    public static void main(String[] args) {
        String account;
        String password;

        account = "Tunizme";
        password = "Tn287020203@";

        if (isPassword(password, account)) {
            System.out.println("Dang ky thanh cong!!");
        }
    }
}

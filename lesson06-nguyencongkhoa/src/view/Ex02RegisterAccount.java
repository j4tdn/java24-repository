package view;

import java.util.Scanner;

import exception.InvalidAmountCharacters;
import exception.InvalidAmountLetterCase;
import exception.InvalidAmountNumber;
import exception.InvalidAmountSpecialCharacter;
import utils.RegexUtils;

public class Ex02RegisterAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int timesEnter = 0;

		while (timesEnter <= 5) {
			System.out.print("Enter password: ");
			String password = sc.nextLine();
			
			try {
				checkValidPassword(password);
				System.out.println("Valid password");
				break;
			} catch (InvalidAmountCharacters iac) {
				System.out.println(iac.getMessage() + "\n");
			} catch (InvalidAmountLetterCase ialc) {
				System.out.println(ialc.getMessage() + "\n");
			} catch (InvalidAmountNumber ian) {
				System.out.println(ian.getMessage() + "\n");
			} catch (InvalidAmountSpecialCharacter iasc) {
				System.out.println(iasc.getMessage() + "\n");
			}
			
			if (timesEnter == 5) {
				System.out.println("Out of allows re-enter!!");
				return;
			}		
			System.out.println("Number of enter: " + (++timesEnter) + " (Times re-enter max = 5)");
		}
	}

	private static void checkValidPassword(String password) throws InvalidAmountCharacters, InvalidAmountLetterCase,
			InvalidAmountNumber, InvalidAmountSpecialCharacter {
		if (password.length() < 8 || password.length() > 256) {
			throw new InvalidAmountCharacters();
		}

		if (!RegexUtils.hasLowerCase(password) || !RegexUtils.hasUpperCase(password)) {
			throw new InvalidAmountLetterCase();
		}

		if (!RegexUtils.hasNumber(password)) {
			throw new InvalidAmountNumber();
		}

		if (!RegexUtils.hasSpecialChracter(password)) {
			throw new InvalidAmountSpecialCharacter();
		}
	}

}

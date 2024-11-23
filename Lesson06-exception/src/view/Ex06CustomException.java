package view;

import java.io.IOException;

import exception.InvalidAgeException;

public class Ex06CustomException {
	
  public static void main(String[] args) {
	 try {
		 System.out.println("validate 18 -->" + validate(18));
	} catch (Exception e) {
		System.out.println("exp1 --> massage: " + e.getMessage());
	 }

	  try {
		  System.out.println("validate 12 -->" + validate(12));
	  }catch(InvalidAgeException e) {
		  System.out.println("exception --> message: " + e.getMessage());
		  
	  }
	  
//	  try {
//		System.out.println("Teo");
//		new File("").createNewFile();
//	} catch (IOException e) {
//		// TODO: handle exception
//	}
	
	  
}
  private static boolean validate(int age) throws InvalidAgeException{
	  if (age < 16) {
		  throw new InvalidAgeException("Age" + "is invalid, please re-enter !!");
	  }
	  return true;
  }

}

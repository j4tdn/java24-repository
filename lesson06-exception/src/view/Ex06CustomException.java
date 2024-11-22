package view;

import exception.InvalidAgeException;

public class Ex06CustomException {
    public static void main(String[] args) {
        System.out.println(validate(18));
        System.out.println(validate(12));

    }

    private static boolean validate(int age) {
        if (age < 16) throw new InvalidAgeException("Age must be at least 16");
        return true;
    }
}

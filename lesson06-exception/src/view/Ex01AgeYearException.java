package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeYearException {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        int yob = Integer.parseInt(ip.nextLine());
        int currentYear = Year.now().getValue();
        int age = currentYear - yob;

        System.out.println("So tuoi = " + age);
        ip.close();
    }



}

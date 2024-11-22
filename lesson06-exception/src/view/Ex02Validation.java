package view;

import java.time.Year;
import java.util.Scanner;

public class Ex02Validation {
    /*
    Cach 1: su dung validation
    --> dam bao doan code bi exception khong bao gio xay ra
     */

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        System.out.println("Nhap nam sinh: ");

        String text = "";

        do {
            text = ip.nextLine();
            if (text.matches("\\d+")) {
                break;
            }
            ;
            System.out.println("Nam sinh chua hop le, nhap lai: ");
        } while (true);

        int yob = Integer.parseInt(ip.nextLine());
        int currentYear = Year.now().getValue();
        int age = currentYear - yob;

        System.out.println("So tuoi = " + age);
        ip.close();
    }


}

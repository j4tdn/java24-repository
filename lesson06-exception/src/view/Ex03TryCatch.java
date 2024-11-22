package view;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {
    /*
    Cach 2: Su dung try/catch de bat loi
    + voi doan code bi exception
    + khi khong xu li loi --> gap dong loi --> dung chuong trinh
    + xu ly loi voi try/catch
        . Dat doan code co kha nang bi exception trong khoi try
        . Dat doan code xu ly trong khoi catch
        . Luu y: Chi xu ly duoc khi bat dung exception
     */
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        int yob;
        do {
            try {
                yob = Integer.parseInt(ip.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        int currentYear = Year.now().getValue();
        int age = currentYear - yob;
        System.out.println("So tuoi = " + age);

        ip.close();
    }


}

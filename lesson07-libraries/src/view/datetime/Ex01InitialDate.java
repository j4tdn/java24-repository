package view.datetime;

import java.util.Date;

public class Ex01InitialDate {
    public static void main(String[] args) {
        //Luu tru: Date, Calendar

        Date date = new Date();
        System.out.println(date);

        date = new Date(2024,10,20);
        System.out.println(date);

        date = new Date(21600000);
        System.out.println(date);
    }
}

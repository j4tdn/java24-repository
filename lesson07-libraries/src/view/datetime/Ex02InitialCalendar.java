package view.datetime;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex02InitialCalendar {
    public static void main(String[] args) {
        //Calendar nhieu loai lich(am/duong)
        //Tai mot thoi diem tao nhieu calendar thi gia tri no chi tra ve thoi gian hien tai

        Calendar cal = Calendar.getInstance();

        System.out.println("Calendar cal --> " + cal);
        System.out.println(TimeZone.getDefault());

        String [] zoneIds = TimeZone.getAvailableIDs();
        for (String zoneId : zoneIds) {
            System.out.println(zoneId);
        }

        Locale.setDefault(Locale.of("vi", "VN"));
        System.out.println(cal);
    }
}

package view.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày : ");

        String dateInput = sc.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        Date date;
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            System.out.println("Sai định dạng, nhập lại");
            sc.close();
            return;
        }

        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        
        String thuTrongTuan = new SimpleDateFormat("EEEE", new Locale("vi", "VN")).format(date);
        int ngayTrongThang = calendar.get(Calendar.DAY_OF_MONTH);
        int thang = calendar.get(Calendar.MONTH) + 1;
        int nam = calendar.get(Calendar.YEAR);

        
        int ngayTrongNam = calendar.get(Calendar.DAY_OF_YEAR);
        boolean laNamNhuan = calendar.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
        int tongSoNgayNam = laNamNhuan ? 366 : 365;
        int ngayConLai = tongSoNgayNam - ngayTrongNam;

        
        int tuanTrongThang = calendar.get(Calendar.WEEK_OF_MONTH);
        int soNgayTrongThang = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int soLanXuatHienTrongThang = demThuTrongThang(calendar, nam, thang, thuTrongTuan);

       
        System.out.println("\n===============================================");
        System.out.println("   Ngày " + ngayTrongThang + " " + layTenThang(thang) + " " + nam + " là " + thuTrongTuan);
        System.out.println("===============================================");
        System.out.println("Thông tin thêm:");
        System.out.println(" - Đây là ngày thứ " + ngayTrongNam + " của năm, còn " + ngayConLai + " ngày nữa.");
        System.out.println(" - Đây là " + thuTrongTuan + " thứ " + tuanTrongThang + " trong tổng số " + soLanXuatHienTrongThang 
                + " " + thuTrongTuan + " của tháng " + layTenThang(thang) + " " + nam + ".");
        System.out.println(" - Năm " + nam + " có " + tongSoNgayNam + " ngày.");
        System.out.println(" - Tháng " + layTenThang(thang) + " " + nam + " có " + soNgayTrongThang + " ngày.");

        sc.close();
    }

    
    private static int demThuTrongThang(Calendar calendar, int nam, int thang, String thu) {
        Calendar tempCalendar = Calendar.getInstance();
        tempCalendar.set(Calendar.YEAR, nam);
        tempCalendar.set(Calendar.MONTH, thang - 1);
        tempCalendar.set(Calendar.DAY_OF_MONTH, 1);

        int count = 0;
        while (tempCalendar.get(Calendar.MONTH) == thang - 1) {
            String ngayThu = new SimpleDateFormat("EEEE", new Locale("vi", "VN")).format(tempCalendar.getTime());
            if (ngayThu.equalsIgnoreCase(thu)) {
                count++;
            }
            tempCalendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        return count;
    }

    
    private static String layTenThang(int thang) {
        String[] thangVN = {
            "Tháng Một", "Tháng Hai", "Tháng Ba", "Tháng Tư", "Tháng Năm", "Tháng Sáu",
            "Tháng Bảy", "Tháng Tám", "Tháng Chín", "Tháng Mười", "Tháng Mười Một", "Tháng Mười Hai"
        };
        return thangVN[thang - 1];
    }
}

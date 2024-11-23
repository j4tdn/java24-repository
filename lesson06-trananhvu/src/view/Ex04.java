package view;

    /*
        Link video: https://1drv.ms/v/c/ec838824905fa95d/EZEBoonSjNpOj6_eCVRbwbwBdTFy_GaZpy6cyfy6HCgb0A?e=HjJVpK
    */

public class Ex04 {

    private static String readNumber(int hundreds, int dozens, int unit) {
        String[] numberToChar = new String[]{"Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
        String res = "";

        if(hundreds == 0) {
            res +="";
        }
        else res+=numberToChar[hundreds] + " Trăm";

        switch(dozens) {
            case 0:
                if(hundreds==0 || unit == 0) res+="";
                else res+=" Lẻ";
                break;
            case 1:
                res+=" Mười";
                break;
            default:
                res+= " " + numberToChar[dozens] + " Mươi";
                break;
        }

        switch(unit) {
            case 0:
                if(dozens == 0) res+="";
                break;
            case 1:
                if(dozens == 1 || dozens == 0) res+=" "+ numberToChar[unit];
                else res+=" Mốt";
                break;
            case 5:
                if(dozens == 0) res+=" "+numberToChar[unit];
                else res+=" Lăm";
                break;
            default:
                res+= " " + numberToChar[unit];
                break;
        }

        return res;
    }

    public static void main(String[] args) {
        int number = 1;
        int unit = number%10;
        number = number/10;
        int dozens = number%10;
        number = number/10;
        int hundreds = number%10;
        System.out.println(readNumber(hundreds, dozens, unit));
    }
}

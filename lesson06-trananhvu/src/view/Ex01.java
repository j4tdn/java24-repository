package view;
import java.util.Scanner;

    /*
        Link video: https://1drv.ms/v/c/ec838824905fa95d/EZEBoonSjNpOj6_eCVRbwbwBdTFy_GaZpy6cyfy6HCgb0A?e=HjJVpK
    */

public class Ex01 {
    private static float calSol(int a, int b) {
        if(a==0) throw new ArithmeticException("Lỗi chia 0");
        return (float)-b/a;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a, b;
        float x;
        do{
            try{
                System.out.print("Nhập hệ số a: ");
                a = Integer.parseInt(ip.nextLine());
                System.out.print("Nhập hệ số b: ");
                b = Integer.parseInt(ip.nextLine());
                x = calSol(a,b);
                break;
            } catch (NumberFormatException | ArithmeticException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại hệ số hợp lệ!!!");
            }
        }while(true);

        System.out.println("Nghiệm của hệ phương trình là: " + x);
    }
}

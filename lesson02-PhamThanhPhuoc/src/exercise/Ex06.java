package exercise;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0, c = 0;
            for(int i = 0 ; i <= 2; i++ ) {
                if(i == 0) {
                    while (true) {
                        try {
                            System.out.println("Nhap vao so a: ");
                            a = Integer.parseInt(scanner.nextLine());
                            if (a < 0 || a >= 20) {
                                System.out.println("So a khong hop le, vui long nhap lai!");
                                continue;
                            }
                        } catch (Exception e) {
                            System.out.println("Bi loi, vui long nhap lai so nguyen!");
                            continue;
                        }
                        break;
                    }
                } else if(i == 1) {
                    while (true) {
                        try {
                            System.out.println("Nhap vao so b: ");
                            b = Integer.parseInt(scanner.nextLine());
                            if (b < 0 || b >= 20) {
                                System.out.println("So b khong hop le, vui long nhap lai!");
                                continue;
                            }
                        } catch (Exception e) {
                            System.out.println("Bi loi, vui long nhap lai so nguyen!");
                            continue;
                        }
                        break;
                    }
                } else if(i == 2) {
                    while (true) {
                        try {
                            System.out.println("Nhap vao so c: ");
                            c = Integer.parseInt(scanner.nextLine());
                            if (c < 0 || c >= 20) {
                                System.out.println("So c khong hop le, vui long nhap lai!");
                                continue;
                            }
                        } catch (Exception e) {
                            System.out.println("Bi loi, vui long nhap lai so nguyen!");
                            continue;
                        }
                        break;
                    }
                }
            }
        int max = 0;
        int min = 0;
        if (a > b && a > c) {
            max = a;
        } else if (b > c && b > a) {
            max = b;
        } else {
            max = c;
        }
        if (a < b && a < c) {
            min = a;
        } else if (b < c && b < a) {
            min = b;
        } else {
            min = c;
        }

        System.out.println("So lon nhat la: " + max);
        System.out.println("So nho nhat la: " + min);

        scanner.close();
    }
}

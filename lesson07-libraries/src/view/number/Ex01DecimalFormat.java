package view.number;

import java.text.DecimalFormat;

public class Ex01DecimalFormat {
    public static void main(String[] args) {
        double result = doAllocation();
        System.out.println(result);
        float r = 3236.23f;
        //Áp dụng khi tổng cả phần nguyên + thập phân = 8
        DecimalFormat df = new DecimalFormat("#,###.0000");
        System.out.println(df.format(r));
    }

    private static double doAllocation(){
        return 234.2342323543254*3523453.54452345345433432534;
    }
}

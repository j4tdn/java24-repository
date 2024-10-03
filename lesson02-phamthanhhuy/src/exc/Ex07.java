//
//
//package exc;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Ex07 {
//    public static void main(String[] args) {
//        Scanner ip = new Scanner(System.in);
//        
//        System.out.print("Nhập giá trị: ");
//        float n = ip.nextFloat(); // Sử dụng nextDouble() để nhập giá trị double
//        int[] nps = new int[12];
//        int b =  Math.round(n); // Khai báo biến i bên ngoài vòng lặp
//
//        
//       for(int i =0; n<2; i++) { 
//         n = n/2;
//         nps[i] = b % 2;
//         b = Math.round(n);
//         i++;
//        }
//        
//        
//        System.out.println("Mảng sau khi vòng lặp kết thúc: " + Arrays.toString(nps));
//        
//     
//    }
//}

package exc;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        System.out.print("Nhập giá trị: ");
        int n = ip.nextInt(); 
        int[] nps = new int[n];
        int index = 0;
        
       
        while (n >0) { 
            nps[index] = n % 2;
            n = n / 2; 
            index++;
        }

      
        int[] binaryArray = new int[index];
        for (int i = 0; i < index; i++) {
            binaryArray[i] = nps[index - 1 - i]; 
        }

      
        System.out.println("Mảng nhị phân là: " + Arrays.toString(binaryArray));
        
    }
}

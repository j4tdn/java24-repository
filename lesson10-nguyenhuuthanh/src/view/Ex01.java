
package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n (n<10) : ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        
        for(int i = 0; i < n ; i++){
            numbers[i] = (int) (Math.random()*41)+10;
        }
        System.out.println("Mảng đầu : "+Arrays.toString(numbers));
        
        int[] results = removeDupElements(numbers);
        
        System.out.println("--> n hiện tại = "+results.length);
        System.out.println("1. Mảng sau xóa phần tử trùng : "+Arrays.toString(results));
        compareAverage(numbers);
        System.out.println("3. Phần tử lớn thứ 3 trong mảng : "+threeLargetNumber(numbers));
    }
    private static int[] removeDupElements(int[] numbers){
        int n = numbers.length;
        int[] target = new int[n];
        int index = 0; 
        for(int i = 0 ; i < n ; i++){
            int count = 0; 
            for(int j = 0 ; j < n ; j++){
                if(numbers[i] == numbers[j]){
                    count++;
                }
            }
            if(count == 1){
                target[index++] = numbers[i];
            }
        }
        return Arrays.copyOf(target, index);
    }
    
    private static void compareAverage(int[] numbers){
        
        int mid = numbers.length/2;
        int sumFirstHalf=0 , sumSecondHalf = 0;
        for(int i = 0; i < mid ; i++){
            sumFirstHalf += numbers[i];
        }
        for(int i = mid ; i < numbers.length; i++){
            sumSecondHalf += numbers[i];
        }
        
        int avgFirstHalf = sumFirstHalf / mid;
        int avgSecondHalf = sumSecondHalf / numbers.length - mid;
        
        if(avgFirstHalf > avgSecondHalf){
            System.out.println("2. Nữa đầu lớn hơn nữa cuối");
        }else if(avgFirstHalf < avgSecondHalf){
            System.out.println("2. Nữa đầu nhỏ hơn nữa cuối");
        }else{
            System.out.println("2. Nữa đầu bằng nữa cuối");
        }

    }
    
    private static int threeLargetNumber(int[] numbers){
        Arrays.sort(numbers);
        return numbers[2];
    }
    
}

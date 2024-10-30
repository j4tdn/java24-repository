package ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n(5<=n<=100) : ");
		int n = sc.nextInt();
		if(n<= 5 && n >=100) {
			System.out.println("Không thỏa mãn điều kiện, nhập lại...");
			return;
		}
        int[] input = new int[n];
        System.out.println("Nhập "+n+" số : ");
        for(int i =0; i <n; i++) {
        	input[i] = sc.nextInt();
        }   
        ArrayList<Integer> divisibleBy7 = new ArrayList<>();
        ArrayList<Integer> divisibleBy5And7 = new ArrayList<>();
        ArrayList<Integer> otherNumbers = new ArrayList<>();
        ArrayList<Integer> divisibleBy5 = new ArrayList<>();
        
        for (int num : input) {
            if (num % 7 == 0 && num % 5 == 0) {
                divisibleBy5And7.add(num);
            } else if (num % 7 == 0) {
                divisibleBy7.add(num);
            } else if (num % 5 == 0) {
                divisibleBy5.add(num);
            } else {
                otherNumbers.add(num);
            }
        }
        int location = 0;
        for(int i = 0; i <otherNumbers.size();i++) {
        	if(otherNumbers.size()%2==0) {
        		location = otherNumbers.size()/2;
        	}else {
        		location = otherNumbers.size()/2 + 1;
        	}
        }
        
        
        ArrayList<Integer>div5a7other = new ArrayList<>();
        div5a7other.addAll(otherNumbers);
        div5a7other.addAll(location,divisibleBy5And7);
        
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(divisibleBy7);
        result.addAll(div5a7other);
        result.addAll(divisibleBy5);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i == divisibleBy7.size() - 1 || 
                i == (divisibleBy7.size() +div5a7other.size() - 1)) {
                System.out.print(" | ");
            } else if (i < result.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}

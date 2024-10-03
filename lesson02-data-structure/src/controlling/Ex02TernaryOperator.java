package controlling;

import java.util.Random;

import utils.RandomUtils;

public class Ex02TernaryOperator {
    public static void main(String[] args) { 
	
    	/*
    	 Toán tử 3 ngôi: cách làm khác của if else else if
    	 Sử dụng tt3n trong 1 số trường hợp đơn giản để làm gọn code
    	 
    	 (exp)? (statement1) : (statement2)
    	 (exp)? (returned_data1) : (returned_data2)
    	 
    	 Câu 1: cho 2 số a,b . tìm max của a, b
    	 
    	 */
    	Random rd=new Random();
    	int a= rd.nextInt(10,20);
    	int b= rd.nextInt(10,20);
    	
    	System.out.println("a= "+a);
    	System.out.println("b= "+b);
    	
    	int max = (a>b) ? a : b;
    	
    	System.out.println("max = "+max);
    	
    	double point = RandomUtils.generatePoint();
    	String rank =point <5 ? "yếu"
    			: point <6.5 ? "Trung bình"
    			: point < 8 ?	"Khá" : "giỏi";
    	System.out.println("Xếp loại học sinh"+rank);
    					
    			
    }
}

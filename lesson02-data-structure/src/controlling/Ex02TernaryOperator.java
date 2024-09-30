package controlling;

import java.util.Random;

public class Ex02TernaryOperator {

	/*
	 
	 Toan tu 3 ngoi:
	 
	 Cach lam khac cua if else
	  su dung trong truong hop tt3n don gian 
	  ex: tim max 2 so a, b
	  
	 */
	
	Random rd = new Random();
	
	int a = rd.nextInt(10, 20);
	int b = rd.nextInt(10, 20);
	
	int max = (a>b)?a:b;
}

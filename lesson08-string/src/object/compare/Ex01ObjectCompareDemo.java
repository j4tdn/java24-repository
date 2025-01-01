package object.compare;

import bean.Item;

public class Ex01ObjectCompareDemo {

	/*
	 Để so sánh "giá trị"
	  
	  + KDL nguyên thủy: dùng toán tử < > == (stack)
	  + KDL đối tượng: 
	  	--> .equals(Object): Hàm ở class 'Object' sau đó sẽ override lại
	  					   : Mặc định so sánh vs toán tử == (stack)
	  					   : Mong muốn so sánh giá trị của đối tượng
	  					   ==> 2 đối tượng sẽ equals với nhau khi nào ?? --> tự định nghĩa
	  	--> .compareTo(Object): Hàm ở interface Coparable<T> sau đó sẽ override
	  						  : Mặc định là hàm trừu tượng	
	   
	 */
	
	public static void main(String[] args) {
		Item i1 = new Item(); //H1
		Item i2 = new Item(); //H2
		Item i3 = new Item(1, "A"); //H3
		Item i4 = new Item(1, "A"); //H4
		Item i5 = new Item(2, "B"); //H5
		
		
		//So sánh bằng
		System.out.println("eq(i1, i2) --> "+ i1.equals(i2));
		System.out.println("eq(i3, i4) --> "+ i3.equals(i4));
		System.out.println("eq(i3, i5) --> "+ i3.equals(i5));
		
		//so sánh lớn bé
		System.out.println("compareTo(i3, i5) --> "+ i3.compareTo(i5));
		System.out.println("compareTo(i1, i3) --> "+ i1.compareTo(i3));
		System.out.println("compareTo(i4, i2) --> "+ i4.compareTo(i2));
		
		//KDL có sẵn của JAVA
		// Demo String
		
		String s1 = "hello";
		String s2 = "vietnam";
		String s3 = "hello";
		
		System.out.println("eq(s1,s2) --> "+ s1.equals(s2));
		System.out.println("eq(s1,s3) --> "+ s1.equals(s3));
		
		System.out.println("cpt(s1,s2) --> "+ s1.compareTo(s2));
		System.out.println("cpt(s1,s3) --> "+ s1.compareTo(s3));
		
	
		
}}

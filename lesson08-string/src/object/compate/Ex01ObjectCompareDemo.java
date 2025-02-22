package object.compate;

import bean.Item;

public class Ex01ObjectCompareDemo {

	/*
	 Để so sánh 'giá trị'
	  + KDL nguyên thủy :  dùng toán tử > < == (stack)
	  
	  + KDL đối tượng   : 
		--> .equals(o) 	  : Hàm ở class 'Object' sau đó sẽ override lại
						  : Mặc định so sánh với toán tử == (stack)
						  : Mong muốn so sánh giá trị của đối tượng
						  ==> 2 đối tượng sẽ equals với nhau khi nào ??
						      . khi id trùng nhau
						  
		-->	.compareTo(o) : Hàm ở interface Compareble<T> sau đó sẽ override		
						  : Mặc định là hàm trừu tượng
	 */
	public static void main(String[] args) {
		Item i1 = new Item(); //H1
		Item i2 = new Item(); //H2
		Item i3 = new Item(1,"A"); //H3
		Item i4 = new Item(1,"A"); //H4
		Item i5 = new Item(2,"B");
		
		// so sánh bằng
		System.out.println("EQ(I1,I2) --> " + i1.equals(i2));
		System.out.println("EQ(I3,I4) --> " + i3.equals(i4));
		System.out.println("EQ(I3,I5) --> " + i3.equals(i5));
		
		// so sánh lớn bé
		System.out.println("compareTo(i3, i5) --> " + i3.compareTo(i5));
		System.out.println("compareTo(i1, i3) --> " + i1.compareTo(i3));
		System.out.println("compareTo(i4, i2) --> " + i4.compareTo(i2));
		
		System.out.println("\n");
		
		// KDL có sẵn của Java
		// Demo String
		
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "vietnam";
		
		System.out.println("eq(s1,s2) :" + s1.equals(s2));
		System.out.println("eq(s1,s3) :" + s1.equals(s3));
		System.out.println("compareTo(s1, s2) --> " + s1.compareTo(s2));
		System.out.println("compareTo(s1, s3) --> " + s1.compareTo(s3));
		
		
		
	}
}

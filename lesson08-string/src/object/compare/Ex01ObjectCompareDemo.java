package object.compare;

import bean.Item;

public class Ex01ObjectCompareDemo {
	/*
	 Để so sánh giá trị
	 + KDL nguyên thủy: dùng toán tử > < ==
	 + KDL đối tượng:
	 	--> .equals(o)    : Hàm ở class 'Object' sau đó sẽ override lại
	 	--> .compareTo(o) : Hàm ỏw interface Comparable<T> sau đó 
	  
	  
	 */
	public static void main(String[] args) {
		Item i1 = new Item();
		Item i1 = new Item();
		Item i3 = new Item(1, "A");
		Item i4 = new Item(1, "A");
	}
	
}

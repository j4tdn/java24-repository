package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.Item;

public class Ex04ArrayListPrinciple {
	
	public static void main(String[] args) {
		
		/*
		 1. Giải thích cơ chế của ArrayList
		 2. Phân biệt Array và ArrayList
			
		 + ArrayList: là một class của Java trong bộ collection
		            : có thuộc tính là mảng một chiều
		            : khi thêm một phần tử vào ArrayList thực ra là đang thêm vào mảng đó
		            : thao tác trên mảng đó, sử dụng các hàm hỗ trợ của ArrayList	
		
		 + Khởi tạo với: new ArrayList<>() 
		 -> Ban đầu, tạo mảng rỗng elementData
		 -> Thêm phần tử đầu tiên vào, tạo mảng có 10 phần tử(default capacity) gán cho elementData
		    --> Gán giá trị thêm vào cho phần tử đầu tiên của mảng, tăng size + 1
		 -> Thêm các phần tử tiếp theo, lần lượt đưa vào mảng, tăng size 
		 -> Đến khi size = length(sức chứa của mảng đã hết)
		    --> gọi hàm grow() để tạo mảng mới có sức chứa(length) lớn hơn(3/2 length hiện tại và copy giá trị cũ qua)
		 
		 class ArrayList {
		 	 Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
		 	 int DEFAULT_CAPACITY = 10;
		 
		     Object[] elementData; // hiện tại {"a1", "b1", "c1", "d1", "a2",
		                                        "b2", "c2", "d2", "a3", "b3",
		                                        "c3", null, null, null, null}
		     int size; // hiện tại 11
		     --> số phần tử thật sự đang lưu trong mảng
		     --> ArrayList ko thể truy cập toàn bộ mảng, mà chỉ truy cần mảng từ [0-size)
		     
		     // Tạo ra mảng rỗng
		     public ArrayList() {
		        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
		     }
		     
		     // Thêm mới một phần tử
		     public boolean add(E e) {
		        modCount++;
		        add(e, elementData, size);
		        return true;
		     }
		     
		     // Thêm mới một phần tử - thực thi
		     private void add(E e, Object[] elementData, int s) {
		        if (s == elementData.length)
		            elementData = grow();
		        elementData[s] = e;
		        size = s + 1;
		     }
		    
		     private Object[] grow() {
		         return grow(size + 1);
		     }
		    
		     private Object[] grow(int minCapacity) {
			     int oldCapacity = elementData.length;
			     if (oldCapacity > 0 || elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
			         int newCapacity = ArraysSupport.newLength(oldCapacity,
			                 minCapacity - oldCapacity,  // minimum growth 
			                 oldCapacity >> 1            // preferred growth );
			         return elementData = Arrays.copyOf(elementData, newCapacity);
			     } else {
			         return elementData = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
			     }
    		 }
    		 
    		 public static int newLength(int oldLength, int minGrowth, int prefGrowth) {
		        // preconditions not checked because of inlining
		        // assert oldLength >= 0
		        // assert minGrowth > 0
		
		        int prefLength = oldLength + Math.max(minGrowth, prefGrowth); // might overflow
		        if (0 < prefLength && prefLength <= SOFT_MAX_ARRAY_LENGTH) {
		            return prefLength;
		        } else {
		            // put code cold in a separate method
		            return hugeLength(oldLength, minGrowth);
		        }
		     }
		  }
		  
		  
		  + Khởi tạo với: new ArrayList<>(initialCapacity) thay thế cho default capacity
		    --> this.elementData = new Object[initialCapacity]
		    
		    --> Dùng initialCapacity khi biết được số lượng phần tử tối đa sẽ lưu trong ArrayList
		    --> Hạn chế việc tạo mảng, copy giá trị qua về nhiều lần
		*/
		
		List<String> elements = new ArrayList<String>(17);
		elements.add("a1"); elements.add("b1"); elements.add("c1"); elements.add("d1"); 
		elements.add("a2"); elements.add("b2"); elements.add("c2"); elements.add("d2"); 
		elements.add("a3"); elements.add("b3"); elements.add("c3");
		elements.remove("a2");
		
		System.out.println("size: " + elements.size());
		
	}
	
}
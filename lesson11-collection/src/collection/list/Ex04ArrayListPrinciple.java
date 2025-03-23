package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex04ArrayListPrinciple {
	
	
	public static void main(String[] args) {
		
		/* 
		 1. Giải thích cơ chế của ArrayList
		 2. Phân biệt Array và ArrayList
		
		+ ArrayList: là một class của Java trong bộ Collection
				   : có thuộc tính là mảng 1 chiều
				   : khi thêm 1 phần từ vào ArrayList thực ra là đang thêm vào mảng đó
				   : thao tác trên mảng đó, sử dụng những hàm hỗ trợ của ArrayList
				  
		+ Khởi tạo với: new ArrayList<>();
		-> Ban đầu, tạo mảng rỗng elementData
		-> thêm phần tử đầu tiền vào, khởi tạo mảng có 10 phần tử(default capacity) 
		gán cho elementData
				--> Gán giá trị cần thêm vào cho phần tử đầu tiên của mảng, tăng size + 1
		-> Thêm các phần tử tiếp theo, lần lượt đưa vào các mảng và tăng size
		-> Đến khi size = length(sức chứa của mảng đã hết) 
				--> Gọi hàm grow() để tạo mảng mới có sức chứa (length) lớn hơn thường
					thường bằng 3/2 sức chưa mảng cũ
		class ArrayList {
    		Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    
    		Object[] elementData;
    
    		// Tạo ra mảng rỗng
    	public ArrayList() {
        	this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    			}
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
		
		+ Khởi tạo với: new ArrayList<>(initialCapacity) thay thế cho default câpcity
			--> this.elementData = new Object[ơinitialCapacity]
			
			--> Dùng initialCapacity khi biết được số lượng phần tử tối đa sẽ lưu trong 
			ArrayList
			--> Hạn chế việc tạo mảng, copy giá trị qua về nhiều lần
		
		*/
		
		List<String> elements = new ArrayList<>();
		elements.add("a1"); elements.add("b1");  elements.add("c1"); elements.add("d1"); 
		elements.add("a2"); elements.add("b2");  elements.add("c2"); elements.add("d2"); 

		
		
	}

}

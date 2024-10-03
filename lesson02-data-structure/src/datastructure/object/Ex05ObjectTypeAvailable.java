package datastructure.object;
import bean.Item;
public class Ex05ObjectTypeAvailable {
	
     public static void main(String[] args) {
	    
    	//Khi khai báo/gán giá trí số/kí tự cho KDL byte, char
    	 //Sử dụng,in ra
    	 //Byte--->s(sử dụng bảng mã ASCII tương ứng cho số và kí tự
    	 //Char-->kí tự
    	char c1='A';
	    byte c2='A';
	    System.out.println("c1-->"+c1);
	    System.out.println("c2-->"+21);
	    
    	//primitive
    	 int x1=5;
    	 
    	//object type
    	 Item i1=new Item();
    	 Item i2=new Item(2,'B',22d);
    	 
    	//Object type: available
    	//Integer: value(int)
    	 //String:value(byte)
    	 Integer o1=new Integer(55);
    	 Long l1=new Long(77l);
    	 String s1=new String("hello");
    	 System.out.println("o1-->"+o1);
    	 System.out.println("l1-->"+l1);
    	 System.out.println("s1-->"+s1);
    	 
    	 //Chỉ cho phép với KDL đối tượng có sẳn của JAVA
    	 //Integer, Long, String, Double.........
    	 //không cần phải dùng new mà có thể gán trực tiếp
    	 //giá trị cho biến đối tượng
    	 
    	 //Vì KDL có sẳn có duy nhất 1 thuộc tính
    	 //Thay vì new đối tượng rồi set giá trị thì
    	 //Chỉ cần gán giá trị còn việc new và set giá trị thì JAVA tự làm
    	 
    	 //Còn KDL do mình tạo ra
    	 //JAVA sẽ không biết sẽ có bao nhiêu thuộc tính để xử lý
    	 
    	 Integer o2=123;
    	 Long l2=345l;
    	 String s2 = "word";
    	  
    	 //Item i22=new Item(22,'Z',22d);
    	 //Item i22= 22,'Z',22d;
    	 
   }
}

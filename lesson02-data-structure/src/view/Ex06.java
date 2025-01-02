package view;



public class Ex06 {
	public static void main(String[] args) {
        
        StringBuilder s = new StringBuilder();
        
        for (int i = 1; s.length() <= 100; i++) {
            s.append(i);
        }
        
        System.out.println("Dãy số được tạo ra: ");
        System.out.println(s.toString());
        
        System.out.println("Chữ số ở vị trí thứ 100: " + s.charAt(99));
    }
}
 


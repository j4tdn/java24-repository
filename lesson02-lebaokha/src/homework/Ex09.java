package homework;

public class Ex09 {

	public static void main(String[] args) {
		int count = 0; 
        int number = 2; 
        int prime = 0;  
       
      
        while (count < 200) {
        	if ((number % 2 != 0 && number % 1 == 0)||number==2) {
                count++;
                prime = number; // 
            }
            number++;
        }

        System.out.println("Số nguyên tố thứ 200 là: " + prime);
	}
}

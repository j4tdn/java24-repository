package view;

import javax.swing.JButton;

public class Ex02AbstractClassInterface {
	public static void main(String[] args) {
		
		// swing --> desktop app
		
		// Tạo ra button tên là Search
		JButton btA = new JButton("Search");
		
		// Bắt sự kiện khi nhấn Search --> tìm kiếm dũ liệu thỏa mãi
		btA.addMouseListener(new AbstractMouseListener() {
			
		});
		
	}
}

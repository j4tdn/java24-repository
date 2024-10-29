package view;

import java.awt.event.MouseEvent;
import javax.swing.JButton;
public class Ex02AbstractClasInterface {
	public static void main(String[] args) {
		
		//swing --> desktop
		
		// tạo ra button tên là seach
		
		JButton btA = new JButton("search");
		
		btA.addMouseListener(new AbstractMouseListener() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("Thực hiện logic tìm kiếm");
			}
		});
	}
}


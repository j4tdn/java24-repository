package view;

import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class Ex02AbstractClassInterface {

	public static void main(String[] args) {
		//swing --> desktop app
		
		// tạo ra button têm là Search
		JButton bta = new JButton("Search");
		
		// cat event khi nhấn search --> search data sastified with
		bta.addMouseListener(new AbstractMouseListener() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("Execute logic search");
			}
		});
	}
	
}

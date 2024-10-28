package view;

import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class Ex02AbstractClassInterface {
	public static void main(String[] args) {
		//swing --> desktop app
		JButton btA = new JButton("Search");
		
		btA.addMouseListener(new AbstractMouseListener() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("Thực thi logic tìm kiếm ");
			}
		});
	}
}

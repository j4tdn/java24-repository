package view;

import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class Ex02AbstractCLassInterface {
	public static void main(String[] args) {
		
		JButton btA = new JButton("Search");

		btA.addMouseListener(new AbstractMouseListener() {

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("Thuc hien logic tim kiem");
			}
		});
	}
}

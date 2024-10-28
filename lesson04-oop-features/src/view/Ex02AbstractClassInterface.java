package view;

import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class Ex02AbstractClassInterface {

	public static void main(String[] args) {

		// swing --> deskop app

		// tạo button tên là search
		JButton btA = new JButton("Search");

		// bắt sự kiện khi nhấn search --> tìm dữ liệu thỏa mãn

		btA.addMouseListener(new AbstractMouseListener() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("Searching...");

			}

		});
	}
}

package view;

import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class Ex02AbstractClassInterface {

	public static void main(String[] args) {

		// swing ---> desktop app basic

		// Tạo ra button tên Search
		JButton btA = new JButton("Search");

		// Bắt sự kiện khi nhấn search ---> tìm kiếm dữ liệu thỏa mãn

		btA.addMouseListener(new AbstractMouseListener() {

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

	}

}

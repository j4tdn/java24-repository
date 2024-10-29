package view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public abstract class AbstractMouseListener implements MouseListener {
	// Override tất cả các hàm trừu tượng ngoại trừ hàm mousePressed
	// new AbstractMouseListener() cthif chỉ bắt buộc override hàm mousePressed
	
	@Override
	public void mouseClicked(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}

}

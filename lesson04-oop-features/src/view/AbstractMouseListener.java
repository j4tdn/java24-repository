package view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public abstract class AbstractMouseListener implements MouseListener {

	//override all hàm abs except mousePressed
	// new AbstractMouseListener() thì chỉ bắt buộc override hàm mousePressed
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
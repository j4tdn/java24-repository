package view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public abstract class AbstractMouseListener implements MouseListener {

	// Override tất cả hàm trừu tượng trừ mousePressed
	// new AbstractMouseListener() chỉ bắt buộc override hàm mousesPressed

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

}

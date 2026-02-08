package view;

import persistence.OrderDetail.Id;
import service.OrderDetailService;
import service.OrderDetailServiceImpl;
import utils.IoUtils;

public class Ex04OrderDetailView {
	
	private static OrderDetailService orderDetailService;
	
	static {
		orderDetailService = new OrderDetailServiceImpl();
	}
	
	public static void main(String[] args) {
		
		IoUtils.generate("4. Liệt kê chi tiết đơn hàng [@ManyToMany]", orderDetailService.get(new Id(2, 5)));
		
	}
	
}

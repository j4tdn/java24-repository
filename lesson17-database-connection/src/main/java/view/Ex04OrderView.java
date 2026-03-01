package view;

import java.time.LocalDate;

import service.OrderService;
import service.OrderServiceImpl;
import utils.IoUtils;

public class Ex04OrderView {
	
	
	private static OrderService orderService;
	
	static {
		orderService = new OrderServiceImpl();
	}
	
	public static void main(String[] args) {
		IoUtils.generate(
			"Liệt kê thời gian bán của các đơn hàng", 
			orderService.getOrderTimes(LocalDate.of(2024, 4, 18)));
	}
}

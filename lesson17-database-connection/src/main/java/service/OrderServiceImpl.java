package service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;
import java.util.Set;

import dao.JdbcOrderDao;
import dao.OrderDao;

public class OrderServiceImpl implements OrderService{
	
	public final OrderDao orderDao;
	
	
	public OrderServiceImpl() {
		orderDao = new JdbcOrderDao();
	}
	
	@Override
	public Set<LocalTime> getOrderTimes(LocalDate orderDate) {
		Objects.requireNonNull(orderDate, "OrderDate should not be null");
		return orderDao.getOrderTimes(orderDate);
	}
}

package service;

import java.util.Objects;

import dao.HibernateOrderDetailDao;
import dao.OrderDetailDao;
import persistence.OrderDetail;
import persistence.OrderDetail.Id;

public class OrderDetailServiceImpl implements OrderDetailService {
	
	private OrderDetailDao orderDetailDao;
	
	public OrderDetailServiceImpl() {
		orderDetailDao = new HibernateOrderDetailDao();
	}
	
	@Override
	public OrderDetail get(Id id) {
		Objects.requireNonNull(id, "id should not be null");
		return orderDetailDao.get(id);
	}
	
}

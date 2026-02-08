package dao;

import dao.base.GenericDao;
import persistence.OrderDetail;
import persistence.OrderDetail.Id;

public class HibernateOrderDetailDao extends GenericDao implements OrderDetailDao {

	@Override
	public OrderDetail get(Id id) {
		return openSession().find(OrderDetail.class, id);
	}

}

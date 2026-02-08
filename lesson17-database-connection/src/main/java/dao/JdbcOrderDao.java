package dao;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

import bean.Order;
import dao.base.GenericDao;

public class JdbcOrderDao extends GenericDao<Order> implements OrderDao{

	private static final String GET_ORDER_TIMES = ""
			+ "SELECT CAST(C09_ORDER_TIME AS TIME) ORDER_TIME\n"
			+ "  FROM t09_order \n"
			+ " WHERE CAST(C09_ORDER_TIME AS DATE) = ?";
	
	@Override
	public Set<LocalTime> getOrderTimes(LocalDate orderDate) {
		final Date date = Date.valueOf(orderDate);
		return new HashSet<>(getList(GET_ORDER_TIMES, pst -> {
			try {
				pst.setDate(1, date);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}, rs -> {
			LocalTime timing = null;
			try {
				timing = rs.getTime("ORDER_TIME").toLocalTime();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return timing;
		}));
	}

}

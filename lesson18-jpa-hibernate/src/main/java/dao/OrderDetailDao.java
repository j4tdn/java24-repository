package dao;

import persistence.OrderDetail;
import persistence.OrderDetail.Id;

public interface OrderDetailDao {

	/**
	 * Get order detail by given id
	 * 
	 * @param id the id
	 * @return {@link OrderDetail}
	 */
	OrderDetail get(Id id);

}

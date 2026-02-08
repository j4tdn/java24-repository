package dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public interface OrderDao {

	/**
	 * Get all available order times
	 * 
	 * @return set of {@link LocalTime}
	 */
	Set<LocalTime> getOrderTimes(LocalDate orderDate);

}

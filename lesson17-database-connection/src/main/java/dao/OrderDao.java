package dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

import bean.Item;

public interface OrderDao {
	/**
	 * Get all available items
	 * 
	 * @return list of {@link LocalDate}
	 */
	Set<LocalTime> getOrderTimes(LocalDate orderDate);
}

package service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public interface OrderService {
	/**
	 * Get all available items
	 * 
	 * @return list of {@link LocalDate}
	 */
	Set<LocalTime> getOrderTimes(LocalDate orderDate);
}
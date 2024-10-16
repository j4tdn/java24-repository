package ex01_purchasing_problem;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Order {

	private Customer customer;
	private DeviceDetail[] deviceDetails;
	private LocalDateTime dateTime;

	public Order() {
	}

	public Order(Customer customer, DeviceDetail[] deviceDetails, LocalDateTime dateTime) {
		super();
		this.customer = customer;
		this.deviceDetails = deviceDetails;
		this.dateTime = dateTime;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public DeviceDetail[] getDeviceDetails() {
		return deviceDetails;
	}

	public void setDeviceDetails(DeviceDetail[] deviceDetails) {
		this.deviceDetails = deviceDetails;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", deviceDetails=" + Arrays.toString(deviceDetails) + ", dateTime="
				+ dateTime + "]";
	}

	public double export() {
		double totalOfMoney = 0;

		DeviceDetail[] dds = getDeviceDetails();
		for (DeviceDetail dd : dds) {
			/*
			 * Each list DD has 2 tt Device && amount -> getDevice each Device has 4 tt ...
			 * -> getCost
			 */
			double ddCost = dd.getDevice().getCost() * dd.getAmount();
			if (dd.getDevice().getCost() > 590
					&& LocalDate.of(2024, Month.MAY, 8).isEqual(getDateTime().toLocalDate())) {
				ddCost *= 0.9;
			}
			totalOfMoney += ddCost;
		}

		return totalOfMoney;
	}
}

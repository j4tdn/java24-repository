package ex01_purchasing_problem;

public class DeviceDetail {

	private Device device;
	private int amount;

	public DeviceDetail() {
	}

	public DeviceDetail(Device device, int amount) {
		this.device = device;
		this.amount = amount;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "DeviceDetail [device=" + device + ", amount=" + amount + "]";
	}

}

package singleton;

public class RemoteDate {

	private static RemoteDate INSTANCE = null;

	private int dayOfYear;

	private RemoteDate() {
	}

	public static RemoteDate getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new RemoteDate();
		}
		return INSTANCE;
	}

	public void setDayOfYear(int dayOfYear) {
		this.dayOfYear = dayOfYear;
	}

	public int getDayOfYear() {
		return dayOfYear;
	}

	@Override
	public String toString() {
		return "RemoteDate[dayOfYear=" + dayOfYear + "]";
	}

}
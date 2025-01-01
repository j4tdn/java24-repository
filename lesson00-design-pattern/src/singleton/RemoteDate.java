package singleton;

public class RemoteDate {
	private int dayOfYear;

	private static RemoteDate INSTANCE = null;

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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "RemoteDate[dayOfYear= " + dayOfYear + "]";
	}

}

package singleton;

public class RemoteDate {

    private static RemoteDate instance = null;

    private int dayOfYear;

    private RemoteDate() {

    }

    public static synchronized RemoteDate getInstance() {
        if (instance == null) {
            instance = new RemoteDate();
        }
        return instance;
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

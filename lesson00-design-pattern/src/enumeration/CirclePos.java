package enumeration;

public enum CirclePos {
    INSIDE("Tren duong tron"), ONSIDE("Trong duong tron"), OUTSIDE("Ngoai duong tron");

    private String localizedMessage;

    CirclePos(String localizedMessage) {
        this.localizedMessage = localizedMessage;
    }

    public String getLocalizedMessage() {
        return localizedMessage;
    }
}

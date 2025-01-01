package singleton;

public class Ex01SingletonDemo {
    public static void main(String[] args) {

        RemoteDate r1 = RemoteDate.getInstance();
        r1.setDayOfYear(48);
        System.out.println("r1 hashCode=" + System.identityHashCode(r1));
        System.out.println(r1);
        System.out.println("========================");
        RemoteDate r2 = RemoteDate.getInstance();
        System.out.println("r2 hashCode=" + System.identityHashCode(r2));
        System.out.println(r2);

    }
}

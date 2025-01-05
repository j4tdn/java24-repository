package singleton;

public class Ex01SingletonDemo {
	
	public static void main(String[] args) {
		RemoteDate rd1 = RemoteDate.getInstance();
		rd1.setDayOfYear(48);
		System.out.println("rd1 hash --> " + System.identityHashCode(rd1));
		System.out.println("rd1 value --> " + rd1);
		
		System.out.println("\n===============================\n");
		
		RemoteDate rd2 = RemoteDate.getInstance();
		System.out.println("rd2 hash --> " + System.identityHashCode(rd2));
		System.out.println("rd2 value --> " + rd2);
	}
}

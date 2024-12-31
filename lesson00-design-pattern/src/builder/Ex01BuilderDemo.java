package builder;



public class Ex01BuilderDemo {
	public static void main(String[] args) {
		Item i1  =Item.builder()
				.withId(1)
				.withName("A")
				.withSalesPrice(12d)
				.build();
		System.out.println("i1: "+i1);
		
		Item i2 = Item.builder()
				.withId(2).withName("B")
				.withSalesPrice(34d)
				.build();
		System.out.println("i2 : "+i2);
		System.out.println("i2 name : "+i2.getName());
	
		
	}
}

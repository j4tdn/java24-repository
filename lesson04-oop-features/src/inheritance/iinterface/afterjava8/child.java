package inheritance.iinterface.afterjava8;

public class child implements Father, Mother {
	
	@Override
	public void cooking() {
//		Father.super.cooking();
		System.out.println("Don't know how to cook ...");
	}

}

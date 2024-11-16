package view;

import inheritance.iinterface.Shape;
import inheritance.iinterface.afterjava8.Calculator;

public class Ex01TestInterfacePublicMethod implements Shape {
	
	@Override
	public void calcS() {
		
	}
	
	@Override
	public void setBorder() {
		System.out.println("5px");
	}
	
	public static void main(String[] args) {
		Calculator.finish();
	}
	
}
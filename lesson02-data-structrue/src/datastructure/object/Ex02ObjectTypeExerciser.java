package datastructure.object;

import bean.Store;

public class Ex02ObjectTypeExerciser {
	
	public static void main(String[] args) {
		Store storeA = new Store('A', 8, 16);
		Store storeB = new Store('B', 8, 17);
		Store storeC = new Store('C', 9, 18);
		
		System.out.println("Store A: " + storeA);
		System.out.println("Store B: " + storeB);
		System.out.println("Store C: " + storeC);
	}

}

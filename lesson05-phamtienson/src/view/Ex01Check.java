package view;

import bean.CheckPower;

public class Ex01Check {
	
		public static void main(String[] args) {
			CheckPower check = new CheckPower();
			System.out.println(" Check (8,2): "+ check.isPower(8, 2));
			System.out.println(" Check (2,8): "+ check.isPower(2, 8));
			System.out.println(" Check (6,2): "+ check.isPower(6, 2));
			System.out.println(" Check (20,4): "+ check.isPower(20, 4));
			System.out.println(" Check (64,4): "+ check.isPower(64, 4));
		}
	}



package view;

import java.util.Scanner;

import utils.IoUtils;

public class Ex01MultipleOf2 {

	public static void main(String[] args) {

		int number = IoUtils.inputNumber(0, 5, "Nhập vào số nguyên dương N: ");

		if (number % 2 == 0) {
			System.out.println(number + " là bội của 2 ");
		} else {
			System.out.println(number + " không phải là bội của 2");
		}
		System.out.println("Kết thúc chương trình");

	}

}

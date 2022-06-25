package com.bridgelabz;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.addition();
	}

	public void addition() {
		int a ,b;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		int result  = a +b ;
		System.out.println(result);
	}

}

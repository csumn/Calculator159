package com.bridgelabz;

import java.util.Scanner;

public class Multiplication {

	public void mul() {
		int a ,b;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		int result  = a * b ;
		System.out.println(result);	
	}
}

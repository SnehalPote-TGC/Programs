package com;

import java.util.Scanner;

public class MultiplicationOfEnteredNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number for table");
		int a = scanner.nextInt();
		for(int i =1; i<=10; i++) {
			System.out.println(a*i);

}}
}

package com;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your");
		int i = scanner.nextInt();
		
		if(i%5 ==0) {
			System.out.println("Leap year");
		}else {
			System.out.println("Not Leap");
		}
		
		
	}

}

package com;

import java.util.Scanner;

public class CheckConsonantOrVowel{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");

		String str= scanner.nextLine();

		
		//String str="Snehal";
		int len = str.length();
		int count=0;
		for (int i=0; i<=len-1; i++) {
			
			char st = str.charAt(i);
			if (st =='a' || st == 'e' ||st=='o'|| st == 'u'|| st =='i') {
				count++;
			
				System.out.println("vowels   " +st+"  Position "+i);
			}
			
		}
		System.out.println("No of vowels " +count);
		//ystem.out.println("vowels" +str);

		
	}
}
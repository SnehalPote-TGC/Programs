package com;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "12321";
		String rev = "";
		int len =str.length();
		for(int i =len-1; i>=0; i--) {
			
			rev = rev + str.charAt(i);
			
		}
		System.out.println(rev);
		if(str.equals(rev)) 
		{
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}

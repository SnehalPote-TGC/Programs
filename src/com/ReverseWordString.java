package com;

public class ReverseWordString {

	public static void main(String[] args) {
		String name = "My name is Snehal";
		String[] splitName = name.split(" ");
		String reverse = "";
		
		for(String sN: splitName) 
		{
			String rev = "";
			for(int i = sN.length()-1; i>=0; i--)
			{
				rev = rev + sN.charAt(i);
			}
			reverse = reverse + rev +" ";
		}
		System.out.println(reverse);

	}

}

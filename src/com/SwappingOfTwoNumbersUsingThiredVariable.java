package com;

public class SwappingOfTwoNumbersUsingThiredVariable {
	
	public static void main(String[] args) {
		int a=20;
		int b=30;
		int temp;
		System.out.println("Before Swapping A " +a);
		System.out.println("Before Swapping B " +b);

		 temp=b; //temp = 30
		 b=a;   //b=20
		 a=temp;    //a= 30
		 
			System.out.println("After Swapping A " +a);
			System.out.println("After Swapping B " +b);

		
	}
}

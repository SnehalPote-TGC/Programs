package com;

public class SwappingOfNumWithoutUsingThirdVariable {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		System.out.println("Before Swapping A " +a);
		System.out.println("Before Swapping B " +b);
		
		a=a+b;  //a =50
		b = a-b;  //b=20
		a = a-b;  //b= 30
		System.out.println("After Swapping A " +a);
		System.out.println("After Swapping B " +b);
		
		

	}

}

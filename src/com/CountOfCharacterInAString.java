package com;

public class CountOfCharacterInAString {
public static void main(String[] args) {
	 String str="Snehal is a Lead software tester";
	int count=0;
	for(int i=0; i<=str.length()-1;i++)
	{
		if(str.charAt(i) != ' ')
		count++;
	}
	System.out.println(count);
	
	int a= 5;
	int b=10;
	System.out.println(+5+10+ "result " +a+b);
	System.out.println("result " +(a+b));
	System.out.println("result " +a+b);
			
			
}
}

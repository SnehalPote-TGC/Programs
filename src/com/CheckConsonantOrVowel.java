package com;

public class CheckConsonantOrVowel{
	public static void main(String[] args) {
		String str="Snehal";
		int len = str.length();
		int count=0;
		for (int i=0; i<=len-1; i++) {
			
			char st = str.charAt(i);
			if (st =='a' || st == 'e' ||st=='o'|| st == 'u'|| st =='i') {
				count++;
				System.out.println("vowels   " +str.charAt(i)+"  Position "+i);

			}
			
		}
		System.out.println("No of vowels " +count);
		//ystem.out.println("vowels" +str);

		
	}
}
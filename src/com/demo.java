package com;

public class demo {
	
	void reverseString(String name)
	{
		
		String[] w = name.split(" ");
		String rev = "";
		
		for(String word : w)
		{
			String revword = "";
			
			for (int i =0; i<=word.length()-1;i++)
			{
				
				revword = revword + word.charAt(i);
			}
			rev =  revword + " " +rev  ;
			
			
		}
		
		System.out.println(rev);
	}

	public static void main(String[] args) {
		demo d = new demo();
		d.reverseString("Snehal is my name");

	}

}

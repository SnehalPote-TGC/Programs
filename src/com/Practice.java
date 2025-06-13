package com;

public class Practice {

	public static void main(String[] args)
	{
		String string = "my name is Khan";
		String repeatedChar="";
		String uniqueCharacter="";
		int count=0;
		char[] ch = string.toCharArray();
		for(int i =0; i<ch.length; i++)
		{
			for(int j = i+1; j < ch.length; j++)
			{
				if (ch[i] == ch[j] )
				{
					count++;
					
			}else {
				uniqueCharacter = ""+uniqueCharacter.charAt(i);
			}
			
			}
			System.out.println(uniqueCharacter);
		}
		
	}

	}

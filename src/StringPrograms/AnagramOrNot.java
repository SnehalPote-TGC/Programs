package StringPrograms;

import java.util.Arrays;

public class AnagramOrNot {

	public static void main(String[] args) {
		String str1 = "Silent";
		String str2 = "Listen";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length() == str2.length())
		{
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2))
			{
				System.out.println("Strings are anagram");
			}
			else
			{
				System.out.println("Strings are not Anagrams");
			}

		}
		else
		{
			System.out.println("Strings are not Anagrams");
		}

	}

}

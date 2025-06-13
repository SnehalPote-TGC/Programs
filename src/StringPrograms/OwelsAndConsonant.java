package StringPrograms;

public class OwelsAndConsonant {

	public static void main(String[] args) {
		
		String str = "Occurrence OF character in a string";
		int vowelsCount = 0;
		int consonantCount = 0;
		for(int i =0; i<str.length(); i++)
		{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
					str.charAt(i) == 'o' || str.charAt(i) == 'u' )
			{
				vowelsCount ++;
			}
			else
			{
				consonantCount ++;
			}
			
		}
		System.out.println("Vowels --> "+vowelsCount + "  Consonant --> " +consonantCount);

	}

}

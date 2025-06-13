package StringPrograms;

public class SmallestLargestPalindromeInAString {
	
	public static boolean checkpalindrome(String str)
	{
		String rev ="";
		for(int i =str.length()-1; i>=0; i--)
		{
			rev = rev +str.charAt(i);
		
		}
		if( str.equalsIgnoreCase(rev))
		{
			return true;
		}
		else
		{
			return false;
		}
			}

	public static void main(String[] args) {
		
	String str = "wow you so nalan";
	String[] strSp = str.split(" ");
	String smallestPalindrome =null;
	String largestPalindrome = "";
	for(String st : strSp)
	{
		if(checkpalindrome(st))
			
		{
			System.out.println("word "+st);
			if(smallestPalindrome == null || st.length() < smallestPalindrome.length())
			{
				smallestPalindrome=st;
			}
			if(st.length() > largestPalindrome.length())
			{
				largestPalindrome=st;
			}
		}
	}
	System.out.println("Smallest " +smallestPalindrome);
	System.out.println("largets "+largestPalindrome);
	}

}

package StringPrograms;

public class TotalNumberOfCharacterInAString {
	int count = 0;
	public String countChar(String str)
	{
	for(int i=0; i<=str.length()-1; i++)
		{
			if(str.charAt(i) != ' ')
			{
				count++;
			}
		}
	System.out.println(count);
		return str;
	}
		public static void main(String[] args) {
			TotalNumberOfCharacterInAString tb = new TotalNumberOfCharacterInAString();
	     	tb.countChar("snehal is my name");
	 	}

}

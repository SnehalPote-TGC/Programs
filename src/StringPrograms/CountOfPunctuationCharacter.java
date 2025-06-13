package StringPrograms;

public class CountOfPunctuationCharacter {
	int count =1;
	public void countPunctuation (String str)
	{
		for(int i =0; i<str.length()-1; i++)
		{
			
			if (str.charAt(i) == '!' || str.charAt(i) == '.' || str.charAt(i) == ',' || str.charAt(i) == '-'
					|| str.charAt(i) == '"' || str.charAt(i) == '\'' || str.charAt(i) == ':' || str.charAt(i) == ';'
					|| str.charAt(i) == '?')
			{
				count ++;
			}
		}
		System.out.println(count);
	}
	public static void main(String args[])
	{
		CountOfPunctuationCharacter cc = new CountOfPunctuationCharacter();
		cc.countPunctuation("dggg545n,.,.:';");
	}

}

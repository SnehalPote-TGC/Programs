package StringPrograms;

public class OcurranceOfCharacterInString {

	public static void main(String[] args) {
		int count =0;
		String str = "Occurrence OF character in a string";
		char[] splitname = str.toCharArray();
		
		for(int i=0; i<splitname.length;i++)
		{
			count=1;
			for(int j=i+1; j<splitname.length;j++)
			{
				if(splitname[i] == (splitname[j]))
				{
					count ++;
					splitname[j]='0';
				}
			}
			if(splitname[i] != '0')
			System.out.println("Character --> " +splitname[i]+ " Ocurrance -->" +count);
		}
		
		
	}

}

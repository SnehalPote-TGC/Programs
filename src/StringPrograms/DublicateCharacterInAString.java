package StringPrograms;

public class DublicateCharacterInAString {

	public static void main(String[] args) {
		
		String str ="Snehal pote work hard success will be yours";
		char[] ch = str.toCharArray();
		
		int count=0;;
		for (int i =0; i<ch.length; i++)
		{
			count=1;
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i] == ch[j])
				{
					count++;
							ch[j]=0;		
				}
			}
			if(count >2 & ch[i] !=0)
			{
			 	System.out.println("count " +count+ " character " +ch[i] );
			}
		}
		

	}

}

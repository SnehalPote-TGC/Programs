package StringPrograms;

public class FindAllSubsetsOfAString {

	public static void main(String[] args) {
		String str = "FUN";
		int length = str.length();
		int number=length*(length+1)/2;
		int temp=0;
		
		String[] eqaparts = new String[number];
		
		for(int i=0; i<length; i++)
		{
			for(int j=i ; j<length; j++)
			{
				String parts = str.substring(i,j+1);
				eqaparts[temp] = parts;
				temp++;
			}
		}
		for(int i=0; i<eqaparts.length; i++)
		{
			System.out.println("Subsets of Given String --> " +eqaparts[i]);
		}
	}

}

package StringPrograms;

public class DivideStringInNEqualsPart {

	public static void main(String[] args) {
		String str = "sn hn";
		str = str.replace(" ", "");
		int strLength = str.length();
		int divideStringIn = 2;
		int chars = strLength/divideStringIn;
		String[] equalStr = new String[divideStringIn];
		int temp=0;
		if(strLength % divideStringIn ==0)
		{
			for(int i=0; i<str.length(); i=i+chars)
			{
				String part=str.substring(i,i+chars);
				equalStr[temp] = part;
				temp++;
			}
			
			for(int i=0; i<equalStr.length; i++)
			{
				System.out.println(equalStr[i]);
			}
		}
		else
		{
			System.out.println("Can not be divided in Nquals part");
		}
		}

}

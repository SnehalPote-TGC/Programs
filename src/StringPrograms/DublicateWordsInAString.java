package StringPrograms;

import java.util.Arrays;

public class DublicateWordsInAString {

	public static void main(String[] args) {
		String str=" snehal pote you you are snehal potu";
		String[] sttr=str.split(" ");
		int count=0;
		for(int i =0; i<sttr.length; i++)
		{
			count=1;
			for(int j=i+1; j<sttr.length; j++)
			{
				if(sttr[i].equals(sttr[j]))
									{
					count++;
								sttr[j]="0";
				}
			}
			if(count > 1 & sttr[i] !="0")
			{
				System.out.println("Dublicates are " +sttr[i]+ " Count "+count);		
			}
		}

	}

}

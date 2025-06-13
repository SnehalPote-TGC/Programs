package StringPrograms;

public class SmallestAndLragestWord {

	public static void main(String[] args) {
		String str = "Snehal pote is a good actor";
		String[] word = str.split(" ");
		String smallWord= word[0];
		String LargeWord = word[0];
		
		for(String words : word)
		{
			if(words.length() < smallWord.length())
			{
				smallWord=words;
			}
			if(words.length() > LargeWord.length())
			{
				LargeWord=words;
			}
		}
		
		System.out.println(smallWord);
		System.out.println(LargeWord);

	}

}

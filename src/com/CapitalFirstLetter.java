package com;

public class CapitalFirstLetter {

	public static void main(String[] args) {
		String str = "      my          name is khan";
		
		//replaceAll("\\s+", " "): This uses a regular expression to replace all sequences of one or more whitespace characters (spaces, tabs, etc.) with a single space.
		//trim(): This removes leading and trailing spaces from the resulting string.
		String newStr = str.replaceAll("\\s+"," ").trim();
		//split("\\s"): This splits the string into an array of words based on whitespace.
		String words[]=newStr.split("\\s");  
	    String capitalizeWord="";  
	    
	    /*w.substring(0, 1): Extracts the first character of the word.
         w.substring(1): Extracts the rest of the word starting from the second character.
         first.toUpperCase() + afterfirst: Concatenates the uppercase first character with the rest of the word.
          capitalizeWord += first.toUpperCase() + afterfirst + " ": Adds the capitalized word followed by a space to the capitalizeWord string.*/
	    
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
	        
	    }  
        //String result = capitalizeWord.toString().trim();

	    System.out.println("-->" +capitalizeWord);
	}

}

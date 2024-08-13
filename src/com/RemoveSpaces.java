package com;

public class RemoveSpaces {

	public static void main(String[] args) {
		String str="Hello world I am here";

	    for (char c : str.toCharArray()) {
	        if (c != ' ')
	            System.out.print(c);
	    }
	}

}

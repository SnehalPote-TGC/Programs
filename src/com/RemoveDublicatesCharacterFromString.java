package com;

public class RemoveDublicatesCharacterFromString {
// 1 st Way
	public static void main(String[] args) {
    String info = "snehal pote ababab";
    String result = "";
    for(int i =0; i<info.length(); i++)
    {
    	String ch = ""+info.charAt(i);
    	if(result.contains(ch))
    	{
    		continue;
    	}
    	result = result + ch;
    }
    System.out.println(result);
	} 
	
}

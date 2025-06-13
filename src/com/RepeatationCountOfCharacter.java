package com;

public class RepeatationCountOfCharacter {
	public static void main(String[] args) {
		String name = "Occurance";
		char[]  splitName = name.toCharArray();
		int count;
	     for (int i = 0; i<splitName.length; i++)
	     {
	    	 count=1;
	    	 for(int j=i+1; j < splitName.length; j++)
	    	 {
	    		 if(splitName[i] == (splitName[j]))
	    		 {
	    			 count++;
	    			 splitName[j]='0';
	    		 }
	    	 }
	    	 if(count>0  && splitName[i] != '0') {
System.out.println("String " + splitName[i] + " Count of repeatation " + count);
	    	 }     }

}}

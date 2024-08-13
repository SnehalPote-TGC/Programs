package com;

public class IntegertoStringViceVersa {
	public static void main(String[] args) {
		  //1st way  
        String str1 = "5";  
        int result = Integer.parseInt(str1); // Using Integer.parsrInt()  
        System.out.println(result);  
   
        //2nd way  
        String str2 = "5";  
        Integer result2 = Integer.valueOf(str2); // Using Integer.valueOf()  
        System.out.println(result2);
        int x = 5;  
        //1st way  
        String str = Integer.toString(x); // using Integer.toString()  
        System.out.println(str);  
   
        //2nd way  
        String str21 = String.valueOf(x); // using String.valueOf()  
        System.out.println(str21);  
  
	}

}

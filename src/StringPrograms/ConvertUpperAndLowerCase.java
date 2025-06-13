package StringPrograms;

public class ConvertUpperAndLowerCase {

	public static void main(String[] args) {
		
		       String str = "SH bH tGh bggg   f";
		       String newstr = "";
		       for(int i=0; i<str.length(); i++)
		       {
		    	   
		    	 char ch = str.charAt(i);
		           if(Character.isLowerCase(ch))
		           {
		        	   newstr = newstr+ Character.toUpperCase(ch);
		           }
		           else if(Character.isUpperCase(ch))
		           {
		        	   newstr = newstr + Character.toLowerCase(ch);
		           }
		           
		       }
		       
		       System.out.println("string " +newstr);
	
	}
}

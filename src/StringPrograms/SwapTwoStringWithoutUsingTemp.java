package StringPrograms;

public class SwapTwoStringWithoutUsingTemp {

	public static void main(String[] args) {
		String str1= "Snehal";
		String str2="Pote";
		
		str1 =str1+str2;
		str2 = (str1.substring(0,6));
		str1 = str1.substring(6, 10);
		System.out.println("String 1  "+str1);
		System.out.println("String 2  " +str2);
	}

}

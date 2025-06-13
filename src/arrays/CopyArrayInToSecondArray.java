package arrays;

public class CopyArrayInToSecondArray {

	public static void main(String[] args) {
		int[] arr1 = new int [] {1,3,5,6,89,};
		int[] arr2 = new int[arr1.length];
		
		for(int i =0; i<arr1.length; i++)
		{
			arr2[i]=arr1[i];
			
		}
		
		for(int i =0; i<arr1.length; i++)
		{
			System.out.print("First Array is  "+arr1[i]);
			
		}
		for(int i =0; i<arr1.length; i++)
		{
			System.out.println("Second  Array is  "+arr2[i]);
			
		}


	}

}

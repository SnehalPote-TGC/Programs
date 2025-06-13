package arrays;

public class PrintEvenPositionArray {

	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,5,7,9,7,4,2,3,4,5,7,8,90,4};
		for(int i =1; i<arr.length; i = i+2)
		{
			System.out.println("Even position element " +arr[i]);
		}
	}

}

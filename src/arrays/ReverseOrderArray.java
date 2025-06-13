package arrays;

public class ReverseOrderArray {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,4,6,5,78,33,3,4,66,676,7,7,78,787};
		
		for(int i = arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i] + " ");
		}

	}

}

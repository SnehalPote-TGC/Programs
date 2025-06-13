package arrays;

public class LargestElementInArray {

	public static void main(String[] args) {
		
		int[] arr = new int[] {23,4,5,6,9,7,1,787,3,5,7,9,6,34,89};
		int temp=0;
		for(int i =0; i<arr.length; i++)
		{
			for(int j =i+1; j<arr.length; j++)
			{
				if (arr[i] > arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
			}
		}
		
		// for largest
        System.out.println("Largest number in the array: " + arr[arr.length - 1]);
		//for smallest
        System.out.println("smallest number in the array: " + arr[0]);

		

	}

}

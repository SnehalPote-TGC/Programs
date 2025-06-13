package arrays;

public class FrequencyOfElementsInArray {
	public static void main(String[] args) {
		int[] arr = new int[] {1,1,3,5,7,8,1,1,3,5,7,4};
		int temp;
	
		
		for(int i=0; i<arr.length; i++)
		{
			int count =1;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j]) {
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				arr[j]=0;
				count++;
			}}
			if(arr[i] != 0)
			System.out.println("element " +arr[i]+ "Count " +count);
		}
	}

}

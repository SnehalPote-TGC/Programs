package arrays;

public class PrintDublicatesElementsOfAnArray {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,4,6,7,9,2,3,4,6,7,9,0,4,2};
		int temp;
		
		for(int i =0; i<arr.length; i++)
		{
			int count=1;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]  == arr[j])
				{
					temp= arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					arr[j]=0;
					count++;
				}
			}
			if(arr[i] !=0 && count >1)
			System.out.println("Dublicates elements "+arr[i] + " Count " +count);
		}

	}

}

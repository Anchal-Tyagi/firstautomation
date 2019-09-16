
public class BubbleSorExample {

	void bubbleSort(int arr[])
	{
		int temp = 0;
		int n = arr.length ;
		for(int i = 0 ; i<n ; i++)
		{
			for (int j =0 ; j<n-i-1;j++)
			{
				if (arr[j]>arr[j+1])
					{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					}
				
			}
				
		}
		
		}
	
	public void printArray(int arr[])
	{
		for(int i=0; i< arr.length ; i ++ )
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,3,2,6,1,8,4,9};
		BubbleSorExample bs= new BubbleSorExample();
		bs.bubbleSort(arr);
		bs.printArray(arr);

	}

}

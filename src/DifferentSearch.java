
public class DifferentSearch {
	
	public void linearSearch(int arr[] , int key)
	{
		for(int i=0;i< arr.length ; i++)
		{
			if(arr[i]==key)
			{	System.out.println(key + "present at index" + i);
				
			}
			
		}
	
	}

	public static void main(String[] args) {
		DifferentSearch search = new DifferentSearch();
		int[] Arr = {65, 34, 23, 67, 56};
		search.linearSearch(Arr, 34);

	}

}

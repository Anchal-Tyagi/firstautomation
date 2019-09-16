
public class BinarySearchExample {
	
	public static void binarySearch(int arr[], int frst,int last ,int key)
	{
		int mid = (frst+last)/2 ;
		while(frst<last)
		{
		if(key < arr[mid])
		{
			last=mid-1;
					}
		else if (key==arr[mid])
		{
			System.out.println("Key found at Index " + mid);
			break;
		}
		else
			frst= mid+1;
	}
	}

	public static void main(String[] args) {
		int arr[] = {10, 20, 25, 30, 40, 50,60};
		
		int key = 30;
		int first = 0;
		int last = arr.length -1 ;
		binarySearch(arr,first,last,key);

	}

}

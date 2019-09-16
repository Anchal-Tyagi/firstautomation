
public class FindLargestFromArray {

	public static void main(String[] args) {
		int[] a= {4,9,2,18,7};
		int val=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if (a[i]>val)
			{ val=a[i];}
			
			
		}
		System.out.println("Largest value is : " + val);
	}
}

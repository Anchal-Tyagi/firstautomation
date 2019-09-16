import java.util.Scanner;

public class PrimeNumber {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		boolean isPrime  = true ;
		if (n==2 || n==3) {
			isPrime = true ;
		}
		else
		{
		for(int i=2 ; i <= n/2 ;i++)
		{
			if(n%2==0)
			{	isPrime=false;
				break;
			}
		}
		
		}
		 if (isPrime)
			 System.out.println(n + "is Prime number");
		 else 
			 System.out.println(n + "is not a Prime number");
		
	}
}

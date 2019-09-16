import java.util.Scanner;

/*
 * The HCF or GCD of two integers is the largest integer that can exactly divide both numbers (without a remainder).
 */
public class GCDorHCF {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int gcd=1;
		System.out.println("Enter first number");
		int n1 = scan.nextInt();
		System.out.println("Enter second number");
		int n2 =scan.nextInt();
		for(int i=1 ; i<=n1  && i<=n2 ; i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				gcd=i;
				
			}
		}
		
		System.out.println("GCD is :" + gcd);

	}

}

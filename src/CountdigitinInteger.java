import java.util.Scanner;

public class CountdigitinInteger {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int n = scan.nextInt() ;
		
		while(n>=1)
		{
			n= n/10;
			count++;
			
		}
		System.out.println("Total number of digits " + count);
	}

}

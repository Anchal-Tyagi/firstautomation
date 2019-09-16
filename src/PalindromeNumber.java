import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt() ;
		System.out.println(number);
		int temp = number ;
		int r, sum = 0 ;
		
		while(number>0)
		{
			r=number%10;
			sum=(sum*10)+r ;
			number = number/10;
			
		}

		System.out.println("Reversed number is : " + sum);
		
		if(temp==sum)
			System.out.println("the given number is a PALINDROME number");
		else
			System.out.println("the given number is NOT a PALINDROME number");
	}

	

}

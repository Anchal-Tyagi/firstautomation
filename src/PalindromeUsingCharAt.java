import java.util.Scanner;

public class PalindromeUsingCharAt {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in) ;
		String original = scan.nextLine();
		String temp ="" ;
		int length = original.length() ;
		for (int i=(length-1) ; i>=0 ; i--)
		{
			temp = temp + original.charAt(i);
		}
		System.out.println(temp);
		if (original==temp)
			System.out.println("Given string is PALINDROME");
		else 
			System.out.println("Not a Palindrome");
				
		

	}

}

package PracticeString;

import java.util.Scanner;

public class palindromeNum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int r, sum=0;
		int temp=num;
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		
		System.out.println("Reversed number is "+ sum);
		if(sum==temp)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not a Palindrome");

	}

}

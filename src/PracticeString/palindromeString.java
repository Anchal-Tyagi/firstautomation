package PracticeString;

import java.util.Scanner;

public class palindromeString {

	public static boolean checkPalindromeUsingStringBuilder(String str1)
	{
		if(str1==null)
			return false;
		
		StringBuilder sb=new StringBuilder(str1);
		sb.reverse();
		System.out.println(sb);
		return sb.toString().equals(str1); // here tostring function is necessary because else we will be comparing stringbuilder & string
		
	}
	
	public static boolean checkPalindromeUsingString(String str1)
	{
		if(str1==null)
			return false;
	for(int i=0;i<str1.length()/2;i++)
	{
		if(str1.charAt(i)!=str1.charAt(str1.length()-i-1))
		{
			return false;
		}
	}
	return true;	
		
	}
	
	public static boolean checkPalindromByReversing(String str1)
	{
		if(str1==null)
			return false;
		
		int length = str1.length();
		String temp="";
		for(int i=length-1;i>0;i--)
		{
			temp=temp+str1.charAt(i);
		}
		if(str1.equals(temp))
			return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		
		System.out.println(checkPalindromeUsingStringBuilder(str));
		System.out.println(checkPalindromeUsingString(str));
		System.out.println(checkPalindromByReversing(str));
	}

}

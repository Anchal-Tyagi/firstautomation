package stringPracticeQues;

import java.util.Arrays;
import java.util.Scanner;

//Incorect Program

public class CheckAnagram {
	static boolean isAnagram(String str1, String str2)
	{
		System.out.println("I am in metho");
		if(str1.length()!=str2.length())
		{
			return false ;
		}
		else
		{
			char[] char1=str1.toCharArray();
			char[] char2= str2.toCharArray();
			Arrays.sort(char1);
			System.out.println("char 1 : " + char1);
			Arrays.sort(char2);
			System.out.println("char 2 : " + char2);
			
			for(int i =0 ; i<char1.length; i++)
			{
				if (char1[i]!=char2[i])
					return false;
			}
		}
		return true;
		
	}
	

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1 = scan.nextLine();
		System.out.println("Enter second string");
		String str2 = scan.nextLine();
		
		if (isAnagram(str1 , str2))
		{
			System.out.println("the two strings are anagram");
		}
		else
			System.out.println("the two strings are Not anagram");
		
	}
}

package stringPracticeQues;

import java.util.HashMap;
import java.util.Scanner;

//find the maximum occurring character in given String?

public class maxChar {
	
	static void findMaxChar(String str )
	{
		str = str.toLowerCase();
		HashMap<Character , Integer> hMap = new HashMap<>();
		for(int i=0 ; i < str.length();i++)
		{
			if (hMap.isEmpty())
			{ 
				
				hMap.put(str.charAt(i), 1);
			}
			else if (hMap.containsKey(str.charAt(i)))
			{
				hMap.put(Character.toLowerCase(str.charAt(i)), hMap.get(str.charAt(i))+1);
			}
			else
				hMap.put(str.charAt(i), 1);
			
			//(hMap.get(i)!=0)
				//hMap.put(str.charAt(i), value)
						
		}
		System.out.println(hMap);
		int max = 0 ;
		char maxChar= 'a' ;
		
		for(char c : hMap.keySet())
		{
			 if (hMap.get(c)>max)
				{max = hMap.get(c);
				 maxChar = c ;
				}
		}
		
		System.out.println("Character " + maxChar +  "has the maximum occurance of character with total count of" + max);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter you String Here");
		String str = scan.nextLine();
		findMaxChar(str);
	}

}

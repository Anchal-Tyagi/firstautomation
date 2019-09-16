package stringPracticeQues;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class printDuplicateUsingHashMap {
	
	public static void printDuplicates(String word)
	{
		char ch[] = word.toCharArray();
		HashMap<Character, Integer> hMap = new HashMap<Character , Integer>();
		
		for(char c : ch)
		{
			if(hMap.containsKey(c))
			{
				hMap.put(c, hMap.get(c)+1);
			}
			else 
				hMap.put(c, 1);
		}
		
		System.out.println("Printing all duplicates from Array");
		System.out.println(hMap.entrySet());
		
			
		
		for(char key: hMap.keySet())
		{
			if (hMap.get(key)>1)
				System.out.println(key + ":" + hMap.get(key));
		}
		
	}
	
	public static void main(String args[])
	{
		printDuplicates("programming");
	}

}

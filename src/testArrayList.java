import java.util.ArrayList;

/**
 * @author anctyagi
 *
 */
public class testArrayList {

	public static void printList(ArrayList<String> arrList)
	{
		for(int i=0 ; i< arrList.size();i++)
		{
			System.out.println("Words[" +i + "] = " + arrList.get(i));
		}
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> Words = new ArrayList<String>();
		Words.add("String1") ;
		printList(Words);
		
		Words.add(0,"String added via index") ;
		printList(Words);
		
		Words.set(1, "String added via replacing other string");
		printList(Words);
		
		Words.remove(0);
		printList(Words);

	}

}

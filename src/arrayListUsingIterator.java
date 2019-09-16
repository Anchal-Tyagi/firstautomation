import java.util.ArrayList;
import java.util.Iterator;
public class arrayListUsingIterator {

	public static void printListUsingListIterator(ArrayList<String> arrList)
	{
		Iterator<String> iterator = arrList.iterator();
		int i=0;
		while(iterator.hasNext())
		{
			System.out.println("Words["+ i + "] = " + iterator.next());
			i++ ;
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("String1");
		words.add("String2");
		words.add("String3");
		
		//System.out.println(words.get(3)); // to get indexOutOfBoundException
		
		words.ensureCapacity(3); //to ensure that it can hold at least the number of elements specified
		
		words.add("String4");
		System.out.println("printing the arrayList . .. ");
		printListUsingListIterator(words);
		

	}

}

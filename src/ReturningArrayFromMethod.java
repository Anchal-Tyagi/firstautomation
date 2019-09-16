
public class ReturningArrayFromMethod {

	public static void main(String[] args) {
		String[] getArray= returnArray();
		for(String s : getArray)
		{
			System.out.println(s);
		}

	}
	
	static String[] returnArray()
	{
		String aArray[] = {"BMW","TOYOTA","AUDI","HONDA"};
		return aArray;
	}

}

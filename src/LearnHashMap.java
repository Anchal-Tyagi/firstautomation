import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {

	public static void main(String[] args) {
		Map<String , String> objMap = new HashMap<String , String>();
		objMap.put("Name", "Suzuki") ;
		objMap.put("Power", "220");
		objMap.put("Type", "2-wheeler");
		
		System.out.println("Elements of Map :");
		System.out.println(objMap);
		
		//to remove from HashMap		
		objMap.remove("Power");
		System.out.println("Elements after deletion :");
		System.out.println(objMap);
		
		//To Print all keys
		System.out.println("HshMap has following Keys :");
		System.out.println(objMap.keySet());
		
		//To Print all Values
		System.out.println("HashMap has following values");
		System.out.println(objMap.values());
		
		//contains function
		System.out.println(objMap.containsKey("Name"));
		System.out.println(objMap.containsKey("Power"));
		
		System.out.println(objMap.containsValue("Suzuki"));
		
		//to check if HashMap actually contains any key value pair
		System.out.println(objMap.isEmpty());	
	}

}

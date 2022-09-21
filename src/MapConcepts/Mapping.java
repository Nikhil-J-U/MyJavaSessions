package MapConcepts;

import java.util.HashMap;
import java.util.Map;

public class Mapping {

	public static void main(String[] args) {

		HashMap<String, String> empMap = new HashMap<String, String>();
		empMap.put("A","TOM");
		empMap.put("B","Peter");
		empMap.put("C","Robert");
		
		System.out.println(empMap.get("A"));
		
//		HashMap<String,Integer> studentMap = new HashMap<String, Integer>();
//		studentMap.put("tom",100);
//		studentMap.put("peter",200);
//		studentMap.put("peter",300);
//		studentMap.put(null,100);
//		studentMap.put(null,400);
//		
//		studentMap.forEach((k,v) -> System.out.println(k + ":" + v));
//		
//		System.out.println(studentMap.get("peter"));
//		System.out.println(studentMap.get(null));
		

	}

}

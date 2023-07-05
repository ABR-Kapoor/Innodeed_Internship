import java.nio.MappedByteBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_andHaashMap {

	public static void main(String[] args) {
		//  hashMap is hashtable implementation of java's map interface
		// isme key value relation hota hai
		// baki sab set ki tarah hai
		
		Map<String, Integer> mappingNumber= new HashMap<>();
		
		mappingNumber.put("one", 1);
		mappingNumber.put("two", 2);
		mappingNumber.put("three", 3);
		mappingNumber.put("four", 4);
		mappingNumber.put("five", 5);
		mappingNumber.put(null, 6); //it can have only one null key else... value will override on key
		
		
		System.out.println(mappingNumber);
		System.out.println(mappingNumber.isEmpty());
		System.out.println(mappingNumber.size());
		
		if (mappingNumber.containsKey("four")) {
			System.out.println("exists");
		}else {
			System.out.println("not exists");
		}
		if (mappingNumber.containsValue(4)) {
			System.out.println("exists yea");
		}else {
			System.out.println("not exists");
		}
		
		Integer v1= mappingNumber.get("five");
		System.out.println(v1);
		
		mappingNumber.remove("two");
		System.out.println(mappingNumber);
		
		mappingNumber.remove("three", 3);
		
		Set<String> key= mappingNumber.keySet();		// keyset is with Set interface
		System.out.println(key);

		Collection<Integer> values= mappingNumber.values(); 	// but values can be duplicate so, it is collection
		
		for (Map.Entry<String, Integer> entry:  mappingNumber.entrySet()) {
			System.out.println("The Key: "+entry.getKey()+" The value: "+entry.getValue());
		}
		
	}	
}

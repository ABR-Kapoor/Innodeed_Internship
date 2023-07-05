import java.beans.AppletInitializer;
import java.util.HashSet;
import java.util.Set;

public class Set_ {

	public static void main(String[] k) {
		
		// con't contain duplicate values
		// allow null values (waise likedlist bhi krta hai)
		// unordered collection
		// internally uses hashSet to store
		// not thread safe, if multiple threads try to modify a hashset at the same time, the finl outcome is not-deterministic, you must explicity sync concurrent access to the hashset in a multiple threaded environment
		
		 Set <Integer> num= new HashSet<>();
		 
		 num.add(3);
		 num.add(3);
		 num.add(2);
		 num.add(2);
		 num.add(1);
		 num.add(1);
		 System.out.println(num);
		 
//		 baki sari API's iski bakiyo ke jaisi hai

	}

}

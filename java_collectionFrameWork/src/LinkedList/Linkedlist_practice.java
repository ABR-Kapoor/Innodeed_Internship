package LinkedList;

import java.util.LinkedList;
import java.util.List;

// add()
// add([index_num], [element_value])
//addFirst()  // it is from deque interface
// addLast() // --==--

public class Linkedlist_practice {

	public static void main(String[] a) {
			
		// allows:
		// duplication of data
		// manatain inseration order
		// linkedlist implements deque, queue interface, and also used as stack, queue and deque
		//whereas arraylist implements only list
		// it is not thread safe, you must sync concurrrent modification  to the linkedList in a multithread environment
		
		// add and remove operation is faster than arraylist: since arraylist uses arrat in the backgraound 
		// arraylist uses array in the back side
		// LINKEDlist is uses double linkedList to store data
		
		// linkedList consists more space than arraylist -> |1. {previous data pointer} |2.  data |3.  next data pointer|
		
		// arraylist is better for storing and accesing data
		//linkedlist is better for manupulating data
		
		LinkedList<Integer> llist= new LinkedList<>();
		llist.add(10);
		llist.add(20);
		llist.add(90);
		llist.add(null);
		llist.add(40);
//		System.out.println("the original linkedList is: "+ llist);
		
		llist.add(0, 60);
		llist.add(1, 70);
		llist.add(2, 100);
		llist.add(3, 23);
//		System.out.println("the Added using index add() linkedList is: "+ llist);
		
		llist.addFirst(112);
//		System.out.println(llist);
		
		llist.addLast(221);
//		System.out.println(llist);
		
		
//		// to retrive elements from linkedlist, first, last and by index
//		
//		int j= llist.getFirst();  //get first element
//		System.out.println(j);
//		
//		int i= llist.getLast(); // get last element
//		System.out.println(i);
//		
//		int k=llist.get(4);  // get elements by index
//		System.out.println(k+"\n");
		
		//int p= llist.getClass();
		//System.out.println(p);
		
		llist.forEach(n-> System.out.println(n));
		
		// removing elements from linked list
		llist.remove(3);  //remove by index
		System.out.println("\n"+llist);
		
		llist.remove(); //removes the first element
		System.out.println("\n"+llist);
		
		if(llist.contains(50)) {
			
			int i=llist.indexOf(50);
			llist.remove(i);
		}
		System.out.println("\n"+llist);
		
		llist.clear();
		System.out.println(llist);

		
	}

}

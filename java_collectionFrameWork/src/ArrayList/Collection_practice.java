package ArrayList;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class Collection_practice {

	public static void main(String[] args) {
		
		// USE collection for ArrayList
		
//		contract of  the class
//		by default 9 method

//		Collection<String> fruit= new ArrayList<>();
//		fruit.add("banana");
//		fruit.add("apple");
//		fruit.add("mango");
//		fruit.add("popat");
//		System.out.println(fruit);
//		fruit.remove("popat");
//		System.out.println(fruit);
	
//		fruit.forEach(n-> System.out.println(n));
//		System.out.println(fruit.contains("mango"));
		
//		fruit.clear();
//		System.out.println(fruit);
		
		//USE List for ArrayList
		
//		List<String> list= new ArrayList<>(); //dynamic array
//		
//		list.add("one");
//		list.add(null); // it can contain null value as well
//		list.add("two"); 
//		list.add("one"); // duplicating value is allow
//		
//		System.out.println(list); // display in insertion order
//		
//		// to fetch data from List there is .get([index]); 
//		
//		System.out.println(list.get(0)+"\n"+list.get(2));
		
		
//		List<Integer> firstFivePrimeNum= new ArrayList<>();
		
		
//		firstFivePrimeNum.add(2);
//		firstFivePrimeNum.add(3);
//		firstFivePrimeNum.add(5);
//		firstFivePrimeNum.add(7);
//		firstFivePrimeNum.add(11);
		
//		List<Integer> nextFivePrimeNum= new ArrayList<>();
		
//		nextFivePrimeNum.addAll(firstFivePrimeNum);
		
//		nextFivePrimeNum.add(13);
//		nextFivePrimeNum.add(17);
//		nextFivePrimeNum.add(19);
//		nextFivePrimeNum.add(23);
//		nextFivePrimeNum.add(29);
		
//		List<Integer> tenPrimeNumbers= new ArrayList<>(nextFivePrimeNum);  // we can use constractor 
//		tenPrimeNumbers.addAll(nextFivePrimeNum);
																																//or
//		System.out.println(tenPrimeNumbers);													// .addAll([Collection])
		
		// isEmpty() -> true, when list is empty
		// size() -> return, how many element in the list
		// get([index]) -> fetch the value of the given index of the list
		// set([index], [value]) -> reset the value of the given index
		
		
		// remove([index]) or remove([theValue]) -> remove the given index's or the value u passed from list 
		// revoveAll([Collection] or lambda expression) -> remove those u passed them as collection
		
//		List<String> frr= new ArrayList<>();
//		frr.add("something");
//		frr.add("anything");
//		frr.add("nothing");
//		frr.add("everything");
//		
//		System.out.println(frr);

//		List<String> nikal= new ArrayList<>();
//		nikal.add("anything");
//		nikal.add("nothing");
//		
//		frr.removeAll(nikal);
//		
//		System.out.println(frr);
		
		// clear() -> it will remove all elements from the list, become empty 
		
		// to iterator a list we use for, while, loop and see iterator loop
		
		// iterator with while loop
//		for(Iterator<String> i= frr.iterator(); i.hasNext();) {
//			String fr= i.next();
//			System.out.println(fr);
//		}
		
		// stream + lambda + foreach
//		frr.stream().forEach(n-> System.out.println(n));
//		long i= frr.stream().count();
//		System.out.println(i);
		
		// foreach + lambda
//		Consumer<String> laa = n-> System.out.println(n);
//		frr.forEach(laa);// both will run
//		frr.forEach(n-> System.out.println(n));
		
		
		
		//sorting a list
		
//		List<Integer> num= new ArrayList<>();
//		num.add(30);
//		num.add(10);
//		num.add(50);
//		num.add(40);
//		num.add(20);
//		System.out.println("original list: "+num);
//		
//		// there is an API of Collections... and this is not collection interface, its collection class
//		Collections.sort(num);		// ascending order
//		System.out.println("sorted aseceding order: "+num);
//		
//		Collections.reverse(num); //descending order
//		System.out.println("sorted descending order: "+num);
	}

}

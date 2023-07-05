package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Emp_SortListBySalary {

	public static void main(String[] args) {
		
		List<SortList> emp= new ArrayList<>();
		
		emp.add(new SortList(10,"Ramesh",30,400000));
		emp.add(new SortList(20,"Suresh",40,350000));
		emp.add(new SortList(30,"Dhanajay",23,100000));
		emp.add(new SortList(40,"Nusrat",12,20000));
		emp.add(new SortList(50,"Fameer",35,250000));
		
		System.out.println("unsorted list "+emp);
		
//		Collections.sort(emp,new Comparator<SortList>() {
//			@Override
//			public int compare(SortList o1, SortList o2) {
//				return o1.getSalary() - o2.getSalary();
//			}
//			});
//		System.out.println("sorted lists: "+emp); //in ascending order
//		
//		Collections.sort(emp,new Comparator<SortList>() {
//				@Override
//				public int compare(SortList o1, SortList o2) {
//					
//					return o2.getSalary() - o1.getSalary();
//				}
//		});
//		System.out.println("sorted lists in descending order: "+emp);
		
		
		// make them using lambda expression
		
		Collections.sort(emp, (o1,o2) -> o1.getSalary() - o2.getSalary()); // aseceding order
		System.out.println("sorted lists: "+emp); //in ascending order

		
		Collections.sort(emp, (o1,o2) -> o2.getSalary() - o1.getSalary()); // descending order
		System.out.println("sorted lists in descending order: "+emp);
		
		Collections.sort(emp, (o1,o2) -> o1.getName().compareTo(o2.getName())); //alphabetically A to Z
		System.out.println("sort name: "+emp);  
		
		Collections.sort(emp, (o1,o2) -> o2.getName().compareTo(o1.getName()));	//alphabetically Z to A
		System.out.println("sort name: "+emp);  

	}
}
	
//	class ascnSort implements Comparator<SortList>{
//		@Override
//		public int compare(SortList o1, SortList o2) {
//			
//			return o1.getSalary() - o2.getSalary();
//		}
//	}
//	class descnSort implements Comparator<SortList>{
//		@Override
//		public int compare(SortList o1, SortList o2) {
//			
//			return o2.getSalary() - o1.getSalary();
//		}
//	}
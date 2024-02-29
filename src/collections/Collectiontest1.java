package collections;
import java.util.*;


public class Collectiontest1 {
	
	
	public static void main(String[] args) {
		
//		List<String> li=new ArrayList<>();
//		
//		li.add("ayush");
//		li.add("ravi");
//		li.add("ratnesh");
//		li.add("prashant");
//		
//		
//		for(String s:li) {
//			
//			String temp=s;
//			
//			char ch=s.charAt(0);
//			
//			if(ch=='A' || ch=='a') {
//				System.out.println(temp);
//			}
//			
//			
//		}
		
		
		
		List<Integer> li1= Arrays.asList(4,5,2,8);
		
		System.out.println(li1);
		
		
		
		List<Employee> li=new ArrayList<>();
		
		li.add(new Employee(1,"ayush","mit","male"));
		li.add(new Employee(2,"ayushi","mit","male"));
		li.add(new Employee(3,"ayushit","mit","male"));
		li.add(new Employee(4,"ayushst","mit","male"));
		li.add(new Employee(5,"ayushes","mit","male"));
		li.add(new Employee(6,"ayushdh","mit","male"));

		
		
		List<Employee> li3=Arrays.asList( new Employee(2,"as","mit","male"),
				 new Employee(3,"asa","mit","male"));
		
		System.out.println(li3);
		
	}

}


// Array list vs linked listA
// all args constuctor
// no args constructor
// Map
// HashMap
// Hashset
// difference hashset vs hashmap
// 
//
//
//

